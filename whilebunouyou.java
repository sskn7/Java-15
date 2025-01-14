
public class whilebunouyou {

	public static void main(String[] args) {
		//do while文
		
		int i = 1;//初期値//
		do {
			System.out.println(i);
			i--;
		} while(i>1);//ループする//
		
		
		//１～９まで
		int a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a < 10);
		
		//初期値が５で、1ずつ減る
		int b =5;
		do {
			System.out.println(b);
			b++;
		} while (i > 0);
		
		//２ずつ増える
		int c = 1;
		do {
			System.out.println(c);
			c += 2;
			} while (c <= 10);
		
		//３つずつ減る
		int d = 10;
		do {
			System.out.println(d);
			d -= 3;
		} while (d >=1 );
	}

}
