package com.javapracticequestions;

import java.util.Scanner;

public class BuySellStock {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int prices[]=new int[n];
		int totalProfit=0;
		int i;
	    for(i=0;i<n;i++) {
	    	prices[i]=in.nextInt();
	    }
	    i=1;
	    while(i<prices.length){
	      if(prices[i]>prices[i-1])
	         totalProfit+=prices[i]-prices[i-1];
	      i++;
	      
	    }
		System.out.println(totalProfit);
     }
}
