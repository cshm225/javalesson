import java.util.*;
public class Ex10{
	public static void main(String[] args){
		int[] numbers={3,4,9};
		int input,i;
		input=new Scanner(System.in).nextInt();
		for(i=0;i<numbers.length;i++){
			if(input==numbers[i]){
				System.out.println("アタリ");
			}
		}
	}
}
