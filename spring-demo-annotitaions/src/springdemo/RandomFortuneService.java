package springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create array of strings
	private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is mother of good luck",
			"The journey is the reward" };

	// create a random number generation
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
