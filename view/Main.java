package view;
import controller.ThreadVetor;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {

		Random random = new Random();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1 para ímpar, 2 para par."));
		int vet[] = new int[10];
		
		 for (int i=0; i<vet.length; i++) {
             vet[i] = 1 + random.nextInt(90); 
             System.out.println(vet[i]); 
        }
		
		if (num == 1) {
			ThreadVetor threadvet = new ThreadVetor(num, vet);
		}

		else if (num == 2){
			ThreadVetor threadvet = new ThreadVetor(num, vet);
		}
	
		else {
			System.out.println("Número inválido.");
		}
	}
}

