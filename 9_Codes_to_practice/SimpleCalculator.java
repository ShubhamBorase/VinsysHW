import java.io.*;

class SimpleCalculator{

	public static void addNumbers(int a, int b){
		System.out.println(a+" + "+b+" = "+(a+b));
	}

	public static void substractNumbers(int a, int b){
		System.out.println(a+" - "+b+" = "+(a-b));
	}

	public static void multiplyNumbers(int a, int b){
		System.out.println(a+" * "+b+" = "+(a*b));
	}

	public static void divideNumbers(int a, int b){
		System.out.println(a+" / "+b+" = "+(a/b));
	}

	public static void main (String...args) throws IOException{
		
		int valueOne;
		int valueTwo;
		int operation;
		int flag;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do{
			System.out.println("Enter first value");
			valueOne = Integer.parseInt(br.readLine());
			System.out.println("Enter second value");
			valueTwo = Integer.parseInt(br.readLine());

			System.out.println("Choose following option according to Calculation you want to perform \n1 for Addition\n2 for Substraction\n3 for Multiplication\n4 for Division");

			operation = Integer.parseInt(br.readLine());
			if(operation == 1){
				addNumbers(valueOne, valueTwo);
			}else if(operation == 2){
				substractNumbers(valueOne, valueTwo);
			}else if(operation == 3){
				multiplyNumbers(valueOne, valueTwo);
			}else if(operation == 4){
				divideNumbers(valueOne, valueTwo);
			}else{
				System.out.println("You are performing wrong operation");
			}

			System.out.println("Enter 1 to countinue operation else press 0");

			flag = Integer.parseInt(br.readLine());
		}while(flag == 1);
	}
}