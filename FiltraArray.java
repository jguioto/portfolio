package my;

import java.util.*;



public class FiltraArray {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int listaX[] = new int[1000];
		listaX[0] = 1;
		for (int i=1; i<1000; i++)  {
		
			listaX[i] = listaX[i-1] + random.nextInt(10) + 1;
		}
		
		int valor = listaX[random.nextInt(999)];
		int resultado = -1;
		int comeco = 0;
		int fim = 1000;
		int contagem = 0;
		
		while (resultado == -1) {
			contagem++;
			int meio = (comeco + fim) / 2;
			if(listaX[meio] == valor) {
				resultado = meio;
			}
			else {
				if(listaX[meio] > valor) {
					fim = meio;
				}
				else {
					comeco = meio;
				}
				
			}
			
		}
		
		System.out.println(resultado);
		System.out.println(contagem);
	}

}
