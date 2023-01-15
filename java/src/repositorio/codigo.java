package project_javacalculator;
	
import java.util.Scanner;

public class ImcCalculator {
	
public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
	Object p1 = new Object();
		
	System.out.println("Enter your weight: ");
	p1.weight = input.nextDouble();
		
	System.out.println("Enter your height: ");
	p1.height = input.nextDouble();
		
	double imc = p1.weight / (p1.height * p1.height);
		
	System.out.printf("Your IMC is: %.2f \n", imc);
		
	if(imc < 16) {
		System.out.println("Severe Thinness");
	}else if (imc == 16 || imc < 17) {
		System.out.println("Moderate Thinness");
	}else if (imc == 17 || imc < 18.5) {
		System.out.println("light Thinness");
	}else if (imc == 18.5 || imc < 25) {
		System.out.println("Healthy");
	}else if (imc == 25 || imc < 30) {
		System.out.println("Overweight");
	}else if (imc == 30 || imc < 35) {
		System.out.println("Grade I Obesity");
	}else if (imc == 35 || imc < 40) {
		System.out.println("Grade II Obesity (Severe)");
	} else {
		System.out.println("Grade III Obesity (Morbid)");
	}
		
	input.close();
		
	}
}
