package pl.kostrowski.autosalon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


@EntityScan(basePackageClasses = {AutosalonApplication.class, Jsr310JpaConverters.class})
@SpringBootApplication
public class AutosalonApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutosalonApplication.class, args);
    }
}
