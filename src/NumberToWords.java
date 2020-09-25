public class NumberToWords {
    public static void numberToWords(int number){
        int reverse1=reverse(number);
        int CountNumber=getDigitCount(number);
        int CountReverse=getDigitCount(reverse1);
        int diff=CountNumber-CountReverse;
        if(number==0) {
            System.out.println("Zero");
        }
        if(number<0){
            System.out.println("Invalid Value");
        }
        while(reverse1>0) {
            int t = reverse1 % 10;
            if (t == 0) {
                System.out.println("Zero");
            } else if (t == 1) {
                System.out.println("One");
            } else if (t == 2) {
                System.out.println("Two");
            } else if (t == 3) {
                System.out.println("Three");
            } else if (t == 4) {
                System.out.println("Four");
            } else if (t == 5) {
                System.out.println("Five");
            } else if (t == 6) {
                System.out.println("Six");
            } else if (t == 7) {
                System.out.println("Seven");
            } else if (t == 8) {
                System.out.println("Eight");
            } else if (t == 9) {
                System.out.println("Nine");
            } else {
                System.out.println("Invalid");
            }
            //System.out.println(t);
            reverse1 = reverse1 / 10;
        }    while (diff > 0) {
            System.out.println("Zero");
            diff--;
        }

    }
    public static int reverse(int number){
        int reverse=0;
        while(number!=0){
            int l=number%10;
            reverse*=10;
            reverse=reverse+l;
            number=number/10;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        int count=0;
        if(number<0){return -1;}else if (number==0){
            count=1;
        }else{
            while(number>0){
                int t=number%10;
                if(t>=0){count++;}
                number=number/10;
            }
        }
        return count;
    }
}



//public class NumberToWords {
//
//    public static void numberToWords(int number){
//        int difference = getDigitCount(number) - reverse(number);
//        int counter = 0;
//        int last = 0;
//        int numberReversed = reverse(number);
//
//        if(number<0){
//            System.out.println("Invalid Value");
//        }
//
//        while(numberReversed!=0){
//            last = numberReversed%10;
//            counter = last;
//            switch (counter){
//                case 0:
//                    System.out.print(" Zero ");
//                    break;
//                case 1:
//                    System.out.print(" One ");
//                    break;
//                case 2:
//                    System.out.print(" Two ");
//                    break;
//                case 3:
//                    System.out.print(" Three ");
//                    break;
//                case 4:
//                    System.out.print(" Four ");
//                    break;
//                case 5:
//                    System.out.print(" Five ");
//                    break;
//                case 6:
//                    System.out.print(" Six ");
//                    break;
//                case 7:
//                    System.out.print(" Seven ");
//                    break;
//                case 8:
//                    System.out.print(" Eight ");
//                    break;
//                case 9:
//                    System.out.print(" Nine ");
//                    break;
//            }
//            numberReversed = numberReversed/10;
//        }
//        while(difference>0){
//            System.out.print(" Zero ");
//            difference--;
//        }
//    }
//    public static int reverse(int number){
//        int count = 0;
//        int last = 0;
//
//        while (number != 0) {
//
//            last = number%10;
//            count = (count * 10) + last;
//            number = number/10;
//
//        }
//
//        return count;
//    }
//
//    public static int getDigitCount(int number){
//        int count = 0;
//        int last = 0;
//        if(number < 0){
//            return -1;
//        }
//
//        while(number!=0){
//            number/=10;
//            count++;
//        }
//        return count;
//
//    }
//}
//
//
////return (int)Math.floor(Math.log10(number)+1);
////
////    String num = Integer.toString(number);
////    int len = ("" + number).length();
////        return len;