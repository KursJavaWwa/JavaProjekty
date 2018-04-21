package klasywewnetrzne;

public class Main
{

    public static void main(String[] args)
    {
        A zewnetrzna = new A();

        A.B tmp = zewnetrzna.new B();


        A.C tmp2 = new A.C();


    }

}

class A
{
    A()
    {
        System.out.println("Jestem z klasy zewnętrznej A");
    }
    class B
    {

        B()
        {
            System.out.println("Jestem z klasy zagnieżdzonej B");
        }
        void cos()
        {
            test = 5;

        }

        private int tmp;
    }
    private int test;


    static class C
    {

        C()
        {
            System.out.println("Jestem z klasy zagnieżdzonej C");
        }
    }
    void cos2()
    {
        //  tmp = 2;
        B obj = new B();

    }

}