import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, ArithmeticException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Roman.setNumber_and_operation(str);
        boolean roman_flag = false;
        int number1 = Roman.number1;
        int number2 = Roman.number2;
        String arithmetic_operation = Roman.arithmetic_operation;
        int result = ArithmeticOperations.arithmetic_operations(number1, number2, arithmetic_operation);
        if (Roman.roman_flag1 && Roman.roman_flag2) roman_flag = true;
        else if (Roman.roman_flag1 || Roman.roman_flag2)
            throw new ArithmeticException("Введите корректное значение: оба числа дожны быть записаны либо только римскими, либо только арабскими цифрами");
        if (number1 > 10 || number2 > 10) throw new ArithmeticException("Одно из введенных чисел, или оба числа больше 10");
       if (number1 < 0 || number2 < 0) throw new ArithmeticException("Одно из введенных чисел, или оба числа меньше единицы");
           if (!roman_flag) System.out.println(result);
     else Roman.roman_numerals(result); // метод романус
    }
}