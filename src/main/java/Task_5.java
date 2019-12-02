import org.jetbrains.annotations.Contract;

public class Task_5 {

    @Contract("_ -> fail")
    public static void main(String[] args) {
        iCanThrowException();
    }

    @Contract(" -> fail")
    private static void iCanThrowException() {
        Object ref = null;
        assert false;
        final String s = ref.toString();
    }
}
