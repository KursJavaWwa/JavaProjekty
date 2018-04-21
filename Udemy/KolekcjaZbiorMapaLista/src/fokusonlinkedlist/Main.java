package fokusonlinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) {

        LinkedList<String> listaPowiazana = new LinkedList<>();
        listaPowiazana.add("lala1");
        listaPowiazana.add("lala2");
        listaPowiazana.add("lala3");
        listaPowiazana.add("lala4");

       /* for(int i = 0, i < listaPowiazana.size(); i++)
        {

            System.out.println();
        }*/


    }
        public static void  wypiszElementyListy(LinkedList<?> lista){

            Iterator iteratorListy = lista.iterator();
            while (iteratorListy.hasNext())
                System.out.println(iteratorListy.next());

        }
}
