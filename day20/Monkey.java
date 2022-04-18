public class Monkey{
	String name;
	int old;
	public Monkey(String name,int age){
		this.name=name;
		this.old=age;
	}
	public void hello(){
		System.out.printf("こんにちは%s(%d才)です。よろしく！\n",this.name,this.old);
	}
	public void takeuma(){
		System.out.println(this.name+"は上手に竹馬にのった！");
	}
	public void sakadati(){
		System.out.println(this.name+"はひょいと逆立ちをした！");
	}
	public void end(){
		System.out.println("アプリケーションを終了します。");
	}
}
