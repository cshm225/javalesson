import java.util.*;
public class StringLesson{
	public static void main(String[] args){
		int count=1;
		System.out.print("答え>>");
		String ans=new Scanner(System.in).nextLine();
		for(int i=0;i<ans.length();i++){
			System.out.printf("%s",ans.charAt(i));
			if(count%5==0){
				System.out.println();
			}
			count++;
		}
			System.out.println();
	}
}
