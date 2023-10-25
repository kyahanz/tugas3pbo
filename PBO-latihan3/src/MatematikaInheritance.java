public class MatematikaInheritance {
    public static void main (String[] args) {
        Matematika Math1 = new Matematika();
        Matematika2 Math2 = new Matematika2();

        System.out.println("Matematika class,\n");
        System.out.println("Pertambahan\t: 30 + 10 = " + Math1.pertambahan(20, 10));
        System.out.println("Pengurangan\t: 20 - 10 = " + Math1.pengurangan(10, 5));
        System.out.println("Perkalian\t: 12 * 3 = " + Math1.perkalian(10, 3));
        System.out.println("Pembagian\t: 22 / 2 = " + Math1.pembagian(21, 2));

        System.out.println("\n\nMatematika2 class,\n");
        System.out.println("Matematika class,\n");
        System.out.println("Pertambahan\t: 30 + 10 = " + Math2.pertambahan(20, 10));
        System.out.println("Pengurangan\t: 20 - 10 = " + Math2.pengurangan(10, 5));
        System.out.println("Perkalian\t: 12 * 3 = " + Math2.perkalian(10, 3));
        System.out.println("Pembagian\t: 22 / 2 = " + Math2.pembagian(21, 2));
        System.out.println("Modulus\t\t: 11 % 2 = " + Math2.modulus(11,2));


    }
}
