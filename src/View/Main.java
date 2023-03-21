package View;

import javax.swing.JOptionPane;

import Controller.Quick_Controller;

public class Main {

	public static void main(String[] args) {

		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		Quick_Controller qs = new Quick_Controller();
		
		qs.QuickOP(vetor, 0, vetor.length - 1);
		
		JOptionPane.showMessageDialog(null, "A ordenação correta deste vetor utilizando Quick Sort é: "+java.util.Arrays.toString(vetor));
	}

}
