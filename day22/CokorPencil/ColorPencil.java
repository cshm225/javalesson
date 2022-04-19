import java.util.*;
public class ColorPencil{
	static int totalDraw=0;//static はメモリ空間に1個
	String color;
	int length;
	public ColorPencil(String color){
		this(color,5);
	}
	public ColorPencil(String color,int length){
		this.color=color;
		this.length=length;
		this.showStatus();

	}
	public void showStatus(){
		System.out.print(this.color+":");
		for(int i=0;i<this.length;i++){
			System.out.print("-");
		}
		System.out.println(">");
	}
	void draw(){
		if(this.length<=0){
			System.out.println("もう描けません");
			return;
		}
		System.out.printf("%sでかいた\n",this.color);
		totalDraw++;
		this.length--;
		this.showStatus();
	}
	static int getTotalDraw(){
		return totalDraw;
	}
}
