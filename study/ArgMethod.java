public class ArgMethod{
	public static void main(String[] args){
		System.out.println("呼び出します");
		hello("湊");
		hello("浅香");
		System.out.println("呼び出しおわり");
	}
	public static void hello(String name){
		System.out.println(name+"さんこんちわー");
	}
}
