package com.guragai;

public class StringBackWard {
    public void reverseString(String customString){
        if((customString == null) || (customString.length() <= 1))
            System.out.println(customString);
        else{
            System.out.print(customString.charAt(customString.length() - 1));
            reverseString(customString.substring(0,customString.length() - 1));
        }
    }
}
