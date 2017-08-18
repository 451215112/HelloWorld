package Observertest;

public class NumberObserverr implements Observerr{
	public void update(NumberGenerator generator) {
	    System.out.println(this);
		System.out.println("numberobserverr============"+generator.getNumber());
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
