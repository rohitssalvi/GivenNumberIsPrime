package givenNumberIsPrime;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		System.out.println("Enter Your Number, Do you Want To check Is prime Or Not");
		Scanner takeinput =new Scanner(System.in);
		int i=takeinput.nextInt();
		CheckPrime ch=new CheckPrime(i);
		if(ch.checkIsPrime())
		  System.out.println("This is a Prime Number");
		else
			System.out.println("This is not a prime Number");
	}

}


class CheckPrime{
	
	Boolean isPrime;
	int counter=0;
	int primeNumber;
	public CheckPrime(int s){
		primeNumber=s;
		
	}
	
	public Boolean checkIsPrime(){
		
		for(int j=primeNumber;j>=1;j--){
			if(primeNumber%j==0)
			{
				counter=counter+1;
			}
		}
		
		if (counter==2) {
			
			isPrime=true;
		} else {
			
			isPrime=false;

		}
		
		
		
		return isPrime;
	}
	
	
}