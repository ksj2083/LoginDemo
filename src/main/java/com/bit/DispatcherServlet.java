package com.bit;

import com.bit.controller.Controller;
import com.bit.type.PageMovement;
import com.bit.type.PageMovementType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servlet",urlPatterns = {"*.do"})
public class DispatcherServlet extends HttpServlet {

    Mapper mapper = new Mapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("UTF-8");
        String cmd=request.getParameter("cmd");

        Controller controller = mapper.getController(cmd);
        PageMovement pageMovement = controller.execute(request,response);

        if(pageMovement.getPageMovementType().equals(PageMovementType.REDIRECT)) {
            response.sendRedirect(pageMovement.getUrl());
            return;
        }

        RequestDispatcher rd=request.getRequestDispatcher(pageMovement.getUrl());
        rd.forward(request, response);
    }
}
