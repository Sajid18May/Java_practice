package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Traditional approach
class P1 {
    static void main() {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<String> filteredNames = new ArrayList<>();
        for(String name :names)

        {
            if (name.startsWith("J")) {
                filteredNames.add(name.toUpperCase());
            }
        }
        System.out.println(filteredNames);

        // Stream API approach
        List<String> filteredNamesSA = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(filteredNamesSA);
    }

}