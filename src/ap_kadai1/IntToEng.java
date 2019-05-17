package ap_kadai1;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド

    public static void main(String[] args) {
       System.out.println("0から100までのすうじをにゅうりょくしてください");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        System.out.println(translateEng(input));
        /*
        try{
        	System.out.println(translateEng(input));
        }catch(Exception e){
          System.out.println("すうじではないです");
        }
        */

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
        String data1[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve", "thirteen", "fourteen",
        		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String number;
        if (n< 20) {
        number = data1[n];
        } else {
        	String s = String.valueOf(n);
        	char c1=s.charAt(1);
        	String s1=String.valueOf(c1);
        	//System.out.println(s1);
        	String t1=data1[Integer.parseInt(s1)];
        	
        	
          String data2[] = {"twenty", "thirty", "forty", "fifty", "sixty",
          "seventy", "eighty", "ninety"};
          char c2=s.charAt(0);
      	  String s2=String.valueOf(c2);
    	 // System.out.println(s2);
    	  int tt=Integer.parseInt(s2) - 2;
    	  String t2=data2[tt];
    	
          if(Integer.parseInt(s1)==0){
    		  number=t2;
    	  }else{
    		//String t2=data2[Integer.parseInt(s2)-3];
    	     number=t2+" "+t1;
    	  }
        }
        
        return number;   

        
    }

}