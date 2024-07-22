import java.util.Scanner;
class student{
	int id_no;
	int no_of_subject_registered;
	int[] subject_code;
	int[] subject_credit;
	String[] grade_obtained;
	Scanner sc=new Scanner(System.in);
	student()
	{
		System.out.print("Enter id : ");
		this.id_no=sc.nextInt();
		System.out.print("Enter no of subject : ");
		this.no_of_subject_registered=sc.nextInt();
		subject_code=new int[no_of_subject_registered];
		subject_credit=new int[no_of_subject_registered];
		grade_obtained=new String[no_of_subject_registered];
		for(int i=0;i<no_of_subject_registered;i++)
		{
			System.out.print("Enter subject_code : ");
			subject_code[i]=sc.nextInt();
			System.out.print("Enter subject_credit : ");
			subject_credit[i]=sc.nextInt();
			System.out.print("Enter grade_obtained : ");
			grade_obtained[i]=sc.next();
		}
	}
	void display()
	{
		System.out.print("0");
	}
	 
}
public class lab6_1{
	public static void main(String[] args){
		int n= Integer.parseInt(args[0]);
		student[] a=new student[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new student();
		}
		for(int i=0;i<n;i++)
		{
			a[i].display();
		}
	}
}