
public class Helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello Worde!\n");
		for (int run1 = 0; run1 <=5; run1++) {
			for (int run2 =5-run1; run2 >=0; run2--) {
				System.out.print(" ");
			}
			for (int run3 = 0; run3 < (run1*2-1); run3++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
