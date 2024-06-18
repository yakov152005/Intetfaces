package Practice1;
import java.util.*;

public class Program {

    public static final List<String> namesList = List.of("Yakov","Amit","Itay","Elad","Hodaya");
    public static <T> void main(String[] args) throws CloneNotSupportedException {

        System.out.println("How many object do u want to create? ");
        int size = s.nextInt();
        LivingThing[] objects =  new LivingThing[size];
        for (int i = 0; i < objects.length; i++) {
            manuForSwitch();
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    objects[i] = new Thief(namesList.get(i), (int) (Math.random() * 300), (int) (Math.random() * 30));
                    break;
                case 2:
                    objects[i] = new Runner("Amit",180,12);
                    break;
                case 3:
                    objects[i] = new Cheetah("MOMO",152,23);
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
            if (objects[i] instanceof Thief){
                ((Thief) objects[i]).steal();
            }
            if (objects[i] instanceof Runable) {
                ((Runable) objects[i]).run();
            }
            if (objects[i] instanceof Runner){
                ((Runner) objects[i]).breath();
            }
        }

        System.out.println();
        Object[] dupArr = new Object[objects.length];
        for (int i = 0; i < dupArr.length; i++) {
                dupArr[i] = objects[i].clone();
        }

        System.out.println();
        System.out.println("The duplicated arr: " );
        for (int i = 0; i < dupArr.length; i++) {
            System.out.println(dupArr[i]);
        }

        System.out.println();
        System.out.println("Duplicated those who breath: ");
        List<T> breath = new LinkedList<T>();
        for (int i = 0; i < dupArr.length; i++) {
            if (dupArr[i] instanceof Breathable){
                breath.add((T) dupArr[i]);
            }
        }
        System.out.println(breath);

        System.out.println();
        System.out.println("Duplicated runner sorted list : ");
        List<Runner> runnerList = new LinkedList<>();
        for (int i = 0; i < dupArr.length; i++) {
            if (dupArr[i] instanceof Runner){
                runnerList.add((Runner) dupArr[i]);
            }

        }
        Collections.sort(runnerList, new CompareRunnerByName());
        for (Runner runner: runnerList){
            System.out.println(runner);
        }

        System.out.println("Duplicated thief:");
        List<Thief> thiefList = new LinkedList<>();
        for (int i = 0; i < dupArr.length; i++) {
            if (dupArr[i] instanceof Thief){
                thiefList.add((Thief) dupArr[i]);
            }
        }

        System.out.println("Sorted list by high: ");
        Collections.sort(thiefList, new CompareThiefByHeight());
        for (Thief thief : thiefList){
            System.out.println(thief);
        }

        System.out.println("Sorted list by num of steal: ");
        Collections.sort(thiefList, new CompareThiefByTimesArrested());
        for (Thief thief : thiefList){
            System.out.println(thief);
        }


    }
    public static void manuForSwitch(){
        for (String string : Arrays.asList("What type is the object?", "1 - Thief " +
                "2 - Runner " +
                "3 - Cheetah ")) {
            System.out.println(string);
        }
    }

    public static Scanner s = new Scanner(System.in);
}
