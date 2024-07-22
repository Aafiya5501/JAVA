import java.util.Scanner;
public class Lab_5_3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the sentance : ");
			String s=sc.nextLine();
			if(s.equals("quit"))
			{
				break;
			}
			else{
				CountVowel c=new CountVowel();
				c.count(s);
			}
		}
		CountVowel.print();
	}
}
class CountVowel{
	static	int count_a=0;
	static	int count_e=0;
	static	int count_i=0;
	static	int count_o=0;
	static	int count_u=0;
	static void count(String s)
	{

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a')
			{
				count_a++;
			}
			if(ch=='e')
			{
				count_e++;
			}
			if(ch=='i')
			{
				count_i++;
			}
			if(ch=='o')
			{
				count_o++;
			}
			if(ch=='u')
			{
				count_u++;
			}
		}
	}
	static void print()
	{
		System.out.println(count_a+" "+count_e+" "+count_i+" "+count_o+" "+count_u);
	}
}