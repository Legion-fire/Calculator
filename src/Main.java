import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean roman_flag;
    static int result;
    static String result_roman;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] number_and_operation  = str.split(" ");
        switch (number_and_operation[0]) {
            case "I" -> {
                number_and_operation[0] = String.valueOf(1);
                roman_flag = true;
            }
            case "II" -> {
                number_and_operation[0] = String.valueOf(2);
                roman_flag = true;
            }
            case "III" -> {
                number_and_operation[0] = String.valueOf(3);
                roman_flag = true;
            }
            case "IV" -> {
                number_and_operation[0] = String.valueOf(4);
                roman_flag = true;
            }
            case "V" -> {
                number_and_operation[0] = String.valueOf(5);
                roman_flag = true;
            }
            case "VI" -> {
                number_and_operation[0] = String.valueOf(6);
                roman_flag = true;
            }
            case "VII" -> {
                number_and_operation[0] = String.valueOf(7);
                roman_flag = true;
            }
            case "VIII" -> {
                number_and_operation[0] = String.valueOf(8);
                roman_flag = true;
            }
            case "IX" -> {
                number_and_operation[0] = String.valueOf(9);
                roman_flag = true;
            }
            case "X" -> {
                number_and_operation[0] = String.valueOf(10);
                roman_flag = true;
            }
        }
        switch (number_and_operation[2]) {
            case "I" -> {
                number_and_operation[2] = String.valueOf(1);
                roman_flag = true;
            }
            case "II" -> {
                number_and_operation[2] = String.valueOf(2);
                roman_flag = true;
            }
            case "III" -> {
                number_and_operation[2] = String.valueOf(3);
                roman_flag = true;
            }
            case "IV" -> {
                number_and_operation[2] = String.valueOf(4);
                roman_flag = true;
            }
            case "V" -> {
                number_and_operation[2] = String.valueOf(5);
                roman_flag = true;
            }
            case "VI" -> {
                number_and_operation[2] = String.valueOf(6);
                roman_flag = true;
            }
            case "VII" -> {
                number_and_operation[2] = String.valueOf(7);
                roman_flag = true;
            }
            case "VIII" -> {
                number_and_operation[2] = String.valueOf(8);
                roman_flag = true;
            }
            case "IX" -> {
                number_and_operation[2] = String.valueOf(9);
                roman_flag = true;
            }
            case "X" -> {
                number_and_operation[2] = String.valueOf(10);
                roman_flag = true;
            }
        }
        int number1 = Integer.parseInt(number_and_operation[0]);
        int number2 = Integer.parseInt(number_and_operation[2]);
        String arithmetic_operation = number_and_operation[1];

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