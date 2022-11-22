package zimareva.utils;

import java.util.ArrayList;
import java.util.List;

public class Randomizer {

    public static List<Integer> generateGameNumber(){
        List<Integer> generatedValue = new ArrayList<>(4);
        generatedValue.add(generateRandomNumber());

        int nextNumber;
        while(generatedValue.size() < 4){
            nextNumber = generateRandomNumber();
            if(generatedValue.contains(nextNumber))
                continue;
            generatedValue.add(nextNumber);
        }
        return generatedValue;
    }

    private static int generateRandomNumber(){
        return (int) (Math.random() * 10);
    }
}
