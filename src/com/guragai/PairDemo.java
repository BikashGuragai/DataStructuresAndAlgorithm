package com.guragai;

import java.lang.reflect.Parameter;

class Pair<T,S> {

    private T first;
    private S second;

    public Pair(T firstElement, S secondElement){
        first = firstElement;
        second = secondElement;
    }

    public T getFirst(){ return first; }
    public S getSecond(){ return second; }
    public String toString(){ return "(" + first + ", " + second + ")";}
}

public class PairDemo{
    public static void main(String[] args){

        String[] names = {"Tom","Diana","Harry"};
        Pair<String,Integer> result = firstContaing(names,"a");
        System.out.println(result.getFirst());
        System.out.println(result.getSecond());
    }

    public static Pair<String, Integer> firstContaing(String[] strings, String sub){
        for(int i = 0; i < strings.length; i++){
            if (strings[i].contains(sub)){
                return new Pair<String, Integer>(strings[i], i);
            }
        }
        return new Pair<String, Integer>(null,-1);
    }

}