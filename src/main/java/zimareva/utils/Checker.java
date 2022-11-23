package zimareva.utils;

import java.util.List;

public class Checker {

    public static ResultDTO checkNumber(String checkNumberStr, String benchmarkNumberStr){
        List<Integer> checkNumber = Converter.convertStringToListOfInteger(checkNumberStr);
        List<Integer> benchmarkNumber = Converter.convertStringToListOfInteger(benchmarkNumberStr);

        int cow = checkCow(checkNumber, benchmarkNumber);
        int bull = checkBull(checkNumber, benchmarkNumber);
        ResultDTO resultDTO = new ResultDTO(bull, cow - bull);

        System.out.println("Check bull " + resultDTO.getBull());
        System.out.println("Check cow " + resultDTO.getCow());

        return resultDTO;
    }

    //todo: такая проверка выдаст неправильное значение для повторяющихся чисел пользавтеля
    //todo: например для ввода 4444 (при эталоне 1234). Вывод будет 0Б4К, тогда как правильно должно быть 0Б1К
    private static int checkCow(List<Integer> checkNumber, List<Integer> benchmarkNumber){
        int cow = 0;
        for(Integer number: checkNumber){
            if(benchmarkNumber.contains(number)) {
                cow++;
            }
        }
        return cow;
    }

    private static int checkBull(List<Integer> checkNumber, List<Integer> benchmarkNumber){
        int bull = 0;
        for(int i = 0; i < 4; i++){
            if(checkNumber.get(i).equals(benchmarkNumber.get(i))) {
                bull++;
            }
        }
        return bull;
    }
}
