import java.io.*;

class PrimeNumber{
	public static void main(String...args)throws IOException{

		boolean flag;

		for(int i = 2; i<=100; i++){
			flag = true;
			for(int j = 2; j<(i/2)+1; j++){
				if((i%j) == 0){
					flag = false;
					break;
				}
			}
			if(flag == true){
				System.out.println(i);
			}
		}
	}
}