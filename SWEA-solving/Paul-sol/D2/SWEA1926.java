package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 간단한 369게임 D2
public class SWEA1926 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			String num = Integer.toString(i);

			int cnt = 0;
			if (num.contains("3") || num.contains("6") || num.contains("9")) {
				for (int j = 0; j < num.length(); j++) {
					if (num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
						cnt++;
					}
				}
				for (int j = 0; j < cnt; j++) {
					System.out.print('-');
				}
				System.out.print(" ");
			} else {
				System.out.print(i + " ");
			}

		}
	}

}