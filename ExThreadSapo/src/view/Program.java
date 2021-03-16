package view;

import controller.ControllerSapo;

public class Program {
	public static void main(String[] args) {
		/*Semaphore s = new Semaphore(1);
		Thread sp = null;
		for(int x = 1; x <= 5; x++) {
			int valorMaxSalto = (int)(Math.random() * 10) + 1;
			sp = new ControllerSapo(valorMaxSalto, 100, x);
			sp.start();
		}*/

		Thread sp1 = new ControllerSapo(30, 100, 1);
		Thread sp2 = new ControllerSapo(10, 100, 2);
		Thread sp3 = new ControllerSapo(20, 100, 3);
		Thread sp4 = new ControllerSapo(25, 100, 4);
		Thread sp5 = new ControllerSapo(15, 100, 5);
		
		sp1.start();
		sp2.start();
		sp3.start();
		sp4.start();
		sp5.start();
		
		try {
			sp1.join();
			sp2.join();
			sp3.join();
			sp4.join();
			sp5.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ControllerSapo.mostrarRank();
		
	}
}
