public class emp
{
		int age;
		String name,city;
	public static void main(String a[])
	{
		
		System.out.println("Employee details");
		emp e =new emp();
		e.name="sahil";
		e.age=23;
		e.city="Kolhapur";
		e.display();

		emp e1=new emp();
		e1.name="Pranav";
		e1.age=24;
		e1.city="Pune";
		e1.display();

	}
	
	void display()
	{

			System.out.println(name);
			System.out.println(age);
			System.out.println(city);



	}
}
/*output:
	
E:\prac>javac emp.java

E:\prac>java emp
Employee details
sahil
23
Kolhapur
Pranav
24
Pune
*/

