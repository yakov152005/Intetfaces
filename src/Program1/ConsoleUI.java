package Program1;

import java.util.Scanner;

public class ConsoleUI implements Messageable{//איך
    private Scanner s = new Scanner(System.in);

    @Override
    public void showMessage(String msg) {
        System.out.println(msg);
    }

    @Override
    public String getString(String msg) {
        System.out.println(msg);
        return s.next();
    }
}
