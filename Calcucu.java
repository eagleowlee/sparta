package CACACA;

public class Calcucu {
    public double calculate(String option, int num1, int num2) {

        double answer = 0;

        if (option.equals("+")) {
            answer = num1 + num2;
        } else if (option.equals("-")) {
            answer = num1 - num2;
        } else if (option.equals("*")) {
            answer = num1 * num2;
        } else if (option.equals("/")) {
            if (num2 != 0) {
                answer = num1 / num2;
            } else {
                return 0;
            }
        }
            return answer;
        }
    }

