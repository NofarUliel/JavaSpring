package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method from the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// call new methods
		System.out.println("Email : " + theCoach.getEmail());
		System.out.println("Team : " + theCoach.getTeam());
		// close the context
		context.close();

	}

}
