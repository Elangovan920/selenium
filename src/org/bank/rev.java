package org.bank;

public class rev {
	public static void main(String[] args) {
		int a=6;
		int d=2;
		int[] b= new int[a];
		String c="";
		
		b[1]=1;
		b[2]=2;
		b[3]=1;
		b[4]=1;
		b[5]=6;
		b[0]=2;	
			for(int x:b) {
				c=c+String.valueOf(x);			
			}
			System.out.print(a);
			System.out.println(d);
		System.out.print(c.lastIndexOf(String.valueOf(d)));
		
		
		
	}
		
}