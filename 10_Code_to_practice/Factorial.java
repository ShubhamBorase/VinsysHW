import java.io.*;

class Factorial{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int value;
		int sum = 1;

		System.out.println("Enter a number to find its factorial");

		value = Integer.parseInt(br.readLine());

		if(value != 0){
			for(int i = 1; i<=value; i++){
				sum = sum * i;
			}
			System.out.println(value+"! is "+sum);
		}else if(value==0){
			System.out.println("0! is 1");
		}
	}
}