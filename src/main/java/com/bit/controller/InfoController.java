package com.bit.controller;

import com.bit.service.InfoService;
import com.bit.service.LoginService;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class InfoController implements Controller {

    InfoService infoService = new InfoService();

    @Override
    public PageMovement execute(HttpServletRequest request, HttpServletResponse response) {

        String userId = request.getSession().getAttribute("id").toString();

        HashMap<String, Object> info = infoService.getInfo(userId);
        System.out.println("info: " + info);
        System.out.println(info.toString());
        request.setAttribute("info", info);
        return new PageMovement("login/info.jsp", PageMovementType.FORWARD);
    }
}
