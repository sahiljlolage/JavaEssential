import java.util.Scanner;
public class per
{
	
	
	 public static void main(String[] args) 
	{
		 int m1,m2,m3,m4,m5;
		double p,sum;
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 subjects of marks :");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		sum=m1+m2+m3+m4+m5;
		p=(sum/500)*100;
		System.out.println("Percentage is "+p);
		if(p>90)
		{
			System.out.println("The grade is A+");

		}
		else if(p<=70 && p<=89)
			{
				System.out.println("The grade is A");

			}
		else if(p<=60 && p<=69)
			{
				System.out.println("The grade is B");
			}
			else if(p<=50 && p<=59)
				{
					System.out.println("The grade is C");
				}
				else
					System.out.println("The grade is D");

	}
}

/*output :

E:\prac>javac per.java

E:\prac>java per
Enter the 5 subjects of marks :
55
66
54
44
54
Percentage is 54.6
The grade is A

*/