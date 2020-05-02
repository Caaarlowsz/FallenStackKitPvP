package com.fallenstack.fallenkitpvp;

public class Utilites {

    public static boolean isStringInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException exception){
            return false;
        }
    }

}
