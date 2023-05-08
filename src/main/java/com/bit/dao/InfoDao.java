package com.bit.dao;

import com.bit.conf.SqlSessionManager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;

public class InfoDao {

    private static InfoDao infoDao = new InfoDao();
    private SqlSessionFactory sessionFactory= SqlSessionManager.getSqlSessionFactory();

    public static InfoDao getInfoDao() {
        return infoDao;
    }


    public HashMap<String, Object> getUserInfo(String userId) {
        // TODO Auto-generated method stub
        SqlSession sqlSession=sessionFactory.openSession();
        HashMap<String, Object> resultMap =null;
        try {
            resultMap=sqlSession.selectOne("com.bit.vo.getUserInfo",userId);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return resultMap;
    }
}