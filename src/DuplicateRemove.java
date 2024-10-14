import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemove {
    public static void main(String[] args) {

        String[] languages ={"java", "python","C#","java","kotlin","python"};

       List uniqueLanguage = Arrays.stream(languages).distinct().collect(Collectors.toList());

        System.out.println(uniqueLanguage);
    }
}
