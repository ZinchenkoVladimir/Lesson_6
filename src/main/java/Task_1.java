public class Task_1 {

    public static void main(String[] args) {

        new Task_1().numberCheck(0);
    }

    public void numberCheck(int number){

        try {
            if (number < 0) {
                System.out.println("Number < 0");
            }else if (number>0){
                System.out.println("Number > 0");
            }else {
                throw new Exception("Number is 0");
            }
            System.out.println("Number checked");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
