package Program2;
public class PizzaProgram {
    public static void preparePizza(PreparePizzable p){
        p.makeDough();
        p.makeSouce();
        p.putCheese();
    }
    public static void preparePizza(MakeDoughable dough, MakeSouceable souce, PutCheeseable cheese){
        dough.makeDough();
        souce.makeSouce();
        cheese.putCheese();
    }


    public static void main(String[] args) {
        new PizzaProgram();
        System.out.println("Preparing fancy pizza: ");
        preparePizza(new FancyPizza());

        System.out.println();
        PreparePizzable[] pizzaMakers = new PreparePizzable[3];
        pizzaMakers[0] = new SimplePizza();
        pizzaMakers[1] = new RegularPizza();
        pizzaMakers[2] = new FancyPizza();
        preparePizza(pizzaMakers[0],pizzaMakers[1],pizzaMakers[2]);
    }
}

