public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int big = bigCount*5;
        int small = smallCount*1;
        int sum = big+small;

        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
       if(big == 0){
           return (small>=goal);
       }else if(small==0){
           return (big==goal);
       }else if(big<goal){
           return (sum>=goal);
       }else{
           return ((goal%5)<=small);
       }
    }
}
