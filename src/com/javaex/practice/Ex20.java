package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		System.out.print("500원의 갯수: ");
		int coin = sc.nextInt()*500;
		System.out.print("100원의 갯수: ");
		int coin2 = sc.nextInt()*100;
		System.out.print("50원의 갯수: ");
		int coin3 = sc.nextInt()*50;
		System.out.print("10원의 갯수: ");
		int coin4 = sc.nextInt()*10;
	
		int sum = coin+coin2+coin3+coin4;
		
		System.out.println("동전의 총합은"+ sum +"원 입니다");
	

		
		
		sc.close();
		
	}

}
