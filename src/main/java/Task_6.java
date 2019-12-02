import java.util.ArrayList;
import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        new Task_6().readData();
    }

    private void readData() {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");

        try {
            while (true) {
                int myint;
                myint = keyboard.nextInt();
                arr.add(myint);
            }
        }
        catch (Exception e) {
            if (arr.isEmpty()) {
                System.out.println("no integer values inputted");
            }
            else {
                System.out.println(arr);
            }
            System.out.println("You input wrong type of value");
        }
    }
}
