package com.guragai;

import java.util.ArrayList;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A','B','C');
        ArrayList[] test = new ArrayList[10];
    }

    public static void doTowers(int topN, char from, char inter, char to){
        if(topN == 1){
            System.out.println("Disk 1 from " + from + "to " + to);
        }else{
            doTowers(topN - 1,from,to,inter);
            System.out.println("Disk " + topN + "fr");
        }
    }
}
