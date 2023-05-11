package com.bit.controller;

import com.bit.service.InfoService;
import com.bit.service.ListService;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;
import com.bit.util.PagingUtil;
import com.bit.vo.BoardAppVO;
import com.bit.vo.PageBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class ListController implements Controller {

    ListService listService = new ListService();


    @Override
    public PageMovement execute(HttpServletRequest request, HttpServletResponse response) {

        String keyword = request.getParameter("keyword") == null ? "" : request.getParameter("keyword");
        Integer curPage =  Integer.parseInt(
                request.getParameter("curPage") == null? "1" : request.getParameter("curPage"));

        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("keyword", keyword);
        hashtable.put("offset", PagingUtil.getPagingUtil().getOffset(curPage, 10));
        hashtable.put("limit", 10);

        List<BoardAppVO> list = listService.getListByTitle(hashtable);
        PageBean pageBean = PagingUtil.getPagingUtil().pagingCreate(listService.getTotalCount(keyword),
                curPage, 10
        );

        request.setAttribute("list", list);
        request.setAttribute("pageBean", pageBean);
        return new PageMovement("upload/list_c.jsp", PageMovementType.FORWARD);
    }
}
