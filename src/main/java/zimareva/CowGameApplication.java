package zimareva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zimareva.model.User;
import zimareva.service.UserService;
import zimareva.utils.Randomizer;

@SpringBootApplication
public class CowGameApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(CowGameApplication.class, args);

//        Add user
        UserService userService =
                configurableApplicationContext.getBean(UserService.class);
        User user = new User("Zimareva II","irka@mail.ru","password");
        userService.addUser(user);

        //Start new game
        userService.startNewGame(1L);
        System.out.println("users games" + userService.getUser(1L).getGames());
        System.out.println(userService.getUser(1L));

        //Тест на генерацию значений
       /* for(int i=0; i < 5; i++){
            System.out.println("Generated value " + Randomizer.generateGameNumber());
        }*/
    }
}
