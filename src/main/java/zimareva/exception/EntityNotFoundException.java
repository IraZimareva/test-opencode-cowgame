package zimareva.exception;

import java.text.MessageFormat;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String entityName, Long id) {
        super(MessageFormat.format("Could not find entity {0} with id: {1} ", entityName, id));
    }
}
