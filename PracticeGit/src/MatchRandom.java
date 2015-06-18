import java.util.Scanner;

public class MatchRandom {
	public static void main(String[] args) {
		int realNum = (int) (Math.random() * 100 + 1);
		Scanner input = new Scanner(System.in);

		int cnt = 5;

		while (cnt > 0) {
			int sign = input.nextInt();
			if (sign == realNum) {
				System.out.println("잘 맞췄어요.");
				break;
			} else if (sign > realNum) {
				cnt--;
				System.out.println("그거보다 작은 수입니다." + cnt + "번의 기회가 남았습니다.");
			} else if (sign < realNum) {
				cnt--;
				System.out.println("그거보다 큰 수입니다." + cnt + "번의 기회가 남았습니다.");
			}
		}
		System.out.println("답은" + realNum + "입니다.");
	}
}
