package com.tyss.retailermanagementsystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tyss.retailermanagementsystem.dto.ProductBean;
import com.tyss.retailermanagementsystem.dto.RetailerBean;
import com.tyss.retailermanagementsystem.service.RetailerService;

@Controller
public class RetailerController {
	@Autowired
	private RetailerService service ;
	
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}  //end of Login page   

	@PostMapping("/login")         //same as that of jsp html names
	public String login(int id , String password,HttpServletRequest request) {
		RetailerBean bean =	service.login(id, password);
		if(bean == null) {
         request.setAttribute("msg", "Invalid credentials");
         return "login";
		}else {
         HttpSession session = request.getSession();
         session.setAttribute("bean", bean);
         return "home";
		}
	}   //end of Login
	
	
	@GetMapping("/createProfile")
	public String createProfile() {
		return "createProfile";
	}    //end of register page
	
	@PostMapping("/createProfile")
	public String createProfile(RetailerBean bean,ModelMap map) {
	int check =	service.createProfile(bean);
	if(check>0) {
		map.addAttribute("msg","You are registered and Id is"+check);
	}else {
		map.addAttribute("msg","Email is repeated");
	}
		return "login";
	}     //end of register
	
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name="bean",required= false) RetailerBean bean) {
		if(bean == null) {
			map.addAttribute("msg","Login First-------");
			return "login";
		}else {
			return "home";
		}
	}   //end of home page
	
	@PostMapping("/home")
	public String home() {
		return "home";
	}    //end of home
	
	@GetMapping("/updatePassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session != null) {
			return "updatePassword";
		} else {
			return "login";
		}
	} //end of changePassword()
	
	@PostMapping("/updatePassword")
	public String changePassword(String password,String confirmpassword,
			@SessionAttribute(name="bean")RetailerBean bean,ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.updatePassword(bean.getId(), password);
			map.addAttribute("msg","Password changed");
		}else {
			map.addAttribute("msg","Password not matching");
		}
		return "home";
	}      //end of updatepassword
	
	@GetMapping("/search")
	public String search(@RequestParam("id")int id,ModelMap map) {
		ProductBean bean = service.searchProduct(id);
		if(bean==null) {
			map.addAttribute("msg", "no data found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}//end of search
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	} //end of logout
	
	
}
