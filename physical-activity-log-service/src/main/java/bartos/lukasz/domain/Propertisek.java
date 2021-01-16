package bartos.lukasz.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app-data")  // prefix zmiennych z pliku properties ktore beda tutaj zaciagane
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Propertisek {
    private String property1;
    private String property2;
    private String property3;
    private Integer property4;
}
