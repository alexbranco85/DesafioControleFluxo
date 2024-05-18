import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

		try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
            	contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
            	System.out.println("O primeiro número deve ser menor que o segundo!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Você deve digitar um número inteiro!");
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;

        if (contagem > 0) {
            int numero = 0;
            do {
                numero++;
                System.out.println("Imprimindo o número " + numero);
            } while (numero < contagem);
        } else {
            throw new ParametrosInvalidosException();
        }
	}
}