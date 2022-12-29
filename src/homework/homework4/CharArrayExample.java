package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e', 'o'};
        int count = 0;
        char c = 'o';
        for (int x : chars) {
            if (x == c) {
                count++;
            }
        }
        System.out.println(count);


        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println(chars2[chars2.length / 2] + " " + chars2[(chars2.length / 2) - 1]);


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println(chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l');


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char x : text) {
            if (x != ' ') {
                System.out.print(x + " ");
            }
        }


    }
}
