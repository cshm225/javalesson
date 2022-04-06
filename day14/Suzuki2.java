import java.util.*;
public class Suzuki2{
	public static void main(String[] args){
		int[][] arrA=new int[2][3];
		Random rnd=new Random();
		for(int i=0;i<arrA.length;i++){
			for(int j=0;j<arrA[i].length;j++){
				arrA[i][j]=rnd.nextInt(13)+12;
			}
		}
		System.out.println(Arrays.toString(arrA[0]));
		System.out.println(Arrays.toString(arrA[1]));
	}
}
