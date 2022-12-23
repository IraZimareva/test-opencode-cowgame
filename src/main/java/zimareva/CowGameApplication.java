package zimareva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zimareva.service.MainService;

@SpringBootApplication
public class CowGameApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(CowGameApplication.class, args);

        MainService mainService=
                configurableApplicationContext.getBean(MainService.class);

        //Тест на генерацию значений по условию неповторяемости элементов
       /* for(int i=0; i < 5; i++){
            System.out.println("Generated value " + Randomizer.generateGameNumber());
        }*/

       //Тест Конвертера
        /*List<Integer> listOfInteger = Converter.convertStringToListOfInteger(benchmarkNumber);
        System.out.println("List of Integer after converting " + listOfInteger);*/

        //Тест Чекера (Проверяльщика)
        /*List<Integer> checkNumber = Randomizer.generateGameNumber();
        Checker.checkNumber(Converter.convertListOfIntegerToString(checkNumber), benchmarkNumber);
        System.out.println("\n Check benchmrk with benchmark \n");
        Checker.checkNumber(benchmarkNumber, benchmarkNumber);*/

        //Тест метода zimareva.service.MainService.checkNumber
        /*ResultDTO result = mainService.checkNumber(2L, new String("1234"));
        System.out.println("\n Result DTO id " + result);
*/
    }
}
