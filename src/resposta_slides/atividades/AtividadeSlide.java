package resposta_slides.atividades;

import java.util.Scanner;

public class AtividadeSlide {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = entrada.next();
		
		System.out.println("Bem Vindo, " + nome + "!");
		System.out.println("Digite o número da opção desejada:");
		System.out.println("Opção 1 - Calcular IMC");
		System.out.println("Opção 2 - Calcular Metabolismo Basal");
		System.out.println("Opção 3 - Verificar se um número é par ou ímpar");
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			calcIMC();
			break;
		case 2:
			calcMetaBasal();
			break;
		case 3:
			verParImpar();
			break;
		default:
			System.err.println("Opção inválida ! Reinicie o programa");
			break;
		}
		entrada.close();
	}
	
	
	public static void calcIMC() {
		Scanner entrada2 = new Scanner(System.in);
		
		
		double peso;
		double altura;
		double imc;
		
		System.out.println("Você escolheu Calcular IMC");
		System.out.print("Digite seu peso: ");
		peso = entrada2.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = entrada2.nextDouble();
		
		imc = peso/(Math.pow(altura, 2));
		
		if(imc < 19) {
			System.out.println("Você esta abaixo do peso, seu IMC é: " + imc);
		}else if((imc >= 19) && (imc < 25)) {
			System.out.println("Você esta com o peso normal, seu IMC é: " + imc);
		}else if((imc >= 25) && (imc < 30)) {
			System.out.println("Você esta com sobrepeso, seu IMC é: " + imc);
		}else if((imc >=30) && (imc < 40)) {
			System.out.println("Você esta com obesidade do tipo 1, seu IMC é: " + imc);
		}else {
			System.out.println("Você esta com obesidade mórbida, seu IMC é: " + imc);
		}
		entrada2.close();

	}
	
	
	private static void calcMetaBasal() {
		Scanner entrada3 = new Scanner(System.in);
		
		String sexo;
		int idade;
		double peso;
		double metaBasal;
		
		System.out.println("Você escolheu calcular Metabolismo Basal");
		System.out.print("Digite seu peso: ");
		peso = entrada3.nextDouble();
		System.out.print("Digite sua idade: ");
		idade = entrada3.nextInt();
		System.out.print("Digite seu sexo, coloque 'M' para masculino ou 'F' para feminino: ");
		sexo = entrada3.next();
		
		if(sexo.equals("M")) {
			if((idade <= 18) && (idade < 30)) {
				metaBasal = (15.057 * peso) + 679;
				System.out.println("O seu metabolismo basal é de " + metaBasal + " cal/dia");
			}else if((idade >= 30) && (idade < 60)) {
				metaBasal = (11.6 * peso) + 879;
				System.out.println("o seu metabolismo basal é de " + metaBasal + " cal/dia");
			}else {
				metaBasal = (13.5 * peso) + 487;
				System.out.println("O seu metabolismo basal é de " + metaBasal + " cal/dia");
			}
		}else if(sexo.equals("F")){
			if((idade <= 18) && (idade < 30)) {
				metaBasal = (14.7 * peso) + 486.6;
				System.out.println("O seu metabolismo basal é de " + metaBasal + " cal/dia");
			}else if((idade >= 30) && (idade < 60)) {
				metaBasal = (8.7 * peso) + 829;
				System.out.println("O seu metabolismo basal é de " + metaBasal + " cal/dia");
			}else {
				metaBasal = (10.5 * peso) + 597;
				System.out.println("O seu metabolismo basal é de " + metaBasal + " cal/dia");
			}
		}else {
			System.err.println("Sexo inválido, lembre-se utilizar letras maiúculas");
		}
		entrada3.close();
		
	}
	
	public static void verParImpar() {
		Scanner entrada4 = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite o número (inteiro) que você quer verificar: ");
		numero = entrada4.nextDouble();
		
		if(numero == Math.floor(numero)) {
			if(numero % 2 == 0) {
				System.out.println(numero + " é Par.");
			}else {
				System.out.println(numero + " é Ímpar.");
			}
		}else {
			System.err.println("Entrada inválida!");
		}
		entrada4.close();
		
	}
	
}

