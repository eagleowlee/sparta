import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("두 정수 중 첫 번째 정수를 입력하세요");
            int num1 = scanner.nextInt();
            System.out.println("두 정수 중 두 번째 정수를 입력하세요");
            int num2 = scanner.nextInt();

            scanner.nextLine();

            System.out.println("사칙연산 +, -, *, / 중 1개를 입력하세요");
            String cal = scanner.nextLine();
            if (cal.equals("+")) {
                int plus = num1 + num2;
                System.out.println("결과 : " + plus);
            } else if (cal.equals("-")) {
                int minus = num1 - num2;
                System.out.println("결과 : " + minus);
            } else if (cal.equals("*")) {
                int times = num1*num2;
                System.out.println("결과 : " + times);
            } else if (cal.equals("/")) {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다. 다시 시도하세요.");
                } else {
                    double divide = (double) num1/num2;
                    System.out.println("결과 : " + divide);
                }
            } else {
                System.out.println("잘못 입력하셧습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.println("종료하려면 \"exit\"을 입력해주세요\n 계속하시려면 아무거나 입력하세요.");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
