package com.bit.controller;

import com.bit.service.ListService;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;
import com.bit.vo.BoardAppVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailController implements Controller {

    ListService listService = new ListService();

    @Override
    public PageMovement execute(HttpServletRequest request, HttpServletResponse response) {

        int no=Integer.parseInt(request.getParameter("no"));
        String job=request.getParameter("job");

        if(job!= null && job.equals("detail")) {
            request.setAttribute("detail", listService.selectDetail(no));
            return new PageMovement("upload/detail.jsp", PageMovementType.FORWARD);
        }

        //modify 예정
        return null;
    }
}
