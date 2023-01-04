package imc_calculator;

import java.util.Scanner;

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	Test p1 = new Test();
	
	System.out.println("Digite o seu peso: ");
	p1.peso = entrada.nextDouble();
	
	System.out.println("Digite a sua altura: ");
	p1.altura = entrada.nextDouble();
	
	double imc = p1.peso / (p1.altura * p1.altura);
	
	System.out.printf("Seu IMC é: %.2f \n", imc);
	
	if(imc < 16) {
		System.out.println("Magreza grave");
	}else if (imc == 16 || imc < 17) {
		System.out.println("Magreza moderada");
	}else if (imc == 17 || imc < 18.5) {
		System.out.println("Magreza leve");
	}else if (imc == 18.5 || imc < 25) {
		System.out.println("Saudável");
	}else if (imc == 25 || imc < 30) {
		System.out.println("Sobrepeso");
	}else if (imc == 30 || imc < 35) {
		System.out.println("Obesidade Grau I");
	}else if (imc == 35 || imc < 40) {
		System.out.println("Obesidade Grau II (severa)");
	} else {
		System.out.println("Obesidade Grau III (mórbida)");
		}
	
	entrada.close();
	
		}
	}
}
