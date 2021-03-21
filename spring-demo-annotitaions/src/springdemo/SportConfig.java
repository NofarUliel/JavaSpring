package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springdemo")//name of package
public class SportConfig {
	
	//define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFotuneService();
	}
	
	//define bean for our swim coach and injection dependency 
	@Bean
	public Coach swimCoach (){
		return new SwimCoach(sadFortuneService());
		
	}
}
