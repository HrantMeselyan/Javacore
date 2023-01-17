package group1.Chapter5;

public class Search {
    public static void main(String[] args) {
        int array[] = { 6, 8, 3 ,7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int x: array){
            if (x == val){
                found = true;
            }
        }
        if (found){
            System.out.println("Number has been found!");
        }
    }
}
