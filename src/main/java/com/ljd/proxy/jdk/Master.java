package com.ljd.proxy.jdk;

/**
 * Created by user34 on 2018/3/24.
 */
public class Master implements Person {
    private String input1;
    private String input2;
    private String input3;

    public Master(String input1, String input2, String input3){
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }
    public void searchHouse() {
        System.out.println("Master is searching house");
    }

    public String think(String input1, String input2, String input3){
        return "this[" + this.input1 + this.input2 + this.input3 + "] " + input1 + input2 + input3;
    }
}
