
public class Averagess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=0;
		double average=Getavg(a,b,c);
		System.out.println("The average of the 3 numbers are "+Getavg(118,36,22));
		System.out.println("The average of the 3 numbers are "+Getavg(200,6,97));
		
	}
	public static double Getavg (int num1, int num2, int num3)
	{
		double avg=(num1+num2+num3)/3;
		return avg;
	}
}
