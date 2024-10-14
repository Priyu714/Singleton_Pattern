package others;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofCalculationOfString {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

      Map<Character, Long> frquencyMap =inputString.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        frquencyMap.forEach((k,v) -> System.out.println(k +"-"+ v));

        String[] items = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};

      Map<String,Long> m1 = Arrays.stream(items).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      m1.forEach((k,v) -> System.out.println(k +"-"+v));

        List<String> l1 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

      Map<String,Long> m2 =  l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      m2.forEach((k,v) -> System.out.println(k +"-"+v));

    }
}
