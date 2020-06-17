import java.util.Arrays;
import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int i = 0;
		while (i < T) {
			int N = s.nextInt();
			int S = s.nextInt(); 
			int array[] = new int[N];
			for (int index = 0; index < N; index++) {
				array[index] = s.nextInt();
			}
			for (int index = 0; index < N; index++) {
				int sum = array[index];
				if (sum == S) {
					System.out.println((index + 1) + " " + (index + 1));
					break;
				} else if (index == N - 1) {
					System.out.println("-1");
				} else {
					for (int index2 = index + 1; index2 < N; index2++) {
						sum += array[index2];
						if (sum == S) {
							System.out.println((index + 1) + " " + (index2 + 1));
							break;
						} else if (sum < S) {
							continue;
						} else {
							break;
						}
					}
				}
				if (sum == S) {
					break;
				}
			}
			i++;
		}
	}
}
