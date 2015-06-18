import java.util.Scanner;

public class MatchRandom {
	public static void main(String[] args) {
		double ranNum = Math.random();
		double preNum = ranNum * 100 + 1;
		int realNum = (int) preNum;

		Scanner input = new Scanner(System.in);

		int cnt = 4;

		while (cnt > 0) {

			int sign = input.nextInt();

			if (sign == realNum) {

				System.out.println("잘 맞췄어. 시밸롬아.");

				break;

			} else if (sign > realNum) {

				cnt--;

				if (cnt == 0) {

					System.out.println("개멍청하네. 답은" + realNum + "였어.");

					break;

				}

				System.out.println("그거보다 작은 수라고 멍청아.");

				System.out.println(cnt + "번의 기회가 남았다.");

			} else if (sign < realNum) {

				cnt--;

				if (cnt == 0) {

					System.out.println("개멍청하네. 답은" + realNum + "였어.");

					break;

				}

				System.out.println("그거보다 큰 수라고 멍청아.");

				System.out.println(cnt + "번의 기회가 남았다.");

			} else if (cnt == 0) {

				System.out.println("개멍청하네. 답은" + realNum + "였어.");

				break;

			}

		}
	}
}
