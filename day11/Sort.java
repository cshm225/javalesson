import java.util.*;
public class Sort{
	public static void main(String[] args){
		/*int[] data={3,1,5,2,7};
			System.out.println(Arrays.toString(data));
			for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
			if(data[i]>data[j]){
			int tmp;
			tmp=data[i];
			data[i]=data[j];
			data[j]=tmp;
			}
			}
			}
			System.out.println(Arrays.toString(data));*/
		int student;
		System.out.print("人数>>");
		student=new Scanner(System.in).nextInt();
		int[] scores=new int[student];
		for(int i=0;i<student;i++){
			scores[i]=new Random().nextInt(101);
		}
		for(int i=0;i<student-1;i++){
			for(int j=i+1;j<student;j++){
				int tmp;
				if(scores[i]<scores[j]){
					tmp=scores[i];
					scores[i]=scores[j];
					scores[j]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(scores));
	}
}
