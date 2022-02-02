package com.hcl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
	@Autowired
	SignUpDAO dao;
	@Autowired
	LoginDAO dao1;
	/*@RequestMapping("Sign in")
	public ModelAndView loadSaveEmployee(SignUpUser user) {
		ModelAndView mv=new ModelAndView();
		//System.out.println(employee.getId());
		dao.save(user);
		mv.setViewName("SignUp");
		return mv;
	}*/
	@RequestMapping("Start")
	public ModelAndView loadLandingPage()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FirstPage");
		return mv;
	}
	@RequestMapping("Home")
	public ModelAndView loadHome()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
	@RequestMapping("About")
	public ModelAndView loadAbout()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("About");
		return mv;
	}
	@RequestMapping("Contact")
	public ModelAndView loadContact()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Contact");
		return mv;
	}
	@RequestMapping("Services")
	public ModelAndView loadServices()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Services");
		return mv;
	}
	@RequestMapping("Review")
	public ModelAndView loadReview()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Review");
		return mv;
	}
	@RequestMapping("Photos")
	public ModelAndView loadPhotos()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Photos");
		return mv;
	}
	/*@RequestMapping("LoginServlet")
	public ModelAndView loadBooking()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Booking");
		return mv;
	}
	@RequestMapping("Booking")
	public ModelAndView loadLogin()
	{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Booking");
		return mv;
	}*/
	
	@RequestMapping("SignUp")
	public ModelAndView loadSignUp()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SignUp");
		return mv;
	}
	@RequestMapping("FirstPage")
	public ModelAndView loadSignUp1()
	{
		ModelAndView mv = new ModelAndView();
		//dao.save(user);
		mv.setViewName("SignUp");
		return mv;
	}
	@RequestMapping("Sign in")
	public ModelAndView loadSignUp1(SignUpUser user)
	{
		ModelAndView mv = new ModelAndView();
		dao.save(user);
		mv.setViewName("SignUp");
		return mv;
	}
	@RequestMapping("Login")
	public ModelAndView loadbooking(LoginUser login)
	{
		ModelAndView mv = new ModelAndView();
		dao1.save(login);
		mv.setViewName("Booking");
		return mv;
	}

	@RequestMapping("First")
	public ModelAndView loadSignUp2()
	{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("FirstPage");
		return mv;
	}
	@RequestMapping("Room1")
	public ModelAndView loadRoom1()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Room1");
		return mv;
	}
	@RequestMapping("Room2")
	public ModelAndView loadRoom2()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Room2");
		return mv;
	}
	@RequestMapping("Room3")
	public ModelAndView loadRoom3()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Room3");
		return mv;
	}
	
}