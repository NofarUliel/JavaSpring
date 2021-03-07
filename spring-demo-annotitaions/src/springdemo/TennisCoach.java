package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println(">>TennisCoach : inside default constructor");
	}
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	//define a setter method for injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>TennisCoach : inside setFortuneService() ");
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
