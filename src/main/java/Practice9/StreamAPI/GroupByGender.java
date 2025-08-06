package Practice9.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {
    // список строк с именами и полом "John:M", "Sarah:F"
    // сгруппировать по полу в мапу Map<String>, List<Sring>
    //                              пол-список имен

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John:M", "Sarah:F", "Sasha:F", "Nick:M");

        // Map<String, List<String>> groupeByGender = names.stream()
           //      .collect(Collectors.groupingBy(name -> name.split(":")[1],
           //             Collectors.mapping(name -> name.split(":")[0], Collectors.toList())));

        Map<String, List<String>> groupeByGender = names.stream()
                .collect(Collectors.groupingBy(name -> {
                    System.out.println("key before transformation: " + name);
                    System.out.println("key after transformation: " + name.split(":")[1]);
                    return name.split(":")[1]; },
                        Collectors.mapping(name -> {
                            System.out.println("value before transformation: " + name);
                            System.out.println("value after transformation: " + name.split(":")[0]);
                            return name.split(":")[0];},
                                Collectors.toList())));

        System.out.println(groupeByGender);

    }
}
