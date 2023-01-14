package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' '};

        int indexOne = 0;
        int indexTwo = spaceArray.length - 1;


        while (spaceArray[indexOne] == ' ') {
            indexOne++;
        }
        while (spaceArray[indexTwo] == ' ') {
            indexTwo--;
        }

        char[] resultChars = new char[indexTwo - indexOne + 1];
        for (int i = 0; i < resultChars.length; i++) {
            resultChars[i] = spaceArray[indexOne];
            indexOne++;
            System.out.print(resultChars[i]);

        }

    }
}
