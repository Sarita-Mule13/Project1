package for_loop;

public class FactorsOfpostiveNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
				System.out.println(i + " ");
		}

}
}