package other;

/**
 * Created by lay on 14/12/2016.
 */
public class TryFinalDemo {
    public static void main(String[] args) {
        System.out.println("Res is " + callDemo("3"));
    }

    private static Integer callDemo(String number){
        try {
            System.out.println("Inside try block");
/*            System.exit(0);*/
            return Integer.parseInt(number);
        }
        catch (Exception e){
            System.out.println("Inside catch block");
            return -1;
        }
        finally{
            System.out.println("Inside finally block");
            return -2;
        }
    }
}
