package StaticMethods;

public class NSMethod_WirhReturnType {
	double x = 10, y = 20, z = 30;//NonStatic global Variable
	//methodtype: nonstatic
	boolean checkSameOrNot(int a, int b) {
		boolean res=(a == b);
		return res;
	}
	//method type: static
	static void display() {
		NSMethod_WirhReturnType m2 = new NSMethod_WirhReturnType();
		System.out.println("Input the first number: " + m2.x);
		System.out.println("Input the second number: " + m2.y);
		System.out.println("Input the third number: " + m2.z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am method5 class.........");
		NSMethod_WirhReturnType m1 = new NSMethod_WirhReturnType();
		System.out.println("Input the first number: " + m1.x);
		System.out.println("Input the second number: " + m1.y);
		System.out.println("Input the third number: " + m1.z);
		m1.average(m1.x, m1.y, m1.z);
		// or
		// m1.average(10, 20, 30);
		boolean res = m1.checkSameOrNot(10, 10);
		System.out.println("Is both number same: "+res);
		System.out.println(m1.checkSameOrNot(10,20));
		display();
	}
}

	

