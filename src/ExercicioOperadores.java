import java.util.Scanner;

public class ExercicioOperadores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Double lixo1, lixo2, lixo3;
		System.out.println("Informe o peso do primeiro lixo");
		lixo1 = leitor.nextDouble();
		System.out.println("Informe o peso do segundo lixo");
		lixo2 = leitor.nextDouble();
		System.out.println("Informe o peso do terceiro lixo");
		lixo3 = leitor.nextDouble();
		
		if(lixo1 < lixo2 && lixo1 < lixo3) {
			System.out.println("O lixo 1 é o mais leve e deve ser carregado");
		}else if(lixo2 < lixo1 && lixo2 < lixo3) {
			System.out.println("O lixo 2 é o mais leve e deve ser carregado");
		}else if(lixo3 < lixo1 && lixo3 < lixo2) {
			System.out.println("O lixo 3 é o mais leve e deve ser carregado");
		}else {
			System.out.println("Não foi possível determinar apenas 1 lixo como menor");
	    }
		leitor.close();
	}
	
}


