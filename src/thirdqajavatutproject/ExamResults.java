// Sehun Babatunde

package thirdqajavatutproject;

public class ExamResults {
    
	int physics;
	int chemistry; 
	int biology;
	int totalMark; 
	double percentage;
	
	public void DisplayExamResults()
	{
		
		System.out.println("Physics Exam Mark : " + physics);
		
		System.out.println("Chemistry Exam Mark : " + chemistry);
		
		System.out.println("Biology Exam Mark : " + biology);
		
		totalMark = physics + chemistry + biology;
		
		System.out.println("Total Mark : " + totalMark);
		
	}
	
	
	public double CalculateExamResult() 
	{
		//total = (physics + chemistry + biology);
		return percentage = (totalMark  * 100 / 450);
	}
	
	
	
	public int getPhysics() {
		return physics;
	}


	public void setPhysics(int physics) {
		this.physics = physics;
	}


	public int getChemistry() {
		return chemistry;
	}


	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}


	public int getBiology() {
		return biology;
	}


	public void setBiology(int biology) {
		this.biology = biology;
	}


	public int getTotal() {
		return totalMark;
	}


	public void setTotal(int total) {
		this.totalMark = total;
	}


	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	
	
	
	
	
}
