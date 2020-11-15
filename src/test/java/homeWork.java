import org.junit.jupiter.api.Test;

public class homeWork {
    @Test
    public void homeWork() {
        int start = startingAmount(50000);
        System.out.println("My starting amount to pay: " + start);
        int percentage = percentageCredit(5);
        System.out.println("My credit percentage % is: " + percentage);
        int amount = finalAmount(50000, 5);
        System.out.println("My final amount to pay iss: " + amount);

        System.out.println("Amount of symbols in string is: " + counter);
        System.out.println("Amount of words in string is: " + countWord);
    }

    private int startingAmount(int a) {
        int c = a;
        return c;
    }

    private int percentageCredit(int b) {
        int d = b;
        return d;
    }

    private int finalAmount(int a, int b) {
        int e = a / 100;
        int f = e * 105;
        return f;
    }

    String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
    int counter = text.length();
    int countWord = text.split("\\s").length;

    }
