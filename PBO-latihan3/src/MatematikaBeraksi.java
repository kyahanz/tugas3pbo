public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika MathUtil = new Matematika();
        System.out.println("Pertambahan\t: 30 + 10 = " + MathUtil.pertambahan(20, 10));
        System.out.println("Pengurangan\t: 20 - 10 = " + MathUtil.pengurangan(10, 5));
        System.out.println("Perkalian\t: 12 * 3 = " + MathUtil.perkalian(10, 3));
        System.out.println("Pembagian\t: 22 / 2 = " + MathUtil.pembagian(21, 2));
    }
}