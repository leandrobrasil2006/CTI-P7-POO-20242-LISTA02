package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double  tot_f=0, tot_m=0, cont_ml=00, tot=0, perc;
		int menor_idade = 0, idade, media_idade, soma1=0,  cont_m2=0, cont_fl=0;
		char sexo=' ', exp=' ';
		System.out.println("a sua idade (0 para acabar encerrando);");
		idade = sc.nextInt();
		while(idade !=0) {
			System.out.println("Sexo:");
			System.out.println("M  Masculino | F  feminino");
			sexo = sc.next().charAt(0);
			System.out.println("Tem alguana experiência  no serviço? (S/N)");
			exp = sc.next().charAt(0);
			if (sexo == 'f' & exp == 's') {
				if (tot == 0) {
					menor_idade = idade;
					tot = 1;
				}
				else if (idade < menor_idade) {
					menor_idade = idade;
				}
				
			}
			if (sexo == 'm') {
				tot_m += 1;
			}
			if (sexo == 'f') {
				tot_f += 1;
			}
			if (sexo == 'f' & idade < 21 & exp == 'S') {
				cont_fl +=1;
			}
			if (sexo == 'm' & idade > 45) {
				cont_ml +=1;
			}
			if (sexo == 'm' & exp == 'S') {
				soma1 += idade;
				cont_m2 += 1;
			}
			System.out.println("Digite a idade (0 para encerrar):");
			idade = sc.nextInt();
		}
		System.out.println("Total dos candidatas: "+tot_f);
		System.out.println("Total dos canditados: "+tot_m);
		if (cont_m2 == 0) {
			System.out.println("Nenhum homem com uma experiência");
		}
		else {
			media_idade = soma1 / cont_m2;
			System.out.println("Idade média dos homens que ja tem certa experiência no serviço: "+media_idade+" anos");
		}
		if (tot_m==0) {
			System.out.println("Nenhum homem");
		}
		else {
			perc = cont_ml * 100/tot_m;
			System.out.println("Porcentagem de homens com mais de 45 anos:  "+perc+"%");
		}
		System.out.println("Número de mulheres com a idade inferior a 21 anos(com experiência no serviço): "+cont_fl);
		System.out.println("Menor idade entre as mulheres com experiência: "+menor_idade+" anos");
		}




	}



