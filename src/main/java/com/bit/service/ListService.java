package com.bit.service;

import com.bit.dao.InfoDao;
import com.bit.dao.ListDao;

import java.util.HashMap;
import java.util.List;

public class ListService {

    public List<Object> getList() {
        return ListDao.getListDao().getList();
    }
}
