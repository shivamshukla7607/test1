package New;

import java.util.Scanner;

public class gambler {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Use onle 100");
        int x= sc.nextInt();
        System.out.println("Gaming times ");
        for (int i = 1; i <= x; i++) {
            System.out.println("$ 1 every game");
            if (i % 2 == 0) {
                System.out.println("Win");
            } else {
                System.out.println("Loose");
            }
        }
    }

}