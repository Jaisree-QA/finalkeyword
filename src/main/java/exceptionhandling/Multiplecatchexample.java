package exceptionhandling;

import java.lang.reflect.GenericSignatureFormatError;

public class Multiplecatchexample {

	public static void main(String[] args) {
int num1,num2,result;
try {
	num1=2;
	num2=0;
	result=num1/num2;
	System.out.println("Result : ");
}
	//catch(ArithmeticException e) {
	//	System.out.println("Arthmetic exception");
	//}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Array index out of Bound");
}
catch(Exception e) {
	System.out.println("Generic Exception");
}
System.out.println("out of try catch block");

	}

}
