package Program1;

public class TestUI {
    public static void main(String[] args) {
//        Messageable ui = new ConsoleUI();
//        String res = ui.getString("What is your Name? ");
//        ui.showMessage("Hi " + res);

        Messageable ui1 = new GraphicalUI();
        String res1 = ui1.getString("What is your name? ");
        ui1.showMessage("Hi " + res1);
    }
}
