package com.bit.service;

import com.bit.dao.ListDao;
import com.bit.vo.BoardAppVO;

import java.util.Hashtable;
import java.util.List;

public class ListService {

    public List<BoardAppVO> getList() {
        return ListDao.getListDao().getList();
    }


    public Integer getTotalCount(String keyword) {
        return ListDao.getListDao().getTotalCount(keyword);
    }

    public List<BoardAppVO> getListByTitle(Hashtable<String, Object> hashtable) {
        return ListDao.getListDao().getListByTitle(hashtable);
    }

    public void insertBoard(BoardAppVO vo) {
        // TODO Auto-generated method

        ListDao.getListDao().insertBoard(vo);
    }

    public void updateHit(int no) {
        ListDao.getListDao().updateHit(no);

    }

    public BoardAppVO selectDetail(int no) {
        return ListDao.getListDao().selectDetail(no);
    }

}
