public class SumOfEvenNumbers {


    public static boolean isEvenNumber(int number){

        int count = 5;
        int evenCount = 0;
        int sum = 0;
        int finalNumber = 20;

        while(count <= finalNumber){
            count++;
            if (!isEvenNumber(count)) {
                continue;
            }
            evenCount++;
            System.out.println("Even number is " + count);
            if(evenCount<=5){
                sum+=count;
            }

        }
        System.out.println(sum);
        System.out.println(evenCount);

        while(number%2==0){
            return true;
        }
        return false;
    }
}
