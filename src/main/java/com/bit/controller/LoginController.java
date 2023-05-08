package com.bit.controller;

import com.bit.service.LoginService;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class LoginController implements Controller {

    LoginService loginService = new LoginService();

    @Override
    public PageMovement execute(HttpServletRequest request, HttpServletResponse response) {
        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        if(loginService.loginCheck(userId, userPw)) {
            request.getSession().setAttribute("id", userId);
            request.getSession().setMaxInactiveInterval(60);

            return new PageMovement("list.do?cmd=list", PageMovementType.REDIRECT);
        }

        return new PageMovement("login/loginIndex.jsp", PageMovementType.FORWARD);
    }
}
