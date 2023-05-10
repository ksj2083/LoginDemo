package com.bit.dao;

import com.bit.conf.SqlSessionManager;
import com.bit.vo.BoardAppVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.List;

public class ListDao {

    private static ListDao listDao = new ListDao();
    private SqlSessionFactory sessionFactory= SqlSessionManager.getSqlSessionFactory();

    public static ListDao getListDao() {
        return listDao;
    }


    public List<Object> getList() {
        // TODO Auto-generated method stub
        SqlSession sqlSession=sessionFactory.openSession();
        List<Object> list = null;
        try {
            list = sqlSession.selectList("com.bit.vo.selectEMP");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return list;
    }

    public void insertBoard(BoardAppVO vo) {
        // TODO Auto-generated method stub
        SqlSession sqlSession=sessionFactory.openSession();

        try {
            sqlSession.insert("com.bit.vo.insertBoard", vo);
            sqlSession.commit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
    }
}