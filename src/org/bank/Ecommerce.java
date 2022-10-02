package org.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ecommerce {
	
	public static void main(String[] args) {
		System.out.println("OPERATIONS");
		System.out.println("1.DISPLAY STORE PRODUCTS");
		System.out.println("2.EXIT");
		Scanner s= new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("ENTER THE OPERATION");
	
		Products p= new Products(101,"Apple",10);
		Products p1= new Products(102,"Mango",25);
		Products p2= new Products(103,"Brush",5);
		Products p3= new Products(104,"paste",20);
		List<String> string = new ArrayList();
		
		List <Products> l = new ArrayList();
		l.add(new Products(p.getCode(),p.getProduct(),p.getQuantity()));
		l.add(new Products(p1.getCode(),p1.getProduct(),p1.getQuantity()));
		l.add(new Products(p2.getCode(),p2.getProduct(),p2.getQuantity()));
		l.add(new Products(p3.getCode(),p3.getProduct(),p3.getQuantity()));
		int  num=s.nextInt();
		//int num1=1;
		while(num==1) {	
			
		if(num==1) {
			for(Products b:l) {
				b.displayproduct();
				
			}
			
			System.out.println("==================");
			System.out.println("OPERATIONS");
			System.out.println("1.ADD TO CART");
			System.out.println("2.EXIT");
			System.out.println("=================");
			System.out.println("ENTER OPERATION");
			int num1 = s.nextInt();
			while(num1==1) {						
			if(num1==1) {
			System.out.println("ENTER PRODUCT ID ");
			int id = s.nextInt();				
		    if(id==p.getCode()) {
				System.out.println(p.getProduct().toUpperCase()+" ADDED TO CART SUCEESSFULLY");
				string.add(p.getProduct());
				
			}
			else if(id==p1.getCode()) {
				System.out.println(p1.getProduct().toUpperCase()+" ADDED TO CART SUCEESSFULLY");
				string.add(p1.getProduct());
			}
			
			else if(id==p2.getCode()) {
				System.out.println(p2.getProduct().toUpperCase()+" ADDED TO CART SUCEESSFULLY");
				string.add(p2.getProduct());
					 		}
			else if(id==p3.getCode()) {
				System.out.println(p3.getProduct().toUpperCase()+" ADDED TO CART SUCEESSFULLY");
				string.add(p3.getProduct());
				
			}
		    System.out.println("==================");
			System.out.println("OPERATIONS");
			System.out.println("1.ADD TO CART");
			System.out.println("2.REMOVE FROM CART");
			System.out.println("3.EXIT");
			System.out.println("=================");
			System.out.println("ENTER OPERATION");
			int num3=s.nextInt();
			while(num3==1) {
					
				System.out.println("ENTER PRODUCT ID");
				int op3= s.nextInt();
				if(op3==p.getCode()){
					System.out.println(p.getProduct().toUpperCase()+" ADDED TO CART SUCEESSFULLY");					
					string.add(p.getProduct());
			}
				if(op3==p1.getCode()){
					System.out.println(p1.getProduct().toUpperCase()+" ADDED TO CART SUCEESSFULLY");
					// int q2 = p1.getQuantity();
					string.add(p1.getProduct());
				}
				if(op3==p2.getCode()){
					System.out.println(p2.getProduct().toUpperCase()+" ADDED TO CART SUCEESSFULLY");
				//	int q3 = p2.getQuantity();
					string.add(p2.getProduct());
				}
				if(op3==p3.getCode()){
					System.out.println(p3.getProduct().toUpperCase()+" ADDED TO CART SUCEESSFULLY");
				//	int q4 = p3.getQuantity();
					string.add(p3.getProduct());
				}
				System.out.println("ENTER OPERATION");
				num3=s.nextInt();
			}
			
				while(num3==2) {					
					System.out.println("ENTER PRODUCT ID");
					int op9= s.nextInt();
					if(op9==p.getCode()){
						System.out.println(p.getProduct().toUpperCase()+" REMOVED FROM CART SUCEESSFULLY");
					//	int q1 = p.getQuantity();
						
				}
					if(op9==p1.getCode()){
						System.out.println(p1.getProduct().toUpperCase()+" REMOVED FROM CART SUCEESSFULLY");
					//	int q2 = p1.getQuantity();
						
					}
					if(op9==p2.getCode()){
						System.out.println(p2.getProduct().toUpperCase()+" REMOVED FROM CART SUCEESSFULLY");
					//	int q3 = p2.getQuantity();
						
					}
					if(op9==p3.getCode()){
						System.out.println(p3.getProduct().toUpperCase()+" REMOVED FROM CART SUCEESSFULLY");
					//	int q4 = p3.getQuantity();
						
				}
					System.out.println("ENTER OPERATION");
					num3=s.nextInt();
				}
					while(num3==3) {
						System.out.println("EXIT");
						break;
				}
					System.out.println("==================");
					System.out.println("OPERATIONS");
					System.out.println("1.DISPLAY STORE PRODUCTS");
					System.out.println("2.DISPLAY CART ITEMS");
					System.out.println("3.EXIT");
					System.out.println("=================");
					System.out.println("ENTER OPERATION");
					int num6 = s.nextInt();
					while(num6==1) {
						
						for(Products b2:l) {
							b2.displayproduct();
						}
						System.out.println("ENTER OPERATION");
						num6=s.nextInt();
					}
					while(num6==2) {
						System.out.println("ITEM IN CART ");
						for(String cart:string) {
							System.out.println(cart);
						}
						System.out.println();
						System.out.println("ENTER OPERATION");
						num6=s.nextInt();
					}
					while(num6==3) {
						System.out.println("EXIT");
						break;
						
					}
					break;
			}
				
			
			else {
				System.out.println("THANK YOU");
				break;
			}
			
			}
			
			}
			
		break;
		}
	
		}}
//		
//		
