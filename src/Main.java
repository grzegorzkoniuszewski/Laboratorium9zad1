public class Main {

    public static void main(String[] args) {
        try {
            NullPointerExceptionGenerator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Wystąpił wyjątek: NullPointerException");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}