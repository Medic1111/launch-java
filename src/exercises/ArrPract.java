package exercises;

import java.util.ArrayList;
import java.util.Arrays; // NEED THIS TO SOUT ARRAYS

public class ArrPract {

    public static int getSum(ArrayList<Integer> nums){
        int total = 0;

        for (Integer num : nums) {
            if(num%2==0) {
                total+=num;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] singleLine = {1,1,2,3,5,8};

        for(int el : singleLine){
           if(el%2!=0) {
               System.out.println(el);
           }
        }

        String weird = "I would not, could not," +
                " in a box. I would not, could not" +
                " with a fox. I will not eat them in" +
                " a house. I will not eat them with a" +
                " mouse.";

        String[] splitting = weird.split(" ");
        System.out.println(Arrays.toString(splitting));

        String[] splittingAgain = weird.split("\\.");
        System.out.println(Arrays.toString(splittingAgain));

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(4);
        intArr.add(12);
        intArr.add(24);
        intArr.add(33);
        intArr.add(53);
        intArr.add(78);
        intArr.add(23);
        intArr.add(88);
        intArr.add(990);

        System.out.println(getSum(intArr));

    }
}
