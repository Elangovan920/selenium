package org.webdrver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner l= new Scanner(System.in);
		
		
		int i=2;
		while(i>1) {
			System.out.println("ENTER 1 FOR NEXT STD DETAILS");
		int jj = l.nextInt();
			if (jj==1) {
				System.out.println("NEXT STD DETAILS");
		List <Drivers> stdInfo= new ArrayList();
		int id = l.nextInt();
		String name = l.next();
		long ph = l.nextLong();
		l.nextLine();
		String address = l.nextLine();
		String dOb = l.next();
		String mail = l.next();
		String gen = l.next();
	stdInfo.add(new Drivers(id,name,ph,address,dOb,mail,gen));
		for(Drivers v:stdInfo) {
			v.Student();
		}
		
			}
				else{
					System.out.println("END");
					break;
		
		
		}
		
		
		}
		
	}

}
