package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int num = -30;
		if (num<0)
		{
			System.out.println("The Given number "+num+" is Negative");
			num=num * -1;
		}
		System.out.println("The positive number is:"+num);		
}
}