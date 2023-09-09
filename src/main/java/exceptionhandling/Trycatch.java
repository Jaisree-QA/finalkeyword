package exceptionhandling;

public class Trycatch {

	public static void main(String[] args) {
int num[]= {1,2,3,4,5};
try {
num[4]=20/0;
System.out.println(num[4]);
}

catch(ArithmeticException e) {
System.out.println("Arthmetic exception");
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Array index out of Bound");
}
catch(Exception e) {
System.out.println("Generic Exception");
}
System.out.println("out of try catch block");

}
	}


