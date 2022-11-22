package zimareva.utils;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntegerToStringConverter {

    public static String convertListOfIntegerToString (List<Integer> intList){
        return intList.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining());
    }
}
