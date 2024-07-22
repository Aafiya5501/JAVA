import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.print("enter number");
		int n =sc.nextInt();
		boolean prime=true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
			 prime= false;
			break;
		}
		if(prime){
			System.out.print("number is prime");
		}
		else{
			System.out.print("number is not prime");
		}
	}
}