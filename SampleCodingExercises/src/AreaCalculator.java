public class AreaCalculator {
    private static final double INVALID_VALUE_CHECK = -1.0;
    public static void main(String[] args) {

        area(-1,-1);
    }
    public static double area(double radius){
        if(radius<0){
            return INVALID_VALUE_CHECK;
        }
        double AreaCircle =  radius*radius*3.14159;
        return AreaCircle;
    }
    public  static double area(double x, double y){
        if(x<0 || y<0){
            return INVALID_VALUE_CHECK;
        }
        double AreaRectangle=  x * y;
       return AreaRectangle;
    }
}
