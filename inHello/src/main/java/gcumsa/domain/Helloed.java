package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Helloed extends AbstractEvent {

    private Long id;

    public Helloed(Hello aggregate) {
        super(aggregate);
    }

    public Helloed() {
        super();
    }
}
