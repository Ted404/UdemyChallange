public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if((hourOfDay >= 0 && hourOfDay < 8 && barking == true) || (hourOfDay == 23 && barking == true)){
            return true;
        }else{
            return false;
        }
    }
}
