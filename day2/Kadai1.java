public class Kadai1{
	public static void main(String[] args){
		int money;
		money=5000;
		String name="ヒカル";
		System.out.println(name+"は外食をした");
		money=money-1000;
		System.out.println(name+"の所持金は"+money+"円");
		System.out.println(name+"はパチンコに行った");
		money=money+10000;
		System.out.println(name+"の所持金は"+money+"円");
		System.out.println(name+"は財布を落とした");
		money=0;
		System.out.println(name+"の所持金は"+money+"円");
	}
}
