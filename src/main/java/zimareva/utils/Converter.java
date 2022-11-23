package zimareva.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static String convertListOfIntegerToString(List<Integer> intList){
        return intList.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining());
    }

    public static List<Integer> convertStringToListOfInteger(String stringToConvert){
        List<String> listOfString = new ArrayList<>(Arrays.asList(stringToConvert.split("")));
        System.out.println("List of strings after converting " + listOfString);
        return listOfString.stream()
                .map(n -> Integer.valueOf(n))
                .collect(Collectors.toList());
    }
}
