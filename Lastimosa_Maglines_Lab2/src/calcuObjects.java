import java.util.Scanner;
public class calcuObjects 	 {
	
	 public calcuObjects(double firstNumber, double secondNumber) {
			this.firstNumber = firstNumber;
			this.secondNumber = secondNumber;
			
	 }
	 
	 //Method Overloading
	 public static double add(double a, double b) {
		 return(a+b);
	 }
	 
	 public static double add(double a, double b, double c) {
		 return(a+b+c);
		 
	 }
	 
	 
	 public static double add(double a, double b, double c, double d) {
		 return(a+b+c+d);
	 }
	 
	 public static double sub(double a, double b) {
		 return(a-b);
	 }
	 
	 public static double sub(double a, double b, double c) {
		 return(a-b-c);
	 }
	 
	 public static double sub(double a, double b, double c, double d) {
		 return(a-b-c-d);
	 }
	 
	 //Method Overriding
	 
	 public static int mult(int a, int b) {
	 return(a*b);
}
	 
	 public static int mult(int a, int b, int c) {
		 return(a*b*c);
	 }
	 
	 public static int mult(int a, int b, int c, int d) {
		 return(a*b*c*d);
	 }
	 
	 public static int div(int a, int b) {
		 return(a/b);
	 }
	 
	 public static int div(int a, int b, int c) {
		 return(a/b/c);
	 }
	 
	 public static int div(int a, int b, int c, int d) {
		 return(a/b/c/d);
	 }
	 
	 
	 
	
		private	 double firstNumber;
		private	 double secondNumber;
			 
			public double getFirstNumber() {
				return firstNumber;
			}
			public void setFirstNumber(double firstNumber) {
				this.firstNumber = firstNumber;
			}
			public double getSecondNumber() {
				return secondNumber;
			}
			public void setSecondNumber(double secondNumber) {
				this.secondNumber = secondNumber;
			}
			
  
			 
		}

