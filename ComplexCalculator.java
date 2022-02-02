// Complex Calculator Application

import java.util.Scanner;
 public class ComplexCalculator{
	public static void main(String[] args){
		String num1=getInput("Enter a number1:");
		String num2=getInput("Enter a number2:");
		String checker=getInput("select arithmetic operator(+ - * / ):");
		double output=0;

		try{
		     switch(checker){
			  case "+":
				output=sumValues(num1,num2);
				break;
			  case "-":
				output=subtractValues(num1,num2);
				break;
			  case "*":
				output=mulValues(num1,num2);
				break;
			  case "/":
				output=divisionValues(num1,num2);
				break;
			  default:
				System.out.println("In valid operator");
				return;
			  }
			System.out.println("the output is:"+num1+"+"+num2+"="+output);
		}
			catch(Exception a){
				System.out.println(a.getMessage());
			}
	}
			private static double sumValues(String s1, String s2){
				double d1=Double.parseDouble(s1);
				double d2=Double.parseDouble(s1);
				return d1+d2;
			}
			private static double subtractValues(String s1, String s2){
				double d1=Double.parseDouble(s1);
				double d2=Double.parseDouble(s1);
				return d1-d2;
			}
			private static double mulValues(String s1, String s2){
				double d1=Double.parseDouble(s1);
				double d2=Double.parseDouble(s1);
				return d1*d2;
			}	

			private static double divisionValues(String s1, String s2){
				double d1=Double.parseDouble(s1);
				double d2=Double.parseDouble(s1);
				return d1+d2;
			}
			public static String getInput(String prompt){
				System.out.print(prompt);
				Scanner scn=new Scanner(System.in);
				return scn.nextLine();
			}

	}	
	
	









		