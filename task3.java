// В калькулятор добавьте возможность отменить последнюю операцию.


import java.util.ArrayDeque;
import java.util.Arrays;

public class task3 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void calculator(String str) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] newStr = str.split(" ");
        System.out.println(Arrays.toString(newStr));
        int result = 0;

        for (int i = 0; i < newStr.length; i++) {
            if (isDigit(newStr[i])) {
                stack.push(Integer.parseInt(newStr[i]));
            } else {
                switch (newStr[i]) {
                    case "+":
                        result = stack.pop() + stack.pop();
                        stack.push(result);
                        break;
                    case "-":
                        result = stack.pop() - stack.pop();
                        stack.push(result);
                        break;
                    case "*":
                        result = stack.pop() * stack.pop();
                        stack.push(result);
                        break;
                    case "/":
                        result = stack.pop() / stack.pop();
                        stack.push(result);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
        String str = "2 5 6 - 7 * +";

        calculator(str);
    }

}