package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' '};

        int indexOne = 0;
        int indexTwo = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                indexOne++;
            } else {
                break;
            }
        }

        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] == ' ') {
                indexTwo--;
            } else {
                break;
            }
        }
        char[] resultChars = new char[indexTwo - indexOne + 1];
        for (int i = 0; i < resultChars.length; i++) {
            resultChars[i] = spaceArray[indexOne];
            indexOne++;
            System.out.print(resultChars[i]);

        }

    }
}
