import java.util.*;
public class ListLesson{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();
		names.add("John1");
		names.add("John2");
		names.add("John3");
		names.add("John4");

		System.out.println(names.size());//4
		System.out.println(names.get(0));//John1
		names.remove(0);
		System.out.println(names.size());//3
		System.out.println(names);
		
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(11);
		nums.add(12);
		nums.add(13);

		for(int i=0;i<nums.size();i++){
			System.out.println(nums.get(i));

		}
		for(int n:nums){
			System.out.println(n);
		}
		nums.add(0,100);//先頭に挿入
		nums.set(0,1000);//書き換え
		if(nums.isEmpty()){//要素０ならtrue
		}
		if(nums.contains(1000)){//1000をふくむならtrue
		}
		System.out.println(nums.IndexOf(10));//1
		nums.remove(0);
		names.remove("John");
		nums.clear();//alldelete

	}
}
