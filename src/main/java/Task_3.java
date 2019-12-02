import org.jetbrains.annotations.NotNull;

public class Task_3 {

    public static void main(@NotNull String[] args) {

        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index bound exception");
        }
    }
}
