package zimareva.exception;

import java.text.MessageFormat;

public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException(Long gameId) {
        super(MessageFormat.format("Could not found gamewith id {0}", gameId));
    }
}
