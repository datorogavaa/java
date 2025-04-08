import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        while (num != 0) {
            reverse *= 10;
            reverse += num % 10;
            num /= 10;
        }
        if (reverse == temp) {
            return true;

        }else{
            return false;
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        DateTimeFormatter date = DateTimeFormatter.ofPattern("HH:mm:ss");
//        System.out.println("Enter time for alarm in this \"HH:mm:ss\" format");
//        String input = scanner.nextLine();
//        LocalTime updated = LocalTime.parse(input, date);
//        AlarmClock clock = new AlarmClock(updated);
//        Thread thread = new Thread(clock);
//        thread.start();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entere a number and i will tell you is it palindrome or not:");
//        Integer input = scanner.nextInt();
//        System.out.println(isPalindrome(input));

        Integer[] ints = {1,2,3,4,5,6,6,77,77,21,21,15,15,3,3,5};
        String[] strs = {"a","d","e","d","k"};
        List<Integer> list = new ArrayList<Integer>();
        System.out.println(Arrays.stream(ints).distinct().toList());
    }
}