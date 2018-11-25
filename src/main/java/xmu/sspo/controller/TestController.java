package xmu.sspo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	@RequestMapping("/home")
	public ModelAndView homePage(){
		ModelAndView newView = new ModelAndView("home");
		return newView;
	}
	
	@RequestMapping("/table_complete")
	public ModelAndView getSearch() {
		ModelAndView newView = new ModelAndView("table_complete");
		return newView;
	}

	@RequestMapping("/index")
	public ModelAndView getIndex() {
		ModelAndView newView = new ModelAndView("index");
		return newView;
	}
	
	@RequestMapping("/table_basic")
	public ModelAndView getTable_basic() {
		ModelAndView newView = new ModelAndView("table_basic");
		return newView;
	}
	
	@RequestMapping("/chart_line")
	public ModelAndView getChart_line() {
		ModelAndView newView = new ModelAndView("chart_diagram");
		return newView;
	}
	
	@RequestMapping("/chart_columnar")
	public ModelAndView getChart_columnar() {
		ModelAndView newView = new ModelAndView("chart_columnar");
		return newView;
	}
	
	@RequestMapping("/chart_pie")
	public ModelAndView getChart_pie() {
		ModelAndView newView = new ModelAndView("chart_pie");
		return newView;
	}
	
	@RequestMapping("/form_validate")
	public ModelAndView getForm_validate() {
		ModelAndView newView = new ModelAndView("form_validate");
		return newView;
	}
	
	@RequestMapping("/form_basic")
	public ModelAndView getForm_basic() {
		ModelAndView newView = new ModelAndView("form_basic");
		return newView;
	}
	
	@RequestMapping("/content")
	public ModelAndView getContent() {
		ModelAndView newView = new ModelAndView("content");
		return newView;
	}
	@RequestMapping("/login")
	public ModelAndView getLogin() {
		ModelAndView newView = new ModelAndView("login");
		return newView;
	}
}
