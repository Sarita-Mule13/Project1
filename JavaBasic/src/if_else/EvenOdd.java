package if_else;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number = 115;
     if(number%2==0)
     {
    	 System.out.println("Number is Even");
     }
      else
     {
    	 System.out.println("Number is Odd");
     }
	}
static int Even(int S) {
if(S%2==0)
    {
   	 System.out.println("Number is Even");
   	 return S;
   	
    }
     else
    {
   	 System.out.println("Number is Odd");
   	return S;
    }
	}
}