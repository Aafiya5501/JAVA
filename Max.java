import java.util.Scanner;
public class Max{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n1");
		int a = sc.nextInt();
		System.out.print("enter n2");
		int b = sc.nextInt();
		System.out.print("enter n3");
		int c = sc.nextInt();
		if(a>b){
			if(a>c)
				System.out.print("a is max");
			else
				System.out.print("c is large");
		    }
			else{
				if(b>c)
					System.out.print("b is large");
				else
					System.out.print("c is large");
		}
	}
}