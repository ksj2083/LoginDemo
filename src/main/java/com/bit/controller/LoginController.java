package com.bit.controller;

import com.bit.service.LoginService;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller {

    LoginService loginService = new LoginService();

    @Override
    public PageMovement execute(HttpServletRequest request, HttpServletResponse response) {
        String userId = request.getParameter("id");
        String userPw = request.getParameter("pass");

        System.out.println("id : " + userId);
        System.out.println("pw : "+ userPw);

        if(loginService.loginCheck(userId, userPw)) {
            request.getSession().setAttribute("id", userId);
            request.getSession().setMaxInactiveInterval(600);
            request.setAttribute("state", "T");

            return new PageMovement("login/AjaxLoginView.jsp", PageMovementType.FORWARD);
        }

        request.setAttribute("state", "F");
        return new PageMovement("login/AjaxLoginView.jsp", PageMovementType.FORWARD);
    }
}
