package zimareva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zimareva.model.User;
import zimareva.service.UserService;

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
        System.out.println(userService.getUser(1L));

    }
}
