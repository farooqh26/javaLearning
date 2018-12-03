public class DecimalComparator {
    public static void main(String[] args) {

            //double n1 = 96.57;
            //int rn1 = (int)Math.round(n1);
            //System.out.println("this " + rn1);
        areEqualByThreeDecimalPlaces(3.92929292929, 3.762762762);

    }

        public static boolean areEqualByThreeDecimalPlaces( double int1, double int2){
            double result1 = int1 * 1000;
            int roundResult1 = (int) result1;
            double result2 = int2 * 1000;
            int roundResult2 = (int) result2;

            if (roundResult1 == roundResult2){
                return true;
            }
            return false;
        }

        public static boolean hasEqualSum(int num1, int num2, int num3){
            if (num1 + num2 == num3){
                return true;
            }
            return false;

    }


}
