import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor");
		int val1 = sc.nextInt();
		System.out.println("Entre com o segundo valor");
		int val2 = sc.nextInt();
		
		int soma = val1 + val2;
		System.out.println("Soma = " + soma);

		sc.close();
	}

}
