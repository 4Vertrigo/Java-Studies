package deepeningFundamentals;

import javax.swing.JOptionPane;

public class StringToNumber {

	public static void main(String[] args) {
		
		String anser1 = JOptionPane.showInputDialog("Which was the first grade");
		String anser2 = JOptionPane.showInputDialog("And which was the second grade");
		
		System.out.println(anser1 + anser2);
		
		//Convert string to double
		double grade1 = Double.parseDouble(anser1);
		double grade2 = Double.parseDouble(anser2);
		double finalGrade = (grade1 + grade2)/2;
		
		System.out.println(finalGrade);
	}

}
