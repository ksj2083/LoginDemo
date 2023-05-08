package com.bit.controller;

import com.bit.type.PageMovement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
    PageMovement execute(HttpServletRequest request,
                         HttpServletResponse response);
}
