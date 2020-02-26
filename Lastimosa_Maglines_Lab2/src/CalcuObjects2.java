
public class CalcuObjects2 extends calcuObjects {
	double thirdNumber;
	 double fourthNumber;

	public CalcuObjects2(double firstNumber, double secondNumber) {
			
		super(firstNumber, secondNumber);
	
			
	 }
	
	//Constructor Overloading
	public CalcuObjects2(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
	super(firstNumber, secondNumber);
	this.thirdNumber = thirdNumber;
	this.fourthNumber=fourthNumber;
	}
	

	public double getThirdNumber() {
		return thirdNumber;
	}

	public void setThirdNumber(double thirdNumber) {
		this.thirdNumber = thirdNumber;
	}

	public double getFourthNumber() {
		return fourthNumber;
	}

	public void setFourthNumber(double fourthNumber) {
		this.fourthNumber = fourthNumber;
	}
	
	
	//Method Overriding
	
	public static double mult(double a, double b) {
		return(a*b);
	}
	public static double mult(double a, double b, double c) {
		return(a*b*c);
	}
	
	public static double mult(double a, double b, double c, double d) {
		return(a*b*c*d);
}
	public static double div(double a, double b) {
		 return(a/b);
	}
	
	public static double div(double a, double b, double c) {
		 return(a/b/c);
}
	
	public static double div(double a, double b, double c, double d) {
		 return(a/b/c/d);
	}
}

