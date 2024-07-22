import java.util.Scanner;
public class lab4_2{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter String");
        n1=sc.nextLine();
        int c=0;
        int v=0;
        int i=0;
        s=s.toUppercase();
        for(i=0;i<n1.length();i++){
              char ch=n1.charAt(i);
              if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                v++;
              }
              else{
                if(ch>='A'&&ch<='Z')
                    c++;
              }
        }
        System.out.print("v="+v);
        System.ou.print("c="+c);
    }
}