package gcumsa.domain;

import gcumsa.InHelloApplication;
import gcumsa.domain.Helloed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Hello_table")
@Data
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Helloed helloed = new Helloed(this);
        helloed.publishAfterCommit();
        // Get request from Hello
        //gcumsa.external.Hello hello =
        //    Application.applicationContext.getBean(gcumsa.external.HelloService.class)
        //    .getHello(/** mapping value needed */);

    }

    public static HelloRepository repository() {
        HelloRepository helloRepository = InHelloApplication.applicationContext.getBean(
            HelloRepository.class
        );
        return helloRepository;
    }
}
