package StaticMethods;

public class MethodWithVoid2_Calling {
	static void display() {
		System.out.println("I am display method");
	}
	static void print(char c1) 
	{
		System.out.println("I am print method and printing char as: "+c1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		display();
		display();
		print('c');
		print('c');
		System.out.println("Program Ends");
	}

}
