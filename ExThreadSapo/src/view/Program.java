package view;

import controller.ControllerSapo;

public class Program {
	public static void main(String[] args) {
		
		for(int x = 1; x <= 5; x++) {
			int valorMaxSalto = (int)(Math.random() * 10) + 1;
			Thread sp = new ControllerSapo(valorMaxSalto, 100, x);
			sp.start();
		}
		
		
		/*Thread sp2 = new ControllerSapo(20, 100, 2);
		Thread sp3 = new ControllerSapo(15, 100, 3);
		Thread sp4 = new ControllerSapo(15, 100, 3);
		Thread sp5 = new ControllerSapo(15, 100, 3);
		
		sp1.start();
		sp2.start();
		sp3.start();
		sp4.start();
		sp5.start();
		
		/*while(sp1.isAlive() || sp2.isAlive() || sp3.isAlive()){
			
		}
		
		ControllerSapo.mostrarRank();
		 */
	}
}
