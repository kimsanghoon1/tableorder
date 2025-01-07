package tableorder.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import tableorder.MenuApplication;

@Entity
@Table(name = "Menu_table")
@Data
//<<< DDD / Aggregate Root
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static MenuRepository repository() {
        MenuRepository menuRepository = MenuApplication.applicationContext.getBean(
            MenuRepository.class
        );
        return menuRepository;
    }
}
//>>> DDD / Aggregate Root
