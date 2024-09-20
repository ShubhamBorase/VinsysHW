import java.io.*;

class ArmStrongNumber{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int value = 0;
		int copy = value;
		int count = 0;
		int sum = 0;
		int rem;
		int copy2;
		int num = 0;
		int num2;
		boolean flag = false;

		System.out.println("Enter a number to check if it is a Armstrong number or not");

		value = Integer.parseInt(br.readLine());
		copy = value;

		while(copy!=0){
			copy = copy / 10;
			count++;
		}

		copy = value;

		while(copy!=0){
			rem = copy % 10;
			copy = copy / 10;
			copy2 = rem;
			num2 = rem;

			for(int i = 1; i<count; i++){
				num2 = num2 * copy2;
			}

			num = num + num2;
		}

		if(num == value){
			flag = true;
		}

		if(flag == true){
			System.out.println("Entered number "+num+" is ArmStrong number");
		}else{
			System.out.println("Entered number "+value+" is not a ArmStrong number");
		}
	}
}