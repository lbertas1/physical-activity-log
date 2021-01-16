package bartos.lukasz.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("property")  // prefix zmiennych z pliku properties ktore beda tutaj zaciagane
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Property {
    private String nazwa;
}
