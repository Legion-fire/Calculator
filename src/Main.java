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
        if ((number1 > 10 || number2 > 10) || (number1 < 1 || number2 < 1)) throw new ArithmeticException("Вы ввели недопустимое число");
           if (!roman_flag) System.out.println(result);
     else Roman.roman_numerals(result); // метод романус
    }
}