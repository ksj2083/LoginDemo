package com.bit;

import com.bit.controller.Controller;
import com.bit.controller.InfoController;
import com.bit.controller.ListController;
import com.bit.controller.LoginController;

public class Mapper {

    public Controller getController(String cmd) {

        if(cmd.equalsIgnoreCase("Login")) {
            return new LoginController();
        }

        if(cmd.equalsIgnoreCase("Info")) {
            return new InfoController();
        }

        if(cmd.equalsIgnoreCase("List")) {
            return new ListController();
        }

        return null;
    }
}
