import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		//1� etapa: receber as medidas de 3 lados de um tri�ngulo
		Scanner leitor = new Scanner(System.in);
		Double ladoa, ladob, ladoc;
		System.out.println("Informe a medida do lado a do tri�ngulo");
		ladoa = leitor.nextDouble();
		System.out.println("Informe a medida do lado b do tri�ngulo");
		ladob = leitor.nextDouble();
		System.out.println("Informe a medida do lado c do tri�ngulo");
		ladoc = leitor.nextDouble();
		
		//2� etapa: validar se o tri�ngulo existe
		
		if((ladoa + ladob > ladoc) && (ladob + ladoc > ladoa) && (ladoa + ladoc > ladob)){
			System.out.println("O tri�ngulo existe");
			//3� etapa: validar o tipo
			if (ladoa == ladob && ladoa == ladoc) {
				System.out.println("O tri�ngulo � equil�tero");
			}else if (ladoa != ladob && ladoa != ladoc && ladob != ladoc) {
				System.out.println("O tri�ngulo � escaleno");
			}else {
				System.out.println("O tri�ngulo � is�celes");
			}
		}else {
			System.out.println("O tri�ngulo n�o existe");
	    }
		leitor.close();
	}
	
}


