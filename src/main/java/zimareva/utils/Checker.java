package zimareva.utils;

import java.util.List;

public class Checker {

    //todo: дописать логику
    public static int [] checkNumber(String checkNumberStr, String benchmarkNumberStr){
        List<Integer> checkNumber = Converter.convertStringToListOfInteger(checkNumberStr);
        List<Integer> benchmarkNumber = Converter.convertStringToListOfInteger(benchmarkNumberStr);
        int cow;
        int bull;
        int [] result = new int[2];

        cow = checkCow(checkNumber, benchmarkNumber);
        bull = checkBull(checkNumber, benchmarkNumber);
        result[0] = bull;
        result[1] = cow - bull;

        System.out.println("Check bull " + result[0]);
        System.out.println("Check cow " + result[1]);

        return null ;
    }

    //todo: такая проверка выдаст неправильное значение для повторяющихся чисел пользавтеля
    //todo: например для ввода 4444 (при эталоне 1234). Вывод будет 0Б4К, тогда как правильно должно быть 0Б1К
    private static int checkCow(List<Integer> checkNumber, List<Integer> benchmarkNumber){
        int cow = 0;
        for(Integer number: checkNumber){
            if(benchmarkNumber.contains(number)) cow++;
        }
        return cow;
    }

    private static int checkBull(List<Integer> checkNumber, List<Integer> benchmarkNumber){
        int bull = 0;
        for(int i = 0; i < 4; i++){
            if(checkNumber.get(i).equals(benchmarkNumber.get(i))) bull++;
        }
        return bull;
    }
}
