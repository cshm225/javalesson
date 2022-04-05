import java.util.*;
public class StringPractice{
	public static void main(String[] args){
		System.out.print("整数を,区切りで入力>>");
		String num=new Scanner(System.in).nextLine();
		int sum=0;
		String[] nums=num.split(",");
		for(int i=0;i<nums.length;i++){
			sum+=Integer.parseInt(nums[i]);
		}
		System.out.println(sum);
	}
}
