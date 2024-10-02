public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println(exchangeCurrency("HUF",12));
        System.out.println(exchangeCurrency("SEK",100));

    }

    public static double exchangeCurrency(String currencyID, double value){
        double result;
        String HUF = "HUF";
        String SEK = "SEK";
        String USD = "USD";
        String CAD = "CAD";

        if (currencyID.equals(HUF)){
            result = value * 328.61;
            return result;
        } else if (currencyID.equals(SEK)) {
            result = value * 10.76;
            return result;
        } else if (currencyID.equals(USD)) {
            result = value * 1.12;
            return result;
        } else if (currencyID.equals(CAD)) {
            result = value * 1.47;
            return result;
        } else {
            return value;
        }
    }
}
