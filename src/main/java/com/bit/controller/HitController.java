package com.bit.controller;

import com.bit.service.ListService;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class HitController implements Controller {

    ListService listService = new ListService();

    @Override
    public PageMovement execute(HttpServletRequest request, HttpServletResponse response) {

        int no=Integer.parseInt(request.getParameter("no"));
        String job=request.getParameter("job");

        listService.updateHit(no);

        return new PageMovement("Detail.do?cmd=detail&job="+job+"&no="+no, PageMovementType.REDIRECT);
    }
}
