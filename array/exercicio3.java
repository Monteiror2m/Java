package exercicio3;
public class Array2{
	public static void main(String argv[]){
		int cont;
            int dados1[] = {1, 4, 9, 16, 25, 36};
		int dados2[] = new int[6];
		for (cont = 0; cont < dados1.length; cont++ ){
			dados2[cont] = (int) Math.sqrt(dados1[cont]);
			System.out.println("A raiz quadrada de "+dados1[cont]+" é "+ dados2[cont]);
		}
	}
}
