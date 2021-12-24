package noxml

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
//@ComponentScan(basePackages = "noxml")
@PropertySource("classpath:sport.properties")
class SportConfig {

    @Bean
    FortuneService sadFortuneService() {
        return  new SadFortuneService()
    }

    @Bean
    Coach swimCoach() {
        return new SwimCoach(sadFortuneService())
    }




}
