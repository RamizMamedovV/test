public class Lesson6 {


        public static void main(String[] args) {
/*
Make Alphabet class,
so that this code and *similar ones* work correctly
*/
            Alphabet alphabet = new Alphabet();
            alphabet.setW(5);
            System.out.println(alphabet.getSum());
            alphabet.setA(5);
            alphabet.setS(7);
            alphabet.setD(7);
            System.out.println(alphabet.getSum());

/*
This fragment of code has to output

5
24

*/
        }
}
