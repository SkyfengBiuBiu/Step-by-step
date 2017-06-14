package com.union.red;

import java.util.ArrayList;
import java.util.List;

public class test {
	
	private static final float MINMONEY = 0.01f;
	private static final float MAXMONEY = 200f;
	private static final float TIMES = 2.1f;

	private boolean isRight(float money, int count){
		float avg = money/count;
		if((avg<MINMONEY)||(avg>MAXMONEY)){
			return false;
		}
		return true;
	}
	
	private float randomRedPacket(float money, float min,float max,
			int count){
		if(count==1) return (float)(Math.round(money*100))/100;
		if(min==max) return min;
		float maxs= max>money?money:max;
		float one=(float)Math.random()*(maxs-min)+min;
		one= (float)(Math.round(one*100))/100;
		float moneyO = money - one;
		float avg = moneyO/(count-1);
		if(avg<MINMONEY){
			return randomRedPacket(money,min, one, count);
		}else if(avg>MAXMONEY){
			return randomRedPacket(money, one, maxs, count);
		}
		return one;
	}
	
	public List<Float> splitRedPackets(float money,  int count){
		if (!isRight(money, count)) return null;
		List<Float> list = new ArrayList<Float>();
		float max = (float)(money*TIMES/count);
		
		max = max>MAXMONEY?MAXMONEY:max;
		int i=0;
		float one=0f;
		while(i++<count){
			one = randomRedPacket(money, MINMONEY, max, count-i);
			list.add(one);
			money-=one;
		}
		return list;
	}
	
	

}
