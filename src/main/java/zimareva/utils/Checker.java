package zimareva.utils;

import zimareva.dto.CowBullDTO;

import java.util.List;

public class Checker {

    public static CowBullDTO checkNumber(String enteredNumberStr, String benchmarkNumberStr){
        List<Integer> checkNumber = Converter.convertStringToListOfInteger(enteredNumberStr);
        List<Integer> benchmarkNumber = Converter.convertStringToListOfInteger(benchmarkNumberStr);

        int cow = checkCow(checkNumber, benchmarkNumber);
        int bull = checkBull(checkNumber, benchmarkNumber);
        CowBullDTO cowBullDTO = new CowBullDTO(bull, cow - bull);

        System.out.println("Check bull " + cowBullDTO.getBull());
        System.out.println("Check cow " + cowBullDTO.getCow());

        return cowBullDTO;
    }

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
