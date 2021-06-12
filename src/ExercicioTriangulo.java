import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		//1ª etapa: receber as medidas de 3 lados de um triângulo
		Scanner leitor = new Scanner(System.in);
		Double ladoa, ladob, ladoc;
		System.out.println("Informe a medida do lado a do triângulo");
		ladoa = leitor.nextDouble();
		System.out.println("Informe a medida do lado b do triângulo");
		ladob = leitor.nextDouble();
		System.out.println("Informe a medida do lado c do triângulo");
		ladoc = leitor.nextDouble();
		
		//2ª etapa: validar se o triângulo existe
		
		if((ladoa + ladob > ladoc) && (ladob + ladoc > ladoa) && (ladoa + ladoc > ladob)){
			System.out.println("O triângulo existe");
			//3ª etapa: validar o tipo
			if (ladoa == ladob && ladoa == ladoc) {
				System.out.println("O triângulo é equilátero");
			}else if (ladoa != ladob && ladoa != ladoc && ladob != ladoc) {
				System.out.println("O triângulo é escaleno");
			}else {
				System.out.println("O triângulo é isóceles");
			}
		}else {
			System.out.println("O triângulo não existe");
	    }
		leitor.close();
	}
	
}


