package zimareva.utils;

import java.util.List;

public class Checker {

    //todo: дописать логику
    public static boolean checkNumber(String checkNumberStr, String benchmarkNumberStr){
        List<Integer> checkNumber = Converter.convertStringToListOfInteger(checkNumberStr);
        List<Integer> benchmarkNumber = Converter.convertStringToListOfInteger(benchmarkNumberStr);



        return true;
    }
}
