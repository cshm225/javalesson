import java.util.*;
public class Book{
	int page;
	int price;
	public Book(int page,int price){
		this.page=page;
		this.price=price;
	}
	public void showInfo(){
		System.out.printf("ページ数:%d\n価格:%d\n",this.page,this.price);
	}
}
class NoteBook extends Book{
	String word="";
	NoteBook(int page,int price){
		super(page,price);
	}
	void write(String word){
		this.word+=word;
	}
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.printf("内容:%s\n",this.word);
	}
}
