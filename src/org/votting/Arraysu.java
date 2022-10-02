package org.votting;

import java.util.LinkedList;
import java.util.List;

public class Arraysu {
	
	
	public static void main(String[]args) {
//	int []a= {1,52,2,4,8,9,6,};
//	int[]b= new int [a.length];
//	int l= b.length;
//	int temp=0;
//	int tem=0;
//	int t=0;
//	int u=0;
//	for(int y:a) {
//		if(y%2==0) {
//			b[tem++]=y;
//		}		
//	}
//	for(int w:b) {
//		if(w==0) {
//			u++;
//		}		
//	}
//	l=b.length-u;	
//	for(int i=0;i<l;i++) {
//		for(int j=0;j<l;j++) {
//			if(b[i]>b[j]) {
//				temp=b[i];
//				b[i]=b[j];
//				b[j]=temp;
//				
//			}
//	}			
//	}			
//for(int i=0;i<a.length;i++) {
//	if(a[i]%2==0) {
//		a[i]=b[t++];
//	}
//}
//for(int x:a) {
//	System.out.println(x);
//}
		
//		
//========================================================================================
//	int a=99;
//	int b=45;
//	int d=0;
//	int u=0;
//	int v=0;
//	int h=0;
//	int m=0;
//	int n=0;
//	int gcd=1;	
//	if(a>b) {
//		d=a;
//	}
//	else {
//		d=b;
//	}
//	int c[]=new int[d];
//	int e[]=new int[d];
//	int g[]=new int[d];
//	c[0]=1;
//	e[0]=1;
//		for(int i=1;i<=a;i++) {
//			if(a%i==0) {
//				c[u++]=i;
//			}
//		}
//		for(int x:c) {
//			if(x==0)
//				break;
//			m++;
//			
//		}
//		for(int i=1;i<=b;i++) {
//			if(b%i==0) {
//				e[v++]=i;
//			}
//		}
//		for(int x:e) {
//			if(x==0)
//				break;
//			n++;
//		}
//			for(int i=0;i<m;i++) {
//				for(int j=0;j<n;j++) {
//					if(c[i]==e[j]) {
//						g[h++]=c[i];
//					}
//				}
//			}
//			for(int i=0;i<d;i++) {
//				if(g[i]>gcd) {
//					gcd=g[i];
//				}
//			}	
//		int lcm= (a*b)/gcd;
//		System.out.println("LCM of given number is "+lcm);	


//=============================================================================

//int a[]= {1,2,3,4,4,5};
//
//       for(int i=0;i<a.length;i++) {
//    	   int c=0;
//    	   for(int j=0;j<a.length;j++) {
//    		   if(a[i]==a[j]) {
//    			   c++;
//    		   }
//    	   }    	   
//    	   System.out.println("count of "+a[i]+" is "+c);
//    	  
//     }
	
	int n= 5;
//	
	for(int i=1,p=1; i<5;i++,p+=1) {
		
		for(int j=i;j<n;j++) {
			System.out.print("  ");
		}
		
		for(int j=0;j<i;j++) {
			int a=65;
			a=a+j;
			char b=(char) a;
			System.out.print(p+" ");
		}
		for(int j=1;j<i;j++) {
			int a=65;
			a=a+j+i-1;
			char b=(char) a;
			System.out.print(p+" ");
		}
		
		System.out.println();
	}
	
	for(int i=1,p=5; i<=5;i++,p-=1) {
		
		for(int j=1;j<i;j++) {
			System.out.print("  ");
		}
		
		for(int j=i;j<=n;j++) {
			int a=65;
			a=a+j;
			char b=(char) a;
			System.out.print(p+" ");
			
		}
		for(int j=i;j<n;j++) {
			int a=65;
			a=a+j+i-1;
			char b=(char) a;
			System.out.print(p+" ");
		}
		
		System.out.println();
	}	
	
	}}

//=====================================================================================





















