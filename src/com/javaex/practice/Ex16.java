package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			System.out.print("상품가격:");
			int pri = sc.nextInt();
			System.out.print("받은돈");
			int pri2 =sc.nextInt();
			
			System.out.println("===================");
			System.out.println("받은돈"+(double) pri2);
			System.out.println("상품가격"+(double) pri);
			System.out.println("부가세"+(double)pri/10);
			System.out.println("잔액"+ (double)(pri2-pri));

			
			
			
			sc.close();
	}

}
