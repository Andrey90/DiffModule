package other;

/**
 * Created by lay on 14/12/2016.
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('I');
        sb.append("test");

        System.out.println(" 123" + sb.toString());
    }
}
