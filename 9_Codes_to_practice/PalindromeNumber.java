import java.io.*;

class PalindromeNumber{
	public static void main (String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int value;
		int copy;
		int count = 0;
		int paste = 0;

		System.out.println("Enter a number to check if that number is palindrome or not");

		value = Integer.parseInt(br.readLine());
		copy = value;

		while(copy != 0){
			paste = paste * 10 + (copy%10);
			copy = copy / 10;
		}

		if(value == paste){
			System.out.println("Above number "+value+" is palindrome");
		}else{
			System.out.println("Above number "+value+" is not a palindrome");
		}

	}
}