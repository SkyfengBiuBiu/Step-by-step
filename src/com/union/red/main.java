package com.union.red;

import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		test Test = new test();
		System.out.println("Please input the value of money and number:");
		Scanner sc = new Scanner(System.in);
		float num=sc.nextFloat();
		int NUM = sc.nextInt();
		int i=0;

		List<Float> list = Test.splitRedPackets(num, NUM);
		while(i++<list.size()){
			System.out.println("The number"+(i)+"can get"+(list.get(i-1)));
		}

	}

}
