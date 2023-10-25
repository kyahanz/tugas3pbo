public class DemoKonversiSuhu {
    public static void main (String[] args) {
        KonversiSuhu suhu1 = new KonversiSuhu();
        KonversiSuhu2 suhu2 = new KonversiSuhu2();

        System.out.println("KonversiSuhu Class,\n");
        System.out.println("3C to F : " + suhu1.celsiusToFahrenheit(3));
        System.out.println("3C to R : " + suhu1.celsiusToReamur(3));

        System.out.println("\n\nKonversiSuhu2 Class,\n");
        System.out.println("3C to F : " + suhu2.celsiusToFahrenheit(3));
        System.out.println("3C to R : " + suhu2.celsiusToReamur(3));
        System.out.println("3F to R : " + suhu2.fahrenheitToReamur(3));
    }
}
