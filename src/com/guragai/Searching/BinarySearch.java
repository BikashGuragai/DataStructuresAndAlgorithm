package com.guragai.Searching;

public class BinarySearch {
    private boolean binarySearchRecursive(int[] array,int x,int left,int right){

        if(left > right){
            return false;
        }

        int mid = (left+right)/2;
        if(x == array[mid]){
            return true;
        }else if(x < array[mid]){
            return binarySearchRecursive(array,x,left,mid - 1);
        }else{
            return binarySearchRecursive(array,x,mid + 1,right);
        }
    }

    public boolean binaraySearchRecursive(int[] array, int x){
        return binarySearchRecursive(array,x,0,array.length - 1);
    }
}
