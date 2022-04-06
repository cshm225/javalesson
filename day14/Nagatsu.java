import java.util.*;
public class Nagatsu{
	public static void main(String[] args){
		char[] code={'A','B','C','D','E'};
		Random r=new Random();
		Random r2=new Random();
		System.out.print("行数>>");
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			int rnd=r.nextInt(10);
			for(int j=0;j<rnd;j++){
				int	rnd2=r.nextInt(5);
				System.out.printf("%s",code[rnd2]);
			}
			System.out.println();
		}
	}
}
