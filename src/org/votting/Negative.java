package org.votting;

public class Negative {
	public static void main(String[] args) {
	int[] a= {5,8,-8,3,6,1,9,-6};
	int[] cc= new int[a.length];
    int c=0;
    int d=0;
	                                   
	int tem=0;
	for(int x:a) {		
		if(x>=0&&x<=10) {	
		}
		else {
			cc[d++]=x;
		}
		
	}
	
	for(int w:cc) {
		System.out.println(w);
	}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]>a[j]) {
				tem=a[i];
				a[i]=a[j];
				a[j]=tem;
			}
		}
	}
	for(int y:a) {
		System.out.println(y);
		}
}
}