import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Roman.setNumber_and_operation(str);
        boolean roman_flag = Roman.roman_flag;
        int number1 = Roman.number1;
        int number2 = Roman.number2;
        String arithmetic_operation = Roman.arithmetic_operation;

        if (number1 > 10 || number2 > 10) throw new ArithmeticException("Одно из введенных чисел, или оба числа больше 10");
       if (number1 < 0 || number2 < 0) throw new ArithmeticException("Одно из введенных чисел, или оба числа меньше единицы");
           result = switch (arithmetic_operation) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "/" -> number1 / number2;
            case "*" -> number1 * number2;
            default -> throw new ArithmeticException("Введена неверная операция");
        };
           if (!roman_flag) System.out.println(result);
     else Roman.roman_numerals(result); // метод романус
    }
}