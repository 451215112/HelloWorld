package Observertest;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
	    private Random random = new Random();//�����������  
	    private int number;   //���ڴ������  
	    //�������
	@Override
	public int getNumber() {
		return number;
	}
	@Override
	public void generate() {
		for(int i=0;i<5;i++){
			number = random.nextInt(10);//����10���ڵ������  
			notifyObservers();//�в����µ����֣�֪ͨ����ע��Ĺ۲���
		}
	}

}
