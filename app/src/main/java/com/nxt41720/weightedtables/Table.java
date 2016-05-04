package com.nxt41720.weightedtables;

public class Table {

    public String rollTable() {
        String result = "";

        int number = (int) Math.random()*6;

        if (number == 1) {
            result = "Option 1";
        } else if (number == 2) {
            result = "Option 2";
        } else if (number == 3) {
            number = (int) Math.random()*2;
            if (number == 1) {
                result = "Option 3.1";
            } else if (number == 2) {
                result = "Option 3.2";
            }
        } else if (number == 4) {
            result = "Option 4";
        } else if (number == 5) {
            result = "Option 5";
        } else if (number == 6) {
            result = "Option 6";
        }

        return result;
    }

}
