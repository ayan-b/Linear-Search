import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaLinearSearch3 {
    public Integer linearSearch(List<Integer> numbers, Integer key ) {
        Integer result = null;
        Optional<Integer> number = numbers.stream().filter(n -> n.equals(key)).findFirst();
        if (number.isPresent()) {
            result = number.get();
        }
        return result;
    }

    public static void main(String[] args) {
        JavaLinearSearch3 javaLinearSearch3 = new JavaLinearSearch3();
        System.out.println(javaLinearSearch3.linearSearch(Arrays.asList(1,2,3,4,5), 3));
    }
}
