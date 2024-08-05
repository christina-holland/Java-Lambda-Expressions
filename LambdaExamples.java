import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExamples {
    //Part of Task 1: Defining a functional interface for the operations
    @FunctionalInterface
    interface Operation {
        double apply(double a, double b);
    }

    //Creating a main method to run the examples
    public static void main(String[] args) {
        //Part of Task 1: Creating lambda expressions for basic arithmetic operations
        //Printing the operation outputs for a = 5 and b = 3 to test the expressions

        //The lambda expression for addition
        Operation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.apply(5, 3));

        //The lambda expression for subtraction
        Operation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.apply(5, 3));

        //The lambda expression for multiplication
        Operation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.apply(5, 3));

        //The lambda expression for division
        Operation division = (a, b) -> a / b;
        System.out.println("Division: " + division.apply(5, 3));

        //Part of Task 2: Creating lambda expressions using custom functional interfaces
        //Printing the outputs to test the expressions

        //A lambda expression for greeting a person
        Greeting helloGreeting = name -> System.out.println("Hello, " + name + "!");
        helloGreeting.greet("Christina");

        //A lambda expression for converting a string to an integer
        Converter toInteger = s -> Integer.parseInt(s);
        System.out.println("Converted value: " + toInteger.convert("1234"));

        //Task 3: Use lambda expressions with built-in functional interfaces

        //A lambda expression to check if a number is even
        //Printing the outputs to test the expressions
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        //A lambda expression to get the length of a string
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

        //A lambda expression to print a message
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, world!");

        //A lambda expression to generate a random double value
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());
    }

    //Part of Task 2: Creating custom functional interfaces

    //A custom functional interface for the greeting
    @FunctionalInterface
    interface Greeting {
        void greet(String name);
    }

    //A custom functional interface for converting a string to an integer
    @FunctionalInterface
    interface Converter {
        int convert(String s);
    }
}
