package springdemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theCourseCodeConstraintValidator) {
		boolean result;
		if (theCode != null) {
			result = theCode.startsWith(this.coursePrefix);
		} else {
			result = true;
		}

		return result;
	}

}
