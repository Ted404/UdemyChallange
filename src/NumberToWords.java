public class NumberToWords {

    public static void numberToWords(int number){

        int counter = 0;
        int last = 0;
        int numberReversed = reverse(number);

        if(number<0){
            System.out.println("Invalid Value");
        }
        
        while(numberReversed!=0){
            last = numberReversed%10;
            counter = last;
            switch (counter){
                case 0:
                    System.out.print(" Zero ");
                    break;
                case 1:
                    System.out.print(" One ");
                    break;
                case 2:
                    System.out.print(" Two ");
                    break;
                case 3:
                    System.out.print(" Three ");
                    break;
                case 4:
                    System.out.print(" Four ");
                    break;
                case 5:
                    System.out.print(" Five ");
                    break;
                case 6:
                    System.out.print(" Six ");
                    break;
                case 7:
                    System.out.print(" Seven ");
                    break;
                case 8:
                    System.out.print(" Eight ");
                    break;
                case 9:
                    System.out.print(" Nine ");
                    break;
            }
            numberReversed = numberReversed/10;

        }
    }
    public static int reverse(int number){
        int count = 0;
        int last = 0;

        while (number != 0) {

            last = number%10;
            count = (count * 10) + last;
            number = number/10;

        }

        return count;
    }

    public static int getDigitCount(int number){
//        int count = 0;
//        int last = 0;
//        if(number < 0){
//            return -1;
//        }
//
//        while(number!=0){
//            count++;
//            last = number%10;
//            number/=10;
//
//        }
//        char[] a = new char[number];
        int count = 0;
        for (char c : new char[number]) {
            if ((c >= '0') || (c <= '9')){
                count++;
            }
        }

        return count;
    }
}
