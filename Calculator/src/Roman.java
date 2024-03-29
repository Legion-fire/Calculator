import java.util.Arrays;

public class Roman {

    static boolean roman_flag;
    static boolean roman_flag1 = false;
    static boolean roman_flag2 = false;
    static int result;
    static String result_roman;
    static int number1;
    static int number2;
    static String arithmetic_operation;

   public static String [] setNumber_and_operation(String  str ) throws ArithmeticException {
       String[] number_and_operation = str.split(" ");
       if (number_and_operation.length == 1) throw new ArithmeticException("строка не является математической операцией");
       int[] count = new int[4];
       for (String operand: number_and_operation) {
    //       if (operand.equals("+")) count++;
           switch (operand) {
               case "+" : count[0]++;
               case "-" : count[1]++;
               case "/" : count[2]++;
               case "*" : count[3]++;
           }
       }
       if (count[0] > 1 || count[1] > 1 || count[2] > 1 | count[3] > 1) throw new ArithmeticException("Введено более двух операндов");
       switch (number_and_operation[0]) {
           case "I" -> {
               number_and_operation[0] = String.valueOf(1);
               roman_flag1 = true;
           }
           case "II" -> {
               number_and_operation[0] = String.valueOf(2);
               roman_flag1 = true;
           }
           case "III" -> {
               number_and_operation[0] = String.valueOf(3);
               roman_flag1 = true;
           }
           case "IV" -> {
               number_and_operation[0] = String.valueOf(4);
               roman_flag1 = true;
           }
           case "V" -> {
               number_and_operation[0] = String.valueOf(5);
               roman_flag1 = true;
           }
           case "VI" -> {
               number_and_operation[0] = String.valueOf(6);
               roman_flag1 = true;
           }
           case "VII" -> {
               number_and_operation[0] = String.valueOf(7);
               roman_flag1 = true;
           }
           case "VIII" -> {
               number_and_operation[0] = String.valueOf(8);
               roman_flag1 = true;
           }
           case "IX" -> {
               number_and_operation[0] = String.valueOf(9);
               roman_flag1 = true;
           }
           case "X" -> {
               number_and_operation[0] = String.valueOf(10);
               roman_flag1 = true;
           }
       }
       switch (number_and_operation[2]) {
           case "I" -> {
               number_and_operation[2] = String.valueOf(1);
               roman_flag2 = true;
           }
           case "II" -> {
               number_and_operation[2] = String.valueOf(2);
               roman_flag2 = true;
           }
           case "III" -> {
               number_and_operation[2] = String.valueOf(3);
               roman_flag2 = true;
           }
           case "IV" -> {
               number_and_operation[2] = String.valueOf(4);
               roman_flag2 = true;
           }
           case "V" -> {
               number_and_operation[2] = String.valueOf(5);
               roman_flag2 = true;
           }
           case "VI" -> {
               number_and_operation[2] = String.valueOf(6);
               roman_flag2 = true;
           }
           case "VII" -> {
               number_and_operation[2] = String.valueOf(7);
               roman_flag2 = true;
           }
           case "VIII" -> {
               number_and_operation[2] = String.valueOf(8);
               roman_flag2 = true;
           }
           case "IX" -> {
               number_and_operation[2] = String.valueOf(9);
               roman_flag2 = true;
           }
           case "X" -> {
               number_and_operation[2] = String.valueOf(10);
               roman_flag2 = true;
           }
       }
       number1 = Integer.parseInt(number_and_operation[0]);
       number2 = Integer.parseInt(number_and_operation[2]);
       arithmetic_operation = number_and_operation[1];
       return number_and_operation;
   }

    public static String roman_ten (int a) {
       if (roman_flag1 && roman_flag2) roman_flag = true;
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
        if (result_roman.equals("")) throw new ArithmeticException("Римское число не может быть нулем!");
        return result_roman;
    }

    static void roman_numerals (int a) {
        if (roman_flag1 && roman_flag2) roman_flag = true;
        result = ArithmeticOperations.result;
        if (roman_flag) {
            if (result <= 10) {
                if (result < 0 ) throw new ArithmeticException("В римской системе нет отрицательных чисел!");
                roman_ten(result);
            } else {
                result_roman = String.valueOf(result);
                String result_roman_first;
                String result_roman_second;
                char[] ch = result_roman.toCharArray();
                result_roman_first = String.valueOf(ch[0]);
                result_roman_second = String.valueOf(ch[1]);
                if (ch.length  == 3) {
                    result_roman_first = "10";
                }
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
                    case "10" -> result_roman = "C";
                }

            }
            System.out.println(result_roman);
        }
    }
}
