public class TemperaturUmrechnung {
    public static void main(String[] args) {

        System.out.println(celsius2Fahrenheit(20));
        System.out.println(fahrenheit2Celsius(46));

    }

    public static double celsius2Fahrenheit(double celsius){
        double fahrenheit;
        fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;

    }
    public static double fahrenheit2Celsius(double fahrenheit){
        double celsius;
        celsius = (fahrenheit-32)*5/9;
        return celsius;
    }
}
