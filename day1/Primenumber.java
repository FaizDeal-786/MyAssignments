package week1.day1;

public class Primenumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int num = 13;
		
		boolean flag = false;
		
		for(int i =2; i<num; i++)
		{
			
			if(num % i == 0)
			{
				flag = false;
				break;
			}
			
			flag = true;
		}
		
		
		if(flag)
			System.out.println(num + " " + "is a prime number" );
		
		else
			System.out.println(num + " " + "is not a prime number" );
		

	}

}
