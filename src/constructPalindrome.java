package com.company;

/**
 * Created by rohandalvi on 4/25/15.
 */
public class constructPalindrome {

    public boolean ifPossiblePalindrome(String str){
        int[] temp = new int[256];
        for(int i=0;i<str.length();i++){
            temp[(int)str.charAt(i)]++;
        }
        int count = 0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]%2!=0){
                count++;
            }

            //System.out.println(temp[i]);
        }
        if(count>1) return false;
        return true;
    }

    public static void main(String args[]){
        if(new constructPalindrome().ifPossiblePalindrome("cabac#")){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
