public class Test {
    public static void main(String[] args) {
        AL al1 = new AL("A07", 14);
        AL al2 = new AL("A08", 18);
        AM am1 = new AM("A09", 900);
        AM am2 = new AM("A10", 1000);
        System.out.println(al1.toString());
        System.out.println(al2.toString());
        System.out.println(am1.toString());
        System.out.println(am2.toString());

        // test funzione superiore()
        System.out.println(al1.superiore(al2));
        System.out.println(am1.superiore(am2));
        System.out.println(al2.superiore(al1));
        System.out.println(am2.superiore(am1));

        // test funzione equals()
        System.out.println(al1.equals(al2));
        System.out.println(al1.equals(al1));
        System.out.println(am1.equals(am2));
        System.out.println(am1.equals(am1));
    }
}
