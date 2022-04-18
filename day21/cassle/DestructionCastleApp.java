public class DestructionCastleApp{
	public static void main(String[] args){
		int power=0;
		char name='A';
		Castle castle=new Castle();
		Archer[] archers=new Archer[10];
		for(int i=0;i<10;i++){
			Archer a=new Archer(name++);
			archers[i]=a;
			power=archers[i].attack();
			castle.endurance-=power;
			System.out.printf("アーチャー%sの攻撃(%dpower):城の耐久(%d)\n",archers[i].suffix,archers[i].power,castle.endurance);
		}
		System.out.println(castle.endurance<=0?"城の攻略に成功した。":"城の攻略に失敗した。");
	}
}
