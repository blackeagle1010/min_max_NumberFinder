import java.util.Scanner;
public class Largest_Small_Number {
    public static void main(String[] args) {
        int num, number, min = 0, max = 0;
        Scanner Input = new Scanner(System.in);
        System.out.println("enter your number count you wanna:");
        num = Input.nextInt();
        for (int i = 1; i<= num; i++) {
            System.out.println( i + ". number enter plz:");
            number = Input.nextInt();

            if (number > max) {
                max = number;
            } else {
                System.out.println("error1");
            }
            if (number < min || min == 0) {
                min = number;
            }else {
                System.out.println("error2");
            }
        }
        System.out.println("Min number is: " +min);
        System.out.println("Max number is: " + max);
    }
}



