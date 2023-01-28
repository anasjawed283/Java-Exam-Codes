//Read description for question//
import java.util.Scanner;
class BTD {
	static int binaryToDecimal(int n)
	{
		int num = n;
		int dec_value = 0;
		int base = 1;
		int temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;
			dec_value += last_digit * base;
			base = base * 2;
		}
		return dec_value;
	}
	public static void main(String[] args)
	{
		int num;
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		System.out.println(binaryToDecimal(num));
	}
}
//This code is contributed by Anas Jawed//
