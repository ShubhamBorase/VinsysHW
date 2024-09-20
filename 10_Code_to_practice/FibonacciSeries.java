import java.io.*;

class FibonacciSeries{
	public static void main (String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int value;
		int num1;
		int num2;

		System.out.println("Enter a number greater than 2");

		value = Integer.parseInt(br.readLine());

		num1 = 1;
		num2 = 1;

		System.out.print(" 1, "+"1, ");

		while (num2<value){
			num2 = num1 + num2;
			num1 = num2 - num1;
			if(num2>value){
				break;
			}
			System.out.print(num2+", ");
		}
	}
}