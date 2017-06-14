package com.union.red;


public class RedPacket {
public static void main(String[] args) {
	float num=10,N=2.3f;
	int people=10;
	for(int i=0;i<10;i++){
		System.out.println("the number"+people+"can get "+num/people*N);
		num=num-num/people*N;
		people--;
	}
	System.out.println("there remain"+num);
}
}
