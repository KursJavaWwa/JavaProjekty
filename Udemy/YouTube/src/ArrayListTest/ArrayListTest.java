package ArrayListTest;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {


        ArrayList<String> wyrazy = new ArrayList<String>();

        wyrazy.add("To");
        wyrazy.add("jest");
        wyrazy.add("nasza");
        wyrazy.add("wspaniała");
        wyrazy.add("lista");

        for (String s : wyrazy)
        System.out.print(s + " ");

        wyrazy.add(1, "nie" ); //dodaje cos
        for (String s : wyrazy)
            System.out.print(s + " ");
    }


}
