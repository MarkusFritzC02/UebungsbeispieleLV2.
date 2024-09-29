public class WinterreifenpflichtDemo {
    public static void main(String[] args) {

        if (isWinterreifenPflicht(5,false)){
            System.out.println("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }
        if (isWinterreifenPflicht(3,false)){
            System.out.println("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }
        if (isWinterreifenPflicht(8,true)){
            System.out.println("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }
        if (isWinterreifenPflicht(12,false)){
            System.out.println("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }

    }

    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn) {
        if (temperatur < 10 && rutschigeFahrbahn){
            return true;
        } else if (temperatur < 4) {
            return true;
        } else {
            return false;
        }
    }
}
