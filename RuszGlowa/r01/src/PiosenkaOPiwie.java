public class PiosenkaOPiwie {

    public static void main(String[] args) {

        int ilośćButelek = 10;
        String Slowo = "bottles";
        while (ilośćButelek > 0){
            if (ilośćButelek == 1){
                Slowo = "bottle";
            }
            System.out.println(ilośćButelek + " " + Slowo + " of beer on the wall");
            System.out.println(ilośćButelek + " " + Slowo + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around.");
            ilośćButelek = ilośćButelek - 1;
            if (ilośćButelek > 0){
                System.out.println(ilośćButelek + " " + Slowo + " of beer on the wall");

            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }



}
