import java.util.*;
class Vowels
{
	void print()
	{
		System.out.println("the entered letter is ");
	}
}
class letter extends Vowels
{
	void print()
	{
		super.print();
		System.out.println("a vowel");
		
	}
}
class letters extends Vowels
{
	void print()
	{
		super.print();
		System.out.println("not a vowel");
	}
}
public class Runtime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character:");
		char ch=sc.next().charAt(0);
		Vowels obj=new letter();
		Vowels obj2=new letters();
		switch(ch)
		{
			case 'a':
				obj.print();
				break;
			case 'e':
				obj.print();
				break;
			case 'i':
				obj.print();
				break;
			case 'o':
				obj.print();
				break;
			case 'u':
				obj.print();
				break;
				default:obj2.print();
		}
	}

}
