package assignments;

public class Demo1 {
		void display() {
			System.out.println("I am display()..");
		}
	}
	class Example1 extends Demo1{
		static int last_roll = 100;
		int roll_no;
		// Constructor
		Example1()
	    {
	        roll_no = last_roll;
	        last_roll++;
	    }
		// Driver code
		public static void main(String args[]) {
			
			Demo1 d1=new Demo1();
			System.out.println(d1);//d1.toString();--->day18.predefinedclasses.objectclass.Demo@234567DFGHJ
			Demo1 d3=new Demo1();
			System.out.println(d3.toString());	//--->day18.predefinedclasses.objectclass.Demo@2345656kjkDFGHJ	
			System.out.println("*************************************");
			Example1 s = new Example1();
			// Below two statements are equivalent
			System.out.println(s);//java complier writes-->s.toString() -->string representation of an object--> FQCN@hexadecimaladdress
			System.out.println(s.toString());//string representation of an object
			System.out.println("***********************************");
			Demo1 d2=new Example1();
			System.out.println(d2);		
		}
	}