package net.java_school.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "안녕 스프링 MVC!");
		return "index";
	}
	
	@PostMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping(value = "/java/{article}")
	public String getJavaArticles(@PathVariable(name="article") String article) {
		return "java/" + article;
	}

	@GetMapping(value = "/jdbc/{article}")
	public String getJdbcArticles(@PathVariable(name="article") String article) {
		return "jdbc/" + article;
	}

	@GetMapping(value = "/jsp/{article}")
	public String getJspArticles(@PathVariable(name="article") String article) {
		return "jsp/" + article;
	}

	@GetMapping(value = "/css-layout/{article}")
	public String getCssLayoutArticles(@PathVariable(name="article") String article) {
		return "css-layout/" + article;
	}

	@GetMapping(value = "/jsp-pjt/{article}")
	public String getJspProjectArticles(@PathVariable(name="article") String article) {
		return "jsp-pjt/" + article;
	}

	@GetMapping(value = "/spring/{article}")
	public String getSpringArticles(@PathVariable(name="article") String article) {
		return "spring/" + article;
	}

	@GetMapping(value = "/google-app-engine/{article}")
	public String getGoogleAppEngineArticles(@PathVariable(name="article") String article) {
		return "google-app-engine/" + article;
	}

	@GetMapping(value = "/blog")
	public String getBlogHome() {
		return "blog/index";
	}

	@GetMapping(value = "/blog/{year}/{article}")
	public String getBlogs(@PathVariable(name="year") String year, @PathVariable(name="article") String article) {
		return "blog/" + year + "/" + article;
	}
}