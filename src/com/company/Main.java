package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
       //String message = new String("Hello World");  is the same as ==>
        String name = "Audiesha";
        String message = "         Hello World " + "My Name is" + " " + name;
        System.out.println(message);
        System.out.println(message.endsWith("Audiesha"));
        System.out.println(message.startsWith("O"));
        System.out.println(message.indexOf("i"));
        System.out.println(message.replace("Audiesha","Kyle"));
        System.out.println(message.trim());
        System.out.println("Hello \"Audiesha\"");
        System.out.println("Hello \nAudiesha");
    }
}
