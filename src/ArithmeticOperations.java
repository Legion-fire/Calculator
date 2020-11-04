public class ArithmeticOperations {
    static int result;
    public static int arithmetic_operations (int number1, int number2, String arithmetic_operation) {
    result = switch (arithmetic_operation) {
        case "+" -> number1 + number2;
        case "-" -> number1 - number2;
        case "/" -> number1 / number2;
        case "*" -> number1 * number2;
        default -> throw new ArithmeticException("Введена неверная операция");
    };
    return result;
    }
}
