package com.bit.controller;

import com.bit.service.InfoService;
import com.bit.service.ListService;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;
import com.bit.vo.BoardAppVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

public class ListController implements Controller {

    ListService listService = new ListService();

    @Override
    public PageMovement execute(HttpServletRequest request, HttpServletResponse response) {

        List<BoardAppVO> list = listService.getList();

        request.setAttribute("list", list);
        return new PageMovement("upload/list_c.jsp", PageMovementType.FORWARD);
    }
}
