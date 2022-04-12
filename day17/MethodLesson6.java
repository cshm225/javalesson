import java.util.*;
public class MethodLesson6{
	static void printSquare(char c,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		System.out.print("一文字を入れてください>");
		char c=new Scanner(System.in).next().charAt(0);
		System.out.print("幅を入れてください>");
		int width=new Scanner(System.in).nextInt();
		printSquare(c,width);

	}
}
