package others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumber {

    public static void main(String[] args) {

        int[] numbers = {71, 18, 42, 21, 67, 32, 95, 14, 56, 87};

        List<Integer> number1 = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);


        List<Integer> oddNumber =number1.stream().filter(n -> n% 2 != 0).collect(Collectors.toList());

        List<Integer> evenNumber =number1.stream().filter(n -> n% 2 == 0).collect(Collectors.toList());

        System.out.println(oddNumber);
        System.out.println(evenNumber);
        System.out.println("Even Number :");

        for(int i:evenNumber){
            System.out.println(i);
        }

        System.out.println("Odd Number :");
        for(int i:oddNumber){
            System.out.println(i);
        }
    }
}
