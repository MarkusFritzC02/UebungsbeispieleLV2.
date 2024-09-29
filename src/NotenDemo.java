public class NotenDemo {
    public static void main(String[] args) {

        System.out.println(getNotentext(24));
        System.out.println(getNotentext(55));
        System.out.println(getNotentext(76));
        System.out.println(getNotentext(88));
        System.out.println(getNotentext(91));
    }

    public static String getNotentext(int Punkte){
        
        if (Punkte >= 90){
            return "Sehr Gut";
        } else if (Punkte >= 78){
            return "Gut";
        } else if (Punkte >= 65) {
            return "Befriedigend";
        } else if (Punkte >= 51) {
            return "Genügend";
        } else
        {return "Ungenügend";}
    }
}
