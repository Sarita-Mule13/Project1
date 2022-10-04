package if_else;

public class PostiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S = -10;
		if (S > 0) {
			System.out.println("POSITIVE number");
		} else if (S < 0) {
			System.out.println("NEGATIVE number");
		} else {
			System.out.println("ZERO");
		}
	}

static int Postive(int S) {
	if (S > 0)
	{
	   	 System.out.println("Number is Postive");
	   	 return S;
	   	 }
	     else
	    {
	   	 System.out.println("Number is Negative");
	   	return S;
	    }
}
}