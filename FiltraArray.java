package my;

import java.util.*;



public class FiltraArray {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int listaX[] = new int[100];
		listaX[0] = 1;
		for (int i=1; i<100; i++)  {
		
			listaX[i] = listaX[i-1] + random.nextInt(10) + 1;
		}
		
		int valor = listaX[random.nextInt(99)];
		int resultado = -1;
		int comeco = 0;
		int fim = 100;
		int contagem = 0;
		System.out.println("Valor selecionado de algum espaço aleatório na ListaX: "+valor);
		
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
		System.out.println("Espaço que contém o valor gerado: listaX["+resultado+"]");
		System.out.println("Número de contagens: "+contagem);
		int cima = resultado+1;
		int baixo = resultado-1;
		System.out.println("Valor de cima (listaX["+cima+"]) "+listaX[resultado+1]);
		System.out.println("Valor de baixo (listaX["+baixo+"]) " +listaX[resultado-1]);
	}

}
