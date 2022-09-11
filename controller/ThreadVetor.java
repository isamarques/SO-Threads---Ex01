package controller;

public class ThreadVetor extends Thread {
	
	public ThreadVetor(int num, int[] vet) {
		
		if (num % 2 == 0) {
			double tempoInicial = System.nanoTime();
			for (int i = 0; i < vet.length; i++) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			System.out.println("Par, tempo total de " + tempoTotal + "s.");
		}
		
		else {
			double tempoInicial = System.nanoTime();
			for (int numero : vet) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			System.out.println("Ímpar, tempo total de " + tempoTotal + "s.");
		}
	}
	
	@Override
	public void run() {
		super.run();
	}
}
