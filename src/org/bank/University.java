package org.bank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public  class University {
         public static void main(String[] args) {
 
//===============================================================================================	
//	 String h="welcome to java";
//	 String h2="";
//	 String h3="";
//	 char cc = h.charAt(0);	
//	 h=h.replaceFirst(String.valueOf(h.charAt(0)), String.valueOf(h.charAt(h.length()-1)));
//	  
//	   char[] ch = h.toCharArray();
//	      ch[ch.length-1]=cc;
//	      for(char hh:ch) {
//	    	  h2=h2+String.valueOf(hh);	    	 
//	      }
//	      String[] sp = h2.split(" ");
//	      String sp1=sp[1];
//	      String sp2="";
//	      
//	      int ll = sp1.length()-1;
//	     for(int s=ll;s>=0;s--) {
//	    	sp2=sp2+ sp1.charAt(s);
//	     }
//	     for(String ff:sp) {
//	    	h3=h3+" "+ff;	    	 
//	     }	     
//	      String replace = h3.replaceFirst(sp1, sp2);
//	      System.out.println(replace);
////=================================================================================================	      
//	      
//	   	      // print duplicate letters
//	      String s="hello";
//	      char[] c = s.toCharArray();
//	      for(int i=0;i<c.length;i++) {
//	    	  int d=0;
//	    	  for(int j=0;j<s.length();j++) {
//	    		  if(c[i]==s.charAt(j)) {
//	    			  d++;
//	    		  }
//	    	  }
//	    	  if(d>1) {
//	    		  s=s.replace(String.valueOf(c[i]), "");
//	    		  System.out.println("Duplicate print..."+c[i]+" = "+d);
//	    	  } 	  
//	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	//====================================================================================================
	      String df="1222333333333488856";
	      
	      char[] cc1 = df.toCharArray();
	      Map<Character, Integer> m= new LinkedHashMap();
	     
	      
	      
	      for(int i=0;i<cc1.length;i++) {
	    	  int a=0;
	    	  for(int j=0;j<df.length();j++) {
	    		  if(cc1[i]==df.charAt(j)) {
	    			  m.put(cc1[i], a++);
	    		  }
	    		  else {
	    			  m.put(cc1[i],a);
	    			 
	    		  }
	    	  }
	    	  m.put(cc1[cc1.length-1],a++);
	      }
	     
	      Set<Entry<Character, Integer>> es = m.entrySet();
	      for(Entry<Character,Integer> x:es) {
	    	  if(x.getValue()==1) {
	    	  System.out.println(x.getKey());
	    	  }
	      }
//=======================================================================================	      
	      
	      
}}
