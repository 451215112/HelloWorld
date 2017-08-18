package Observertest;

public class maintest {
	public static void main(String[] args) {
		NumberGenerator generator = new RandomNumberGenerator();
		Observerr numobserver = new NumberObserverr();
		Observerr symobserver = new SymbolObserverr();
		generator.addObserver(numobserver);
		generator.addObserver(symobserver);
		generator.generate();
	}
}
