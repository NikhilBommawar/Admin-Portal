package com.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    
	
	@RequestMapping("/InsertUser")
	public ModelAndView Insert(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		UserPOJO user=ac.getBean(UserPOJO.class);
		UserDAO dao=ac.getBean(UserDAO.class);
		user.setUname(request.getParameter("uname"));
		user.setAadhar(request.getParameter("aadhar"));
		user.setContact(request.getParameter("contact"));
		user.setUid(request.getParameter("uid"));
		user.setPassword(request.getParameter("password"));
		int row=dao.insertUser(user);
		
		if(row>0) {
			mv.setViewName("success.jsp");
			return mv;
		}
		else {
			mv.setViewName("failure.jsp");
			return mv;
	
		}

	}
	
	@RequestMapping("/GetDetails")
	public ModelAndView GetUser(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		UserPOJO user=ac.getBean(UserPOJO.class);
		UserDAO dao=ac.getBean(UserDAO.class);
		// user.setUid(request.getParameter("uid"));
		List<UserPOJO> list=dao.getUserDetails();
		 String id=request.getParameter("uid");
		 for(UserPOJO usr:list) {
			 if(usr.getUid().equals(id)) {
				 System.out.println(usr.getUname());
				 mv.setViewName("displayUser.jsp");
			     mv.addObject("user",usr);

			 }
			
		 }
		 return mv;
		 }
	

	@RequestMapping("/EditUser")
	public ModelAndView EditUser(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		UserPOJO user=ac.getBean(UserPOJO.class);
		UserDAO dao=ac.getBean(UserDAO.class);
		user.setUname(request.getParameter("uname"));
		user.setAadhar(request.getParameter("aadhar"));
		user.setContact(request.getParameter("contact"));
		user.setUid(request.getParameter("uid"));
		user.setSrNo(Integer.parseInt(request.getParameter("SrNo")));
		user.setPassword(request.getParameter("password"));
	    dao.editUser(user);
	    mv.setViewName("success.jsp");
	    return mv;
	
	}
		 
	@RequestMapping("/DeleteUser")
	public 	ModelAndView DeleteUser(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		UserPOJO user=ac.getBean(UserPOJO.class);
		UserDAO dao=ac.getBean(UserDAO.class);
		user.setSrNo(Integer.parseInt(request.getParameter("SrNo")));
    	user.setUid(request.getParameter("uid"));	
        dao.deleteUser(user); 	
        mv.setViewName("deleted.jsp");
	    return mv;
		 }
}
	

