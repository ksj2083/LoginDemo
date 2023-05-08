package com.bit.service;

import com.bit.dao.LoginDao;

public class LoginService {
    public boolean loginCheck(String userId, String userPw) {

        String password = LoginDao.getLoginDao().getIdCheck(userId);

        System.out.println("password: " + password);

        if(password != null && password.equals(userPw)) {
            return true;
        }
        return false;
    }
}
