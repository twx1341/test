import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("シーザー暗号文を入力してください");
		String hirabun = stdIn.next();

		byte[] bytes = hirabun.getBytes(StandardCharsets.US_ASCII);

		int[] key = new int[26];

		for (int i = 0; i < bytes.length; i++) {
			key[i] = i;
		}

		int counter = 0;

		while (true) {

			System.out.print("平文鍵" + counter + ":");
			String str = new String(bytes);

			System.out.println(str);

			for (int i = 0; i < bytes.length; i++) {
				bytes[i] -= 1;
				if (bytes[i] < 65) {
					bytes[i] += 26;
				}

			}

			counter += 1;
			if (counter >= 26)
				break;
		}

	}
}
