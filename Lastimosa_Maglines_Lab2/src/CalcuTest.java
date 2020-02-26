
import java.util.Scanner;

public class CalcuTest {

			public static void main(String[] args) {
						Scanner calculator = new Scanner(System.in);
						
				System.out.println("CALCULATOR W/ Method Overloadings and Overridings & Setters and Getters");
				
				System.out.println("Enter First Number");
				
				double firstNumber = calculator.nextDouble();
				
				System.out.println("Enter Second Number");
				
				double secondNumber = calculator.nextDouble();
				
				System.out.println("Enter Third Number");
				double thirdNumber = calculator.nextDouble();
				
				System.out.println("Enter Fourth Number");
				double fourthNumber = calculator.nextDouble();
			
				
			CalcuObjects2 obj1= new CalcuObjects2(firstNumber, secondNumber, thirdNumber, fourthNumber);
			System.out.println("\nConstructors");
			System.out.println("FirstNumber: " + obj1.getFirstNumber());
			System.out.println("SecondNumber: " + obj1.getSecondNumber());
			System.out.println("Third Number: " + obj1.getThirdNumber());
			System.out.println("Fourth Number: " + obj1.getFourthNumber());
			
			System.out.println("\nMethod Overloading");
			System.out.println("Addition");
			System.out.println("Added First and Second Number: " + obj1.add(firstNumber, secondNumber));
			System.out.println("Added First, second, and third number: " + obj1.add(firstNumber, secondNumber, thirdNumber));
			System.out.println("Added First, second,third, and fourth number : " + obj1.add(firstNumber, secondNumber, thirdNumber, fourthNumber));
			System.out.println("Subtraction");
			System.out.println("Subtracted First, and second number: " + obj1.sub(firstNumber, secondNumber));
			System.out.println("Subtracted First, second, and third number: " + obj1.sub(firstNumber, secondNumber,thirdNumber));
			System.out.println("Subtracted First, second, third, and fourth number: " + obj1.sub(firstNumber, secondNumber,thirdNumber,fourthNumber));
			System.out.println();
			
			System.out.println("\nMethod Overriding");
			System.out.println("Multiplication");
			System.out.println("Multiplied First and second number: " +obj1.mult(firstNumber, secondNumber));
			System.out.println("Multiplied First, second, and third number: " + obj1.mult(firstNumber, secondNumber, thirdNumber));
			System.out.println("Multiplied First, second, third, and fourth number: " + obj1.mult(firstNumber, secondNumber, thirdNumber, fourthNumber));
			System.out.println("Division");
			System.out.println("Divided First and second number: " + obj1.div(firstNumber, secondNumber));
			System.out.println("Divided First, second, and third number: " + obj1.div(firstNumber, secondNumber, thirdNumber));
			System.out.println("Divided First, second, third, and fourth number: " + obj1.div(firstNumber, secondNumber,thirdNumber, fourthNumber));
			
			
			
		
			
			System.out.println("\nSETTERS AND GETTERS");
											
			
										
			Scanner num1= new Scanner(System.in);
			System.out.println("Enter First Number: ");
			obj1.setFirstNumber(num1.nextDouble());
												
			Scanner num2= new Scanner(System.in);
			System.out.println("Enter Second Number: ");
				obj1.setSecondNumber(num2.nextDouble());
				
			Scanner num3 = new Scanner(System.in);
			System.out.println("Enter Third Number: ");
			obj1.setThirdNumber(num3.nextDouble());
			
			Scanner num4 = new Scanner(System.in);
			System.out.println("Enter Fourth Number: ");
            obj1.setFourthNumber(num4.nextDouble());
												
			Scanner operSc= new Scanner(System.in);
			System.out.println("Please choose an Operation from the following:" );
			System.out.println("");
											
			System.out.println("1. Addition \t"+"2.Subtraction \t"+"3. Multiplication \t"+"4. Division\t" );
				int operation= operSc.nextInt();
												
				switch(operation) {
						case 1:
							System.out.println();
							System.out.println(obj1.getFirstNumber() + obj1.getSecondNumber() + obj1.getThirdNumber() + obj1.getFourthNumber());
								break;
												
						case 2:
							System.out.println();
							System.out.println(obj1.getFirstNumber() - obj1.getSecondNumber() - obj1.getThirdNumber() + obj1.getFourthNumber());
							break;
												
						case 3:
							System.out.println();
							System.out.println(obj1.getFirstNumber() * obj1.getSecondNumber() * obj1.getThirdNumber() + obj1.getFourthNumber());
						break;
												
						case 4:
							System.out.println();
							System.out.println(obj1.getFirstNumber() / obj1.getSecondNumber() / obj1.getThirdNumber() + obj1.getFourthNumber());
							break;
												
						default:
												
							System.out.println("You entered an invalid number");
			
							
							
												
				}
					
			
			}
			
	}


