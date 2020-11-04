public class Roman {
    static boolean roman_flag = Main.roman_flag;
    static int result = Main.result;
    static String result_roman = Main.result_roman;
   // static int number1;
   // static int number2;
   // static String arithmetic_operation;

   // public static String setNumber_and_operation(String [] arg ) {
       // String[] arg  = str.split(" ");
//        switch (arg[0]) {
//            case "I" -> {
//                return arg[0] = String.valueOf(1);
//            }
//            case "II" -> {
//                return arg[0] = String.valueOf(2);
//            }
//            case "III" -> {
//                return arg[0] = String.valueOf(3);
//            }
//            case "IV" -> {
//                return arg[0] = String.valueOf(4);
//            }
//            case "V" -> {
//                return arg[0] = String.valueOf(5);
//            }
//            case "VI" -> {
//                return arg[0] = String.valueOf(6);
//            }
//            case "VII" -> {
//                return arg[0] = String.valueOf(7);
//            }
//            case "VIII" -> {
//                return arg[0] = String.valueOf(8);
//            }
//            case "IX" -> {
//                return arg[0] = String.valueOf(9);
//            }
//            case "X" -> {
//                return arg[0] = String.valueOf(10);
//            }
//        }
//        switch (arg[2]) {
//            case "I" -> {
//                return arg[2] = String.valueOf(1);
//            }
//            case "II" -> {
//                return arg[2] = String.valueOf(2);
//            }
//            case "III" -> {
//                return arg[2] = String.valueOf(3);
//            }
//            case "IV" -> {
//                return arg[2] = String.valueOf(4);
//            }
//            case "V" -> {
//                return arg[2] = String.valueOf(5);
//            }
//            case "VI" -> {
//                return arg[2] = String.valueOf(6);
//            }
//            case "VII" -> {
//                return arg[2] = String.valueOf(7);
//            }
//            case "VIII" -> {
//                return arg[2] = String.valueOf(8);
//            }
//            case "IX" -> {
//                return arg[2] = String.valueOf(9);
//            }
//            case "X" -> {
//                return arg[2] = String.valueOf(10);
//            }
//        }
//           number1 = Integer.parseInt(arg[0]);
//           number2 = Integer.parseInt(arg[2]);
//           arithmetic_operation = arg[1];
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(arithmetic_operation);
//        return null;
//    }

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
                //               System.out.println(ch.length);
                //             System.out.println(result_roman_first);
                //           System.out.println(result_roman_second);
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
