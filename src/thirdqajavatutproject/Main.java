// Sehun Babatunde

package thirdqajavatutproject;

public class Main {

	public static void main(String[] args) {

		System.out.println("");
		

		System.out.println("Exam Results");
		
		ExamResults  examgrades = new ExamResults();
		
		examgrades.setPhysics(40);
        examgrades.setChemistry(30);
		examgrades.setBiology(20);
	    examgrades.DisplayExamResults();
	    System.out.println("The total exam percentage is: " + examgrades.CalculateExamResult() + "%");
		
	}

}
