package com.qa.arraytest;

public class Arraytest {

	public static void main(String[] args) {

		
		 int id1, id2, id3, id4, id5, id6, id7, id8; 
		 id1 = 1 ; 
	     id2 = 6 ;
	     id3 = 2 ;
	     id4 = 8 ;
	     id5 = 3 ;
	     id6 = 9 ;
	     id7 = 15 ; 
	     id8 = 0 ;
		// array syntax 
		//datatype[] reference
		int[] ids;
		ids = new int [8];
		ids[0] = 1 ;
		ids[1] = 6 ;
		ids[2] = 2 ;
		ids[3] = 8 ;
	    ids[4] = 3 ;		
		ids[5] = 9 ;
		ids[6] = 15;
		ids[7] = 0 ;
		System.out.println(ids[7]);
		// accessing array elements
		//manipulating array elements
		for (int index = 0 ; index < ids.length; index++) {
		System.out.println(index);
		
	}
	}
}
