import java.util.*;
public class Kuku{
	public static void main(String[] args){
		int startnum,endnum;
		System.out.print("START");
		startnum=new Scanner(System.in).nextInt();
		System.out.print("START");
		endnum=new Scanner(System.in).nextInt();
		for(int i=startnum;i<=endnum;i++){
			for(int j=1;j<10;j++){
				System.out.printf("%d*%d=%2d ",i,j,i*j);
			}
			System.out.println();
		}

	}
}
