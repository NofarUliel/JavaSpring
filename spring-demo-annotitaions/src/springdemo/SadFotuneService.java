package springdemo;

public class SadFotuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day :( ";
	}

}
