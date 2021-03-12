package leo.bacherlorsthesis.agoratokenserver.config;

import leo.bacherlorsthesis.agoratokenserver.service.AgoraTokenService;
import leo.bacherlorsthesis.agoratokenserver.service.AgoraTokenServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AgoraTokenService getAgoraTokenService(){
        return new AgoraTokenServiceImpl();
    }
}
