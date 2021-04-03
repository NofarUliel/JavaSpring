package springdemo.mvc;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import springdemo.mvc.validation.CourseCode;

public class Customer {

	@NotNull(message = "is requerd")
	@Size(min = 1, message = "is requerd")
	private String firstName;
	private String lastName;
	
	@NotNull(message = "is requerd")
	@Min(value = 0, message = "must be greater than or equal to zero")
	@Max(value = 10, message = "must be greater than or equal to 10")
	private Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digit")
	private String postalCode;
	
	@CourseCode()
	private String courseCode;
	

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
