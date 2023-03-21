package Controller;

import br.edu.fateczl.quick.Controller_Quick;

public class Quick_Controller {

	public Quick_Controller() {
		super();	
	}
	
	public void QuickOP(int[] vetor, int inicio, int fim) {
		
		Controller_Quick sort = new Controller_Quick();
		
		sort.QS(vetor, inicio, fim);
		
	}
}
