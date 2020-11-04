import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean roman_flag = false;
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
     else roman_numerals(result); // метод романус
    }

    public static String roman_ten (int a) {
        if (roman_flag) {
            switch (a) {
                case 0 -> {
                    result_roman = "";
                }
                case 1 -> {
                    result_roman = "I";
                }
                case 2 -> {
                    result_roman = "II";
                }
                case 3 -> {
                    result_roman = "III";
                }
                case 4 -> {
                    result_roman = "IV";
                }
                case 5 -> {
                    result_roman = "V";
                }
                case 6 -> {
                    result_roman = "VI";
                }
                case 7 -> {
                    result_roman = "VII";
                }
                case 8 -> {
                    result_roman = "VIII";
                }
                case 9 -> {
                    result_roman = "IX";
                }
                case 10 -> {
                    result_roman = "X";
                }
            }
        }
        return result_roman;
    }

    static void roman_numerals (int a) {
        if (roman_flag) {
            if (result <= 10) {
                roman_ten(result);
            } else {
                result_roman = String.valueOf(result);
                String result_roman_first;
                String result_roman_second;
                char[] ch = result_roman.toCharArray();
                result_roman_first = String.valueOf(ch[0]);
                result_roman_second = String.valueOf(ch[1]);
                roman_ten(Integer.parseInt(result_roman_second));
                switch (result_roman_first) {
                    case "1" -> result_roman = "X" + result_roman;
                    case "2" -> result_roman = "XX" + result_roman;
                    case "3" -> result_roman = "XXX" + result_roman;
                    case "4" -> result_roman = "XL" + result_roman;
                    case "5" -> result_roman = "L" + result_roman;
                    case "6" -> result_roman = "LX" + result_roman;
                    case "7" -> result_roman = "LXX" + result_roman;
                    case "8" -> result_roman = "LXXX" + result_roman;
                    case "9" -> result_roman = "XC" + result_roman;
                }

            }
            System.out.println(result_roman);
        }
    }
}