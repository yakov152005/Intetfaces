package Program2;

public class SimplePizza implements  PreparePizzable{
    @Override
    public void makeDough() {
        System.out.println("Take Pitta");
    }

    @Override
    public void makeSouce() {
        System.out.println("Put ketchup");
    }

    @Override
    public void putCheese() {
        System.out.println("Put slice of yellow cheese");
    }
}
