package zimareva.exception;

import java.text.MessageFormat;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super(MessageFormat.format("Could not found user with id : {0}", id));
    }
}
