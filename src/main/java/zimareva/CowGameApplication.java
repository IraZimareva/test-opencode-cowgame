package zimareva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zimareva.service.MainService;
import zimareva.service.UserService;

@SpringBootApplication
public class CowGameApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(CowGameApplication.class, args);

//        Add user
        UserService userService =
                configurableApplicationContext.getBean(UserService.class);

        //Start new game
        MainService mainService=
                configurableApplicationContext.getBean(MainService.class);
        mainService.startNewGame(1L);

//        System.out.println("\n Users games" + userService.getUser(1L).getGames());
        System.out.println(userService.getUser(1L));
//        String benchmarkNumber = userService.getUser(1L).getGames().get(0).getBenchmarkNumber();
//        System.out.println("\n Benchmark number look like this " + benchmarkNumber);

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
        System.out.println("\n Users games after attempt " + userService.getUser(1L).getGames());
*/
    }
}
