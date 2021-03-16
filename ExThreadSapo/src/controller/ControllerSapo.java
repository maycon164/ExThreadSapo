package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ControllerSapo extends Thread{
	
	private int distanciaSalto;
	private int distanciaCorrida;
	private int numSapo;
	
	
	private static List<Integer> rank = new ArrayList<Integer>();
	
	public ControllerSapo() {
		
	}

	public ControllerSapo(int distanciaSalto, int distanciaCorrida, int numSapo) {
		super();
		this.distanciaSalto = distanciaSalto;
		this.distanciaCorrida = distanciaCorrida;
		this.numSapo = numSapo;
	}
	
	@Override
	public void run() {
		iniciarCorrida();

	}
	
	private void iniciarCorrida() {
		int distanciaPercorrida = 0;
	
		while(distanciaPercorrida < distanciaCorrida) {
			int salto = (int) (Math.random() * distanciaSalto) + 1;
			distanciaPercorrida += salto;
			
			System.out.println("Sapo " + numSapo + " Salto: " + salto + " distancia: " + distanciaPercorrida);
		}	
		
		synchronized (rank) {
			rank.add(numSapo);
			System.out.println("Sapo: " + numSapo + " ultrapassou a distancia, Posição: " + rank.lastIndexOf(numSapo));			
		}

		
	}


	public static void mostrarRank() {
		System.out.println(" ===== Rank de chegada ===== ");
		int x = 1;
		for(int sapo: rank) {
			System.out.println("posição # "+x+": "+ "Sapo "+sapo);
			x++;
		}
	}
}
