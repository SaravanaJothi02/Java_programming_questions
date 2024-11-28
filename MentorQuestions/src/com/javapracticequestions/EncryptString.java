package com.javapracticequestions;

import java.util.Scanner;

public class EncryptString {
	public static void main(String[] args) {
//		//Solution 1
//		Scanner in=new Scanner(System.in);
//		Map<Integer,String> map=Map.of(10,"a",11,"b",12,"c",13,"d",14,"e",15,"f");
//		String input=in.next();
//		char c=input.charAt(0);
//		int i=0,cnt=0;
//		String ans="";
//		StringBuilder reverseString = new StringBuilder();
//		while(i<input.length()){
//		    if(input.charAt(i)==c)
//		        cnt++;
//		    else{
//		        ans+=c;
//		        if(cnt>=10 && cnt<=15)
//		            ans+=map.get(cnt);
//		        else
//		            ans+=String.valueOf(cnt);
//		        cnt=1;
//		        c=input.charAt(i);
//		    }
//		    i++;
//		}
//		ans+=c;
//		if(cnt>=10 && cnt<=15)
//		   ans+=map.get(cnt);
//		else
//		   ans+=String.valueOf(cnt);
//	    reverseString.append(ans);
//	    reverseString.reverse();
//	    System.out.println(reverseString);
	    
	    //solution2 
	    Scanner in=new Scanner(System.in);
		String input=in.next();
		char c=input.charAt(0);
		int i=0,cnt=0;
		StringBuilder encryptedString= new StringBuilder();
		while(i<input.length()){
		    if(input.charAt(i)==c)
		        cnt++;
		    else{
		        encryptedString.append(c);
		        encryptedString.append(Integer.toHexString(cnt));
		        cnt=1;
		        c=input.charAt(i);
		    }
		    i++;
		}
	    encryptedString.append(c);
	    encryptedString.append(Integer.toHexString(cnt));
	    encryptedString.reverse();
	    System.out.println(encryptedString);

	}

}
