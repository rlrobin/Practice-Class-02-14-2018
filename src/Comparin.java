
public class Comparin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=4;
		int Comparin=SmallerNum(a,b);
		System.out.println("Larger number is "+Comparin);
		System.out.println("Smaller number is "+SmallerNum(6,21));
		System.out.println("Smaller number is "+SmallerNum(119,112));
		
	}
	public static int SmallerNum(int num1, int num2)
	{
		if (num1>num2)
		{
			return num2;
		}else
		{
			return num1;
		}
	}
	
}
