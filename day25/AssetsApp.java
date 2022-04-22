public class AssetsApp{
	public static void main(String[] args){
		Book book=new Book("Javanyuumon",2800,"aka","4235516");
		book.setweight(1300.00);
		System.out.printf("%s\n%d\n%s\n%s\n%.1f\n",book.getName(),book.getprice(),book.getcolor(),book.getisbn(),book.getweight());
	}	
}
interface Thing{

	double getweight();
	void setweight(double weight);
}
abstract class Asset{
	String name;
	int price;
	public Asset(String name,int price){
		this.name=name;
		this.price=price;
	}
	public String getName(){
		return this.name;
	}
	public int getprice(){
		return this.price;
	}
}
abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;
	@Override
	public double getweight(){
		return this.weight;
	}
	@Override
	public void setweight(double weight){
		this.weight=weight;
	}
	public TangibleAsset(String name,int price,String color){
		super(name,price);
		this.color=color;
	}
	public String getcolor(){
		return this.color;
	}

}
class Book extends TangibleAsset{
	String isbn;
	public Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
	public String getisbn(){
		return this.isbn;
	}

}

class Computer extends TangibleAsset{
	String makerName;
	public Computer(String name,int price,String color,String makerName){
		super(name,price,color);
		this.makerName=makerName;
	}
	public String getMakerName(){
		return this.makerName;
	}
}

