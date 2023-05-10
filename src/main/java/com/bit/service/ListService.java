package com.bit.service;

import com.bit.dao.ListDao;
import com.bit.vo.BoardAppVO;

import java.util.List;

public class ListService {

    public List<Object> getList() {
        return ListDao.getListDao().getList();
    }

    public void insertBoard(BoardAppVO vo) {
        // TODO Auto-generated method stub
        ListDao.getListDao().insertBoard(vo);
    }
}
