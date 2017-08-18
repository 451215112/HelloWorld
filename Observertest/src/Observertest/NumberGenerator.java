package Observertest;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
private ArrayList<Observerr> observers=new ArrayList<Observerr>();//存储observer
public abstract int getNumber();//获取数字  
public abstract void generate();//产生数字 

//添加观察者
public void addObserver(Observerr observer){
	observers.add(observer);
 }
//删除观察者
public void delObserver(Observerr observer) {  
    observers.remove(observer);  
}  
//通知所有观察者
public void notifyObservers(){
	Iterator<Observerr> iterator=observers.iterator();
	while(iterator.hasNext()){
		Observerr ob=iterator.next();
	    System.out.println("--------------------"+this);
		ob.update(this);//抽象类里面的this，在运行时期实质上指向的是子类的内存地址！
		//抽象类里面的this是指实际调用中它的派生类的实例化对象
	}
 }
}
