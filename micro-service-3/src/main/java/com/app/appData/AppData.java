package com.app.appData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@ConfigurationProperties("app-data") // prefix zmiennych z pliku properties
public class AppData {

    private String property1;
    private String property2;
    private String property3;
    private Integer property4;
}
