import java.util.Scanner;
public class Quadratic_Equation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Given quadratic equation : ax^2 + bx + c");
		System.out.print("Enter a : ");
		a=sc.nextInt();
		System.out.print("Enter b : ");
		b=sc.nextInt();
		System.out.print("Enter c : ");
		c=sc.nextInt();
		d=(b*b-4*a*c);
		System.out.println("Given quadratic equation : "+ a+"x^2 + "+b+"x + "+c);
		if(d>0)
		{
			double p=Math.sqrt(d);
			System.out.println("Roots are real and unequal");
			double root1=(-b+p)/(2*a);
			double root2=(-b-p)/(2*a);
			System.out.println("First root is : "+root1);
			System.out.println("Second root is : "+root2);
		}
		else if(d==0)
		{
			System.out.println("Roots are real and equal");
			float root = -c/a;
			System.out.println("Root : "+root);
			
		}
		else
		{
			System.out.println("Roots are imaginary");
		}
	}
}