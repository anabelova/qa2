import org.junit.jupiter.api.Test;

public class MyFirsTest {
    private String name  = "Gospodin";

    @Test
    public void firstTest() {
        System.out.println("Hi!");
       int sum =  sumTwoDigits( 15, 45);
        System.out.println("And the sum is: " + sum);

        System.out.println(sumTwoDigits(9,13));
    }

    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;
    }
}
