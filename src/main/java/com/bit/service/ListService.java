package com.bit.service;

import com.bit.dao.ListDao;
import com.bit.vo.BoardAppVO;

import java.util.List;

public class ListService {

    public List<BoardAppVO> getList() {
        return ListDao.getListDao().getList();
    }

    public List<BoardAppVO> getListByTitle(String keyword) {
        return ListDao.getListDao().getListByTitle(keyword);
    }

    public void insertBoard(BoardAppVO vo) {
        // TODO Auto-generated method stub
        ListDao.getListDao().insertBoard(vo);
    }
}
