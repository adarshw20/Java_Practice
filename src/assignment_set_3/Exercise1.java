package assignment_set_3;

public class Exercise1 {
    public static int sumOfEven(int[] numbers){
        int len = numbers.length;
        int total = 0;
        for(int num : numbers){
            if(num % 2 == 0) {
                total += num;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {68, 79, 86, 99, 23, 2, 41, 100};
        System.out.println("Sum of even numbers: " + sumOfEven(numbers));
    }
}
