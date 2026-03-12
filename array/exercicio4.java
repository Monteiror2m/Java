package exercicio4;
public class ArrayDiasMes{
	public static void main(String argv[]){
		System.out.println("O número de dias de cada mês do ano é: ");
		diasMes();
      }
	public static void diasMes(){
		int cont;
            int[] dias = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (cont = 0; cont < dias.length; cont++ ){
			System.out.println("O mes "+(cont + 1)+ " possui "+ dias[cont]);
		}
	}
}
