package Observertest;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
private ArrayList<Observerr> observers=new ArrayList<Observerr>();//�洢observer
public abstract int getNumber();//��ȡ����  
public abstract void generate();//�������� 

//��ӹ۲���
public void addObserver(Observerr observer){
	observers.add(observer);
 }
//ɾ���۲���
public void delObserver(Observerr observer) {  
    observers.remove(observer);  
}  
//֪ͨ���й۲���
public void notifyObservers(){
	Iterator<Observerr> iterator=observers.iterator();
	while(iterator.hasNext()){
		Observerr ob=iterator.next();
	    System.out.println("--------------------"+this);
		ob.update(this);//�����������this��������ʱ��ʵ����ָ�����������ڴ��ַ��
		//�����������this��ָʵ�ʵ����������������ʵ��������
	}
 }
}
