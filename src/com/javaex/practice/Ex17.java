package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("반지름:");
		int rr = sc.nextInt();
		
		
		System.out.println("구의 부피는"+(double) 4/3*3.14*(rr*rr*rr)+"입니다");
	

		
		
		
		sc.close();
	}

}
