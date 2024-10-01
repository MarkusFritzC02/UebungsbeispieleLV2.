public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println(calcFaculty(0));
        System.out.println(calcFaculty(1));
        System.out.println(calcFaculty(2));
        System.out.println(calcFaculty(3));
        System.out.println(calcFaculty(4));
        System.out.println(calcFaculty(5));
        System.out.println(calcFaculty(11));
        System.out.println(calcFaculty(15));
        System.out.println(calcFaculty(20));
    }

    public static long calcFaculty(int value) {
        long result = 1;

        if (value == 0 || value == 1){
            return 1;
        }

        for (int i = 2; i <= value; i++){
            result *= i;
        }
        return result;

    }
}
