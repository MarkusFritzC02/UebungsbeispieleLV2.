public class TurmDemo {
    public static void main(String[] args) {

        int zahl = 8;
        int multiplikator = 2;
        int divisor = 2;

        while (multiplikator <= 9){
            System.out.println(zahl);
            zahl = zahl * multiplikator;
            multiplikator++;
        }
        while (divisor <= 10){
            System.out.println(zahl);
            zahl = zahl / divisor;
            divisor++;
        }
    }
}
