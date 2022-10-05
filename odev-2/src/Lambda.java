import java.util.Arrays;
import java.util.List;

interface StringFunction {
    String run(String str);
}

public class Lambda {
    public void start() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        StringFunction func1 = (i) -> {
            return "> " + i + " <";
        };
        numbers.forEach((n) -> {
            char res = n > 4 ? '1' : '0';
            this.formFunction(n + ":" + res, func1);
        });
    }

    public void formFunction(String str, StringFunction func) {
        String result = func.run(str);
        System.out.println(result);
    }
}
