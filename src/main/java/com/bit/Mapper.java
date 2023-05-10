package com.bit;

import com.bit.controller.*;

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

        if(cmd.equalsIgnoreCase("Search")) {
            return new ListSearchController();
        }

        if(cmd.equalsIgnoreCase("insertBoard")) {
            return new InsertController();
        }

        return null;
    }
}
