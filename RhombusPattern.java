package PATTERN_MAKING;

public class RhombusPattern {
	public static void main(String []args) {
		int n=5;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
				}System.out.print("*****");
			System.out.println();
		}
	int c=5;
	for(int i=1;i<=c;i++) {
		for(int j=1;j<=(c-i);j++) {
			System.out.print(" ");
		}
			for(int j = 1; j<=i;j++) {
			System.out.print(i + " ");
			
		}System.out.println();
	
	}

}}
