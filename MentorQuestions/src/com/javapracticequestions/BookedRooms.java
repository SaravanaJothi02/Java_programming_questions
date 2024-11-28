package com.javapracticequestions;

import java.util.HashMap;
import java.util.HashSet;

public class BookedRooms {
	public static void main(String[] args) {
//		//solution1
//		 HashMap<String,Character> bookingStatus=new HashMap<>();
//	     String A[]={"+4A", "+5B", "+5A"};
//	     int cnt=0;
//	     for(int i=0;i<A.length;i++){
//	        if(A[i].charAt(0)=='+')
//	           bookingStatus.put(A[i].substring(1,A[i].length()),'b');
//	        else
//	           bookingStatus.put(A[i].substring(1,A[i].length()),'f');
//	     }
//	     for(Character c:bookingStatus.values()){
//	        if(c=='b')
//	           cnt++;
//	        }
//	        System.out.println(cnt);
		
		// solution2
		HashSet<String> hs=new HashSet<>();
	    String A[]={"+4B", "−4B", "+4B", "−4B"};
	    for(int i=0;i<A.length;i++){
	        if(A[i].charAt(0)=='+')
	            hs.add(A[i].substring(1));
	        else
	            hs.remove(A[i].substring(1));
	    }
	    System.out.println(hs.size());
	}

}
