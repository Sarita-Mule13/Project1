package StaticMethods;

public class NSMethod_Void1 {
	int age;
	public void display() {
		System.out.println("I am display() of Method03 class and age value is: "+age);
	}
	public void display(int a) {
		age=a;
		System.out.println("I am display(int) of Method03 class and age value is: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NSMethod_Void1 m2=new NSMethod_Void1();//yes,object got created and with the help m1 reference we can access it's members
		System.out.println("age: "+m2.age);//age=0
		m2.display();//age=0	
		m2.display(25);//age=25	
		System.out.println("age: "+m2.age);//25
		
		NSMethod_Void1 m3=new NSMethod_Void1();//yes,object got created and with the help m1 reference we can access it's members
		m3.display(75);//age=75
		System.out.println("age: "+m3.age);//age=75
		m3.display();//age=75
				
	}

}
