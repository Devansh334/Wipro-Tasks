import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Menu menu = new MenuImpl();
        Order order = new OrderImpl();
        Scanner ip = new Scanner(System.in);
        int x;
        int ch;

        do {
            System.out.println("Press 1 to Display Menu ");
            System.out.println("Press 2 to Add to Cart");
            System.out.println("Press 3 to Display Cart");
            System.out.println("Press 4 to Check Out");
            System.out.println("Press 5 to EXIT");

            System.out.println();
            System.out.print("Enter Choice here : ");
            ch = ip.nextInt();

            switch (ch) {
                case 1:
                    menu.displayMenu();
                    break;
                case 2:
                    menu.addItem();
                    break;
                case 3:
                    order.displayOrder();
                    break;
                case 4:
                    order.checkOut();
                    break;
                case 5:
                    System.out.println("*******Thank-U*******");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println();
            System.out.println("Press 1 to continue.......");

            x = ip.nextInt();
        } while (x == 1);

    }
}
