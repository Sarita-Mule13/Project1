package assignments;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float A = 1.20f, B = 2.45f;
System.out.println("***Before Swap****");
System.out.println("Value of A =" + A);
System.out.println("Value of B =" + B);
float C = A;//value of A is assigned to C
A = B;
B = C;
System.out.println("***After Swap****");
System.out.println("Value of A =" + A);
System.out.println("Value of B =" + B);

	}

}
