package org.bank;

import java.util.Arrays;

public class Arraysss {
            public static void main(String[] args) {
	      int []a= {2,3,5,3,8,15};
//===============================================================================================
	      //check what two numbers equal to 9 [print only index]
//	  for(int i=0;i<a.length;i++) {
//		  int b=a[i];
//		  for(int j=0;j<a.length;j++) {
//			 int aj=a[j]; 
//			  int c=b+aj;
//			  if(c==9) {
//				  System.out.println(i);
//				  System.out.println(j);
//				  System.out.println();
//			  }
//		  }
//	  }
//===========================================================================================
	      //ascending order
	      int temp=0;
	    for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a.length;j++) {
	    		if(a[i]>a[j]) {
	    			temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    		
	    	}
	    }
       
	    for(int x:a) {
			System.out.println(x);
	    }
	      System.out.println("MINIMUM NUMBER IS "+a[0]);
	      System.out.println("MAXIMUM NUMBER IS "+a[a.length-1]);
	      System.out.println("SECOND MAXIMUM NUMBER IS "+a[a.length-2]);
	      System.out.println("SECOND MINIMUM NUMBER IS "+a[1]);
		
//======================================================================================================
//max number from array
//	      int k=a[0];
//	      for(int i=0;i<a.length;i++) {
//	    	 
//	    	if(  k<a[i]) {
//	              k=a[i];
//	    	}
//	    	
//	      }
//	      System.out.println(k); 
//====================================================================================================
 //DEFAULT METHOD FOR ASCENDING ORDER IN ARRAY [ARRAYS.SORT();]
//	      Arrays.sort(a);
//            for(int as:a) {
//            	System.out.println(as);
//            }
//====================================================================================================            
 //REMOVE DUPLICATES
//	  
//	      Arrays.sort(a);
//	      int c=0;
//	      int k=a.length;
//         for(int i=0;i<a.length-1;i++) {
//        	 if(a[i]!=a[i+1]) {
//        		 a[c++]=a[i];        		
//        	 }         	 
//         }
//         a[c++]=a[k-1];
//         k=c;
//    	//System.out.println(k);
//    	 for(int i=0;i<k;i++) {
//    		 System.out.println(a[i]);
//    	 }
//======================================================================================================    	 
    	
	      
            }}
	      
	      
	      
	      
         
          
            
            
            
            
            
            
            
