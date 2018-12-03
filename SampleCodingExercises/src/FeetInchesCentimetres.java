public class FeetInchesCentimetres {
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(157);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    //METHOD OVERLOADING - More then one method with the same name having different parameter //
   ////////////////////////////////////////////////////////////////////////////////////////////
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double feetToCent = feet * 30.48;
            double inchesToCent = inches * 2.54;
            double resultCent = feetToCent + inchesToCent;
            System.out.println(feet + " feet, " + inches + " inches = " + resultCent + "cms.");
            return resultCent;
        } else {
            System.out.println("Invalid parameters for feet and inches.");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) { //second method using different signature
        if (inches >= 0) {
            double inchesToFeet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + inchesToFeet + " feet and " + remainingInches + " inches.");
            return calcFeetAndInchesToCentimeters(inchesToFeet,remainingInches); //return the values from second method to first method
        } else
            System.out.println("invalid parameters");
        return -1;
    }

}
