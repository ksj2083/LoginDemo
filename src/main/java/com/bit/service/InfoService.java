package com.bit.service;

import com.bit.dao.InfoDao;
import com.bit.dao.LoginDao;

import java.util.HashMap;

public class InfoService {

    public HashMap<String, Object> getInfo(String userId) {

        return InfoDao.getInfoDao().getUserInfo(userId);
    }
}
