package ru.netology.homework_1.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.homework_1.systemprofile.DevProfile;
import ru.netology.homework_1.systemprofile.ProductionProfile;
import ru.netology.homework_1.systemprofile.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }

}
