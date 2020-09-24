public class overLoading {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(!(feet >= 0) || !(inches >= 0 && inches <= 12)){
            System.out.println("Invalid value");
            return -1;
        }

            return ((feet*12) + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(!(inches>=0)){
            return -1;
        }

        double totalFeet = (int)inches / 12;
        double totalInch = inches%12;
        System.out.println(totalFeet + " feet, " + totalInch + " inches");
        return calcFeetAndInchesToCentimeters(totalFeet, totalInch);

    }
}
