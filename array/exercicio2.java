// Objetivo: Trabalhar com arrays.

package exercicio2;
public class Array1{
	public static void main(String argv[]){
		int cont;
            int[] dados = {1, 4, 9, 16, 25, 36};
		for (cont = 0; cont < dados.length; cont++ ){
			System.out.println("O elemento de índice "+cont+" vale "+ dados[cont]);
		}
	}
}

