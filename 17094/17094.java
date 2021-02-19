package baekjoon;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count_e = 0;
		String s;
		
		//1.length of string
		int len = sc.nextInt();

		s = sc.next();
		//2. count the number of 'e' character
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == 'e') {
				count_e++;
			}
		}
		//3. Subtract the number of 'e' from the entire length
		//and find out the number of '2'
		int count_2 = len-count_e;
		
		//4. compare the number of characters 'e' and '2'
		if (count_e > count_2) System.out.println("e");
		else if (count_e < count_2) System.out.println("2");
		else if (count_e == count_2) System.out.println("yee");
	}
}

