package ap_kadai1;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド

    public static void main(String[] args) {
       System.out.println("０〜2０までのすうじをにゅうりょくしてください");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        try{
        	System.out.println(translateEng(input));
        }catch(Exception e){
          System.out.println("すうじではないです");
        }

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
        String data1[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve", "thirteen", "fourteen",
        		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String s= data1[n];
        return s;

    }

}