package Observertest;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
	    private Random random = new Random();//随机数产生器  
	    private int number;   //用于存放数字  
	    //获得数字
	@Override
	public int getNumber() {
		return number;
	}
	@Override
	public void generate() {
		for(int i=0;i<5;i++){
			number = random.nextInt(10);//产生10以内的随机数  
			notifyObservers();//有产生新的数字，通知所有注册的观察者
		}
	}

}
