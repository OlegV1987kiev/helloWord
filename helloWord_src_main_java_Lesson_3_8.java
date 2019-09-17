import java.util.ArrayList;

public class Lesson_3_8 {
//    "8*. Write a program which prints ""Hello world"" to the console using methods transformIntToChar and printList only.
//    public class Main {

    public static void main(String[] args) {
        ArrayList<Character> i = transformIntToChar();
        i.add('H');
        i.add('e');
        i.add('l');
        i.add('l');
        i.add('o');
        i.add(' ');
        i.add('w');
        i.add('o');
        i.add('r');
        i.add('l');
        i.add('d');
        printList(i);
    }


    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<Character>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }


}

