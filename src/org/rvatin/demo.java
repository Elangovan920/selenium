package org.rvatin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		
		List <Bus>buses= new ArrayList();
		buses.add(new Bus(1,true,45,"cs"));
		buses.add(new Bus(2,true,67,"s"));
		buses.add(new Bus(1,false,90,"cs"));
		buses.add(new Bus(4,false,55,"s"));
		buses.add(new Bus(5,true,43,"cs"));
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		int num=1;
		while(num==1) {
			System.out.println("ENTER 1 TO BOOKING AND 2 TO EXIT");
			Scanner no= new Scanner(System.in);
			int nos = no.nextInt();
			if(nos==1) {
				System.out.println("booking");
				
			}
			else {
				System.out.println("THANK YOU");
				break;
			}
		}
		
	}

}
