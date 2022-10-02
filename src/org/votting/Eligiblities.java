package org.votting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Eligiblities {
	
	public static void main(String[] args) {
//	String s1 = "Go ZOHO";
//	String ff = "";
//		int in = s1.indexOf(" ");
//		for(int i=s1.length()-1;i>=0;i--) {
//			char cc = s1.charAt(i);			
//			ff = ff+String.valueOf(cc);			
//		}
//	     String rep = ff.replaceAll(" ", "");		
//		String substring = rep.substring(in);
//		String substring2 = rep.substring(0,in);	
//		System.out.println(substring2+" "+substring);
//	    
////=================================================================================================
//	   String s= "FADE";
//	   int c=0;
//		int c1=0;
//		String q="";
//		char[] ca = s.toCharArray();
//		for(char x:ca) {
//			  c=x-65;
//			 c1=90-c;
//			 char ss=(char)c1;
//			String of = String.valueOf(ss);
//			q=q+of;
//		}		
//		System.out.println(q);
//	
//	
////================================================================================================
//       String s3="heeeeeeeeeeeeeelloo";
//       String fi="";
//       int co=0;
//       int cc=0;
//       char[] a = s3.toCharArray();
//       int co1=a.length;
//       
//       for(int i=0;i<a.length-1;i++) {
////    	  
//    		  if(a[i]!=a[i+1]) {
//    			  a[co++]=a[i];
//    		  
//   	   }
//    		  
//    		 
//       }
//       a[co++]=a[co1-1];
//		  co1=co;
//		  
//
//for(int j=0;j<co;j++) {
//	System.out.println(a[j]);
//}

// ================================================================================================
//String s4="elangovan";
//String s5="";
//String s7="";
//String s8="";
//for(int i=0;i<s4.length();i++) {
//	char c11 = s4.charAt(i);
//	String	 s6 = String.valueOf(c11);
//	if(c11=='e'||c11=='g') {
//		 s7 = s6.toUpperCase();
//		s6=s7;
//	}
//	
//	s5=s5+s6;
//}
//System.out.println(s5);
////==============================================================================================
//String s= "hhappy";
//char[] c = s.toCharArray();
//for(int i=0;i<c.length;i++) {
//	int count =0;
//	for(int j=0;j<s.length();j++) {
//		if(c[i]==s.charAt(j)) {
//			count++;
//			
//		}
//		
//	}
//	if(count>=1) {
//	s = s.replace(String.valueOf(c[i]),"");	
//	System.out.println(c[i]+" = "+count);
//	}
//}
//
//==================================================================================

		
////=============================================================================================			
//		int n=5;
//	for(int k=1,p=9;k<n;k++,p-=2) {
//		for(int l=1;l<=k;l++) {
//			System.out.print("  ");
//		}
//        for(int l=k;l<=n;l++) {
//			System.out.print(p+" ");
//		}
//        for(int l=k;l<n;l++) {
//        	System.out.print(p+" ");
//        }
//		System.out.println();
//////	===========================================================================================	
//	}
//	
//	for(int i=1,p=1;i<=n;i++,p+=2) {
//	for(int j=i;j<=n;j++) {
//		System.out.print("  ");
//	}
//	for(int j=1;j<=i;j++) {
//		int a=j+64;
//		char c=(char)a;
//		System.out.print(p+" ");
//	}
//	for(int j=1;j<i;j++) {
//		int a=j+64+i;
//		char c=(char)a;
//		System.out.print(p+" ");
//	}
//	
//	System.out.println();
//	}
////=====================================================================	
//	int []a= {3,6,-5,1,9,5,2,-3};
//	int b[]= new int[a.length];
//	int d[]= new int[a.length];
//	int c=d.length;
//	int e=0;
//	int u=0;
//	int v=0;
//	Arrays.sort(a);
//	for(int x:a) {
//		if(x>=1) {
//			b[u++]=x;
//		}
//		else {
//			c--;
//			d[e++]=x;			
//		}	
//	}
//	for(int i=a.length-1;i==0;i--) {
//		
//		
//	}
//	for(int z:b) {
//		System.out.println(z);
//	}
//=======================================================================================		
	
//	Scanner s = new Scanner(System.in);
//	System.out.println("ENTER THE LENGTH OF ARRAY");
//	int len = s.nextInt();
//	int b= 0;
//	int c= 0;
//	int a[]= new int[len];
//	while(b<len) {
//		System.out.println("ENTER THE NUMBER IN ARRAY");
//		int len1 = s.nextInt();
//		a[b++]=len1;
//		
//	}
//	for(int x:a) {
//		System.out.println(x);
//		c=c+x;
//	}
//	System.out.println("SUM OF ELEMENTS IS "+c);
//	System.out.println("HAPPY CODING");
//	=====================================================================================
//		Scanner s = new Scanner(System.in);
//		System.out.println("ENTER THE LENGTH OF ARRAY 1");
//		int len = s.nextInt();
//		System.out.println("ENTER THE LENGTH OF ARRAY 2");
//		int len2 = s.nextInt();
//		int b= 0;
//		int b1= 0;
//		int b2= 0;
//		int c= 0;
//		int a[]= new int[len];
//		int g[]= new int[len2];
//		int h[]= new int[len+len2];
//		while(b<len) {
//			System.out.println("ENTER THE NUMBER IN ARRAY");
//			int len1 = s.nextInt();
//			a[b++]=len1;
//			
//		}
//		while(b1<len2) {
//			System.out.println("ENTER THE NUMBER IN ARRAY2");
//			int len1 = s.nextInt();
//			g[b1++]=len1;
//			
//		}
//		for(int x:a) {
//			h[b2++]=x;
//			
//		}
//		for(int x:g) {
//			h[b2++]=x;
//			
//		}
//		for(int x:h) {
//			System.out.println(x);
//			
//		}
//=================================================================================		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a string");
//		String str = sc.next();
//		
//	  String s1 = String.valueOf(str.charAt(0)).toUpperCase(); 
//	  
//	   String s2 = String.valueOf(str.charAt(str.length()-1)).toUpperCase(); 
//	String r1 = str.replace(String.valueOf(str.charAt(0)), s2);
//	String r2 = r1.replace(String.valueOf(str.charAt(str.length()-1)), s1);
//	System.out.println(r2);
////================================================================    
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
		String str = sc.nextLine();	
		char[] ch = str.toCharArray();
		for(char x:ch) {
			if(x==' ') {
				x='*';
			}
			System.out.print(x);	
		}
	}}
		
		//==o/p===
//Enter a string
//pen cil art is
//pen*cil*art*is
//==================================
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
