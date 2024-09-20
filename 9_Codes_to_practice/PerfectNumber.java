import java.io.*;

class PerfectNumber{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int value;
		int sum = 0;

		System.out.println("Enter a number to check if it is a perfect number or not");

		value = Integer.parseInt(br.readLine());

		for(int i = 1; i<(value/2)+1; i++){
			if ((value % i) == 0){
				sum = sum+i;
			}
		}

		if(sum == value){
			System.out.println("Given number "+value+" is a perfect number");
		}else {
			System.out.println("Given number "+value+" is not a perfect number");
		}
	}
}