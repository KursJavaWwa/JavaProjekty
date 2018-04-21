package referencje;

public class Referencje {

    public static void main(String[] args) {

        int a = 53;
        int b = a;

        b = 30;

        System.out.println(a);

        Test x = new Test(); // w x nie znajduje się zadna wartość zwykła typowa prymitywna TYLKO ADRES
        Test y = x;

        y.a = 40;

        System.out.println(x.a);


    }

}

class Test
{
    int a = 20;
}