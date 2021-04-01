package springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show initial HTML form

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// the method read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String modelData(HttpServletRequest request, Model model) {

		// read the request parameter from HTML form
		String name = request.getParameter("studentName");

		// convert data to all upper
		name = name.toUpperCase();

		// create the message
		String result = "Hi " + name;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}

	// the method read form data and add data to the model
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {

		// convert data to all upper
		name = name.toUpperCase();

		// create the message
		String result = "Hi my friend " + name;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
