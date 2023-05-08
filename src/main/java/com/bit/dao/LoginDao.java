package com.bit.dao;

import com.bit.conf.SqlSessionManager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class LoginDao {

    private static LoginDao loginDao = new LoginDao();
    private SqlSessionFactory sessionFactory= SqlSessionManager.getSqlSessionFactory();

    public static LoginDao getLoginDao() {
        return loginDao;
    }


    public String getIdCheck(String userId) {
        // TODO Auto-generated method stub
        SqlSession sqlSession=sessionFactory.openSession();
        String dbPass=null;
        try {
            dbPass=sqlSession.selectOne("com.bit.vo.getIdCheck",userId);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return dbPass;
    }
}