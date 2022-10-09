package cc.mrbird.febs.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author MrBird
 */
@SpringBootApplication
@Slf4j
public class FebsGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FebsGatewayApplication.class)
                .web(WebApplicationType.REACTIVE)
                .run(args);
    }
}
