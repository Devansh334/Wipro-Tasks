import java.util.ArrayList;

public class OrderImpl implements Order {
    public static ArrayList<String> user = new ArrayList<String>();
    public static int bill = 0;

    @Override
    public void displayOrder() {
        System.out.println("********** CART *********");
        System.out.println("order_ID   : Item          : Price");
        for (String string : user) {
            System.out.println(string);
        }
        System.out.println("You May Add More Items to the cart ........");
    }

    @Override
    public void checkOut() {

        System.out.println("********** BILL *********");
        System.out.println("order_ID   : Item          : Price");
        for (String string : user) {
            System.out.println(string);
        }
        System.out.println();
        int per = (bill * 5) / 100;
        bill = bill + per;
        System.out.println("  +@5%GST  : Rs" + per);
        System.out.println("TOTAL      : Rs" + bill);
        System.exit(0);
    }
}
