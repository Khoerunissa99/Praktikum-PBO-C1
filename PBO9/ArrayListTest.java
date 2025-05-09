/**
 * File : ArrayListTest.java
 * Deskripsi : program penggunaan objek ArrayList
 *             sebagai Collection class
 */

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("praktikum");
        strings.add("Collection");
        strings.add("dan generics");
        strings.remove("praktikum");

        System.err.println(strings);
        for(String s : strings){
            System.err.println(s +"");
        }
    }
}