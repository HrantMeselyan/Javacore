package group1.Chapter12.EnumDemo;

public class EnumDemo {
    public static void main(String[] args) {

        Apple ap;
        ap = Apple.RED_DEL;
        System.out.println("Value ap : " + ap);
        System.out.println();

        ap = Apple.GOLDEN_DEL;
        if(ap == Apple.GOLDEN_DEL){
            System.out.println("Variable ap = Golden del");
        }
        switch (ap){
            case JONATHAN :
                System.out.println("Jonathan is red");
                break;
            case GOLDEN_DEL:
                System.out.println("Golden is yellow");
                break;
            case RED_DEL:
                System.out.println("Red delicious is red");
                break;
            case WINESAP:
                System.out.println("Winesap is red");
                break;
            case CORTLAND:
                System.out.println("Cortland is red");
                break;
        }
    }
}
