import java.util.Scanner;

public class Comparador {

	public static void main(String[] args) {
		
		double n1,n2,n3,n4,n5, maior = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		n1= sc.nextDouble();
		System.out.println("Digite o segundo número:");
		n2= sc.nextDouble();
		System.out.println("Digite o terceiro número:");
		n3= sc.nextDouble();
		System.out.println("Digite o quarto número:");
		n4= sc.nextDouble();
		System.out.println("Digite o quinto número:");
		n5= sc.nextDouble();
		
		if (n1>=n2 && n1>=n3 && n1>=n4 && n1>=n5) {
			System.out.println("O maior número é:" + n1);
			maior = n1;
		}else if (n2>=n1 && n2>=n3 && n2>=n4 && n2>=n5) {
			maior = n2;
			System.out.println("O maior número é:" + n2);
		}else if (n3>=n1 && n3>=n2 && n3>=n4 && n3>=n5) {
			maior = n3;
			System.out.println("O maior número é:" + n3);
		}else if (n4>=n1 && n4>=n2 && n4>=n3 && n4>=n5) {
			maior = n4;
			System.out.println("O maior número é:" + n4);
		}else if (n5>=n1 && n5>=n2 && n5>=n3 && n5>=n4) {
			maior = n5;
			System.out.println("O maior número é:" + n5);
		}
		
		System.out.println("O resultado do maior número dividido por 2 é: " + maior/2);
		
	}

}
