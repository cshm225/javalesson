import java.util.*;
import java.io.*;
public class Meibo{
	public static void main(String[] args)throws Exception{
		ArrayList<Person> list=new ArrayList<>();
		FileInputStream fis=new FileInputStream("dummy.csv");
		InputStreamReader isr=new InputStreamReader(fis,"shift_jis");
		BufferedReader br=new BufferedReader(isr);
		String line;
		line=br.readLine();
		System.out.println(line);
		while((line=br.readLine())!=null){
			String data[]=line.split(",");
			//Person p1=new Person(data[0],data[1],Integer.parseInt(data[2]));
			list.add(new Person(data[0],data[1],Integer.parseInt(data[2])));
		}
		br.close();
		for(Person p:list){
			p.ShowInfo();
		}
		sort(list);
		System.out.println();
		for(Person p:list){
			p.ShowInfo();
		}
	}
	static void sort(ArrayList<Person> list){
		for(int i=0;i<list.size()-1;i++){
			for(int j=i+1;j<list.size();j++){
				Person tmp;
				if(list.get(i).age<list.get(j).age){
					tmp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,tmp);
				}
			}
		}
	}
}
	class Person{
		String name;
		String email;
		int age;
		Person(String name,String email,int age){
			this.name=name;
			this.email=email;
			this.age=age;
		}
		void ShowInfo(){
			System.out.printf("%s[%s](%d)\n",this.name,this.email,this.age);
		}
	}

