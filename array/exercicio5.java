package exercicio5;
public class Media3 {
	public static void main(String argv[]){
		System.out.println("Cálculo da média de 4 notas: "); 
		calculaMedia();
	}

	public static void calculaMedia(){
		double soma = 0;
		double notas[] = new double[4];
		int cont;
		for (cont = 0; cont < notas.length; cont++){
		 	notas[cont] = Math.random()*10;
		}
		for (cont = 0; cont < notas.length; cont++){
			soma += notas[cont];
		 	System.out.println("A nota "+ (cont+1) +" vale: "+notas[cont]); 
		}
		soma /= 4;
		System.out.println("A média é: "+soma);
	}
}
