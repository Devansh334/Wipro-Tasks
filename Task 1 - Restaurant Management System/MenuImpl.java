import java.util.ArrayList;
import java.util.Scanner;

public class MenuImpl extends OrderImpl implements Menu {

    public static ArrayList<String> obj = new ArrayList<String>();
    public static ArrayList<Integer> price = new ArrayList<Integer>();

    public MenuImpl() {
        obj.add("order_ID   : Item          : Price");
        obj.add("1          : Maggie        : 70Rs");
        obj.add("2          : Sandwich      : 50Rs");
        obj.add("3          : Burger        : 120Rs");
        obj.add("4          : Coffee        : 80Rs");
        obj.add("5          : Pasta         : 150Rs");
        obj.add("6          : Pizza         : 250Rs");
        obj.add("7          : Salad         : 100Rs");
        obj.add("8          : Juice         : 60Rs");
        obj.add("9          : Ice Cream     : 90Rs");
        obj.add("10         : Fries         : 40Rs");
        price.add(70);
        price.add(50);
        price.add(120);
        price.add(80);
        price.add(150);
        price.add(250);
        price.add(100);
        price.add(60);
        price.add(90);
        price.add(40);
    }

    @Override
    public void displayMenu() {
        System.out.println("*********MENU********");
        System.out.println();

        for (String str : obj) {
            System.out.println(str);

        }

    }

    @Override
    public void addItem() {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Order ID");
        int i = ip.nextInt();
        if (i <= 10 && i >= 1) {
            int x = 0;
            for (String item : obj) {
                if (i == x) {
                    user.add(item);
                    System.out.println("Item added successfully......");
                    break;
                }
                x++;
            }
            x = 0;
            for (Integer p : price) {
                x++;
                if (i == x) {
                    bill = bill + p;

                    break;
                }

            }

        } else {
            System.out.println("OrderID don't Exists.........");
            return;
        }
    }
}
