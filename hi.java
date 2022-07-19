import java.util.Scanner;
class Details
{
	public static void main(String args[])
	{
		String name,address;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your Name ");
		name=obj.nextLine();
		System.out.println("Enter your Address");
		address=obj.nextLine();
		System.out.println("Name : " +name);
		System.out.println("Address : " +address);
	}
}