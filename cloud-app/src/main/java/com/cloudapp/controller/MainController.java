package com.cloudapp.controller;

import java.util.*;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloudapp.service.*;
import com.cloudapp.entity.*;

@Controller
public class MainController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private TollService tollService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String getWelcomePage() {
		
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String showNextPage(@RequestParam String usertype, @RequestParam String submit) {
		
		if(usertype.equals("Admin") && submit.equals("register")) {
			return "redirect:index";
		}
		else if(usertype.equals("Manager") && submit.equals("register")) {
			return "redirect:manager-registration";
		}
		else if(usertype.equals("User") && submit.equals("register")) {
			return "redirect:user-registration";
		}
		else if(usertype.equals("Admin") && submit.equals("login")) {
			return "redirect:admin-login";
		}
		else if(usertype.equals("Manager") && submit.equals("login")) {
			return "redirect:manager-login";
		}
		else {
			return "redirect:user-login";
		}
	}
	
	@RequestMapping(value="/admin-login", method=RequestMethod.GET)
	public String getAdminLoginPage() {
		
		return "admin-login";
	}
	
	@RequestMapping(value="/admin-login", method=RequestMethod.POST)
	public String showAdminApprovalPage(Model model, @RequestParam String name, @RequestParam int userid, @RequestParam String password) {
		
		int check = loginService.checkAdminCredentials(name, userid, password);
		
		if(check == 1)
			return "redirect:admin-approval";		
		else if(check == -1) {
			model.addAttribute("Invalid", "Enter only admin credentials");
			return "admin-login";
		}
		else {
			model.addAttribute("Invalid", "Invalid Login! Enter correct credentials");
			return "admin-login";
		}
	}
	
	@RequestMapping(value="/manager-login", method=RequestMethod.GET)
	public String getManagerLoginPage() {
		
		return "manager-login";
	}
	
	@RequestMapping(value="/manager-login", method=RequestMethod.POST)
	public String showManagerApprovalPage(Model model, @RequestParam String name, @RequestParam int userid, @RequestParam String password) {
		
		int check = loginService.checkManagerCredentials(name, userid, password);
		
		if(check == 1)
			return "redirect:manager-access";
		else if(check == -1) {
			model.addAttribute("Invalid", "Enter only manager credentials");
			return "manager-login";
		}
		else {
			model.addAttribute("Invalid", "Invalid Login! Enter correct credentials");
			return "manager-login";
		}
	}
	
	@RequestMapping(value="/user-login", method=RequestMethod.GET)
	public String getUserLoginPage(Model model) {
		
		//model.addAttribute("Login", "Your details are successfully submitted");
		return "user-login";
	}
	
	@RequestMapping(value="/user-login", method=RequestMethod.POST)
	public String showUserApprovalPage(Model model, @RequestParam String name, @RequestParam int userid, @RequestParam String password) {
		
		int check = loginService.checkUserCredentials(name, userid, password);
		
		if(check == 1) 
			return "redirect:home";
		else if(check == -1) {
			model.addAttribute("Invalid", "Enter only user credentials");
			return "user-login";
		}
		else {
			model.addAttribute("Invalid", "Invalid Login! Enter correct credentials");
			return "user-login";
		}
	}
	
	@RequestMapping(value="/admin-approval", method=RequestMethod.GET)
	public String getAdminApprovalPage(Model model) {
		
		return "admin-approval";
	}
	
	@RequestMapping(value="/admin-approval", method=RequestMethod.POST)
	public String showRegistrationDetails(@RequestParam String approval) {
		
		if(approval.equals("managerlist")) {
			return "redirect:manager-list";
		}
		else if(approval.equals("tolllist")) {
			return "redirect:toll-list";
		}
		else if(approval.equals("citylist")) {
			return "redirect:city-list";
		}
		
		return "admin-approval";
	}
	
	@RequestMapping(value="/manager-list", method=RequestMethod.GET)
	public String getManagerListPage(Model model) {
		
		List<ManagerRegistrationDetails> managerList = registrationService.getDetails();
		model.addAttribute("managerList", managerList);
		
		return "manager-list";
	}
	
	@RequestMapping(value="/manager-list", method=RequestMethod.POST)
	public String showManagerRegistrationDetails(@RequestParam String approval, @RequestParam int userid) {
		
		if(approval.equals("accept")) {
			registrationService.updateApprovalDataById(userid);
			registrationService.addApprovedManagerDetailsById(userid);
		}
		else if(approval.equals("reject")) {
			registrationService.rejectApprovedDataById(userid);
		}
		
		return "redirect:manager-list";
	}
	
	@RequestMapping(value="/toll-list", method=RequestMethod.GET)
	public String getTollListPage(Model model) {
		
		List<TollGateDetails> tollDetails = tollService.getDetails();
		model.addAttribute("tollDetails", tollDetails);
		
		return "toll-list";
	}
	
	@RequestMapping(value="/toll-list", method=RequestMethod.POST)
	public String showTollDetails(@RequestParam String approval, @RequestParam int id) {
		
		if(approval.equals("accept")) {
			tollService.updateApprovalDataById(id);
		}
		else if(approval.equals("reject")) {
			tollService.rejectApprovedDataById(id);
		}
		
		return "redirect:toll-list";
	}
	
	@RequestMapping(value="/city-list", method=RequestMethod.GET)
	public String getCityListPage(Model model) {
		
		List<TollDetails> cityList = tollService.getTollCities();
		model.addAttribute("cityList", cityList);
		
		return "city-list";
	}
	
	@RequestMapping(value="/city-list", method=RequestMethod.POST)
	public String showCityDetails(@RequestParam String approval, @RequestParam int id) {
		
		if(approval.equals("accept")) {
			tollService.updateCityApprovalDataById(id);
		}
		else if(approval.equals("reject")) {
			tollService.rejectCityApprovedDataById(id);
		}
		
		return "redirect:city-list";
	}
	
	@RequestMapping(value="/manager-registration", method=RequestMethod.GET)
	public String getManagerRegistrationPage() {
		
		return "manager-registration";
	}
	
	@RequestMapping(value="/manager-registration", method=RequestMethod.POST)
	public String passManagerRegistrationDetails(@RequestParam int userid, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age, @RequestParam String phoneNumber, @RequestParam String address, @RequestParam String gender, @RequestParam String email, @RequestParam String password) {
		
		registrationService.addManagerResgistrationDetails(userid, firstname, lastname, age, gender, phoneNumber, address, email, password);
		return "redirect:manager-login";
	}
	
	@RequestMapping(value="/user-registration", method=RequestMethod.GET)
	public String getUserRegistrationPage() {
		
		return "user-registration";
	}
	
	@RequestMapping(value="/user-registration", method=RequestMethod.POST)
	public String passUserRegistrationDetails(@RequestParam int userid, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age, @RequestParam String phoneNumber, @RequestParam String address, @RequestParam String gender, @RequestParam String email, @RequestParam String password) {
				
		registrationService.addUserResgistrationDetails(userid, firstname, lastname, age, gender, phoneNumber, address, email, password);
		
		return "redirect:user-login";
	}
	
	@RequestMapping(value="/manager-access", method=RequestMethod.GET)
	public String getManagerAccessPage() {		
		
		return "manager-access";
	}
	
	@RequestMapping(value="/manager-access", method=RequestMethod.POST)
	public String showManagerAccessPage(@RequestParam String submit) {
		
		if(submit.equals("addtoll")) {
			return "redirect:add-toll";
		}
		else if(submit.equals("edittoll")) {
			return "redirect:edit-toll";
		}
		else if(submit.equals("addcity")) {
			return "redirect:add-city";
		}
		else if(submit.equals("editcity")) {
			return "redirect:edit-city";
		}
		else if(submit.equals("viewtoll")) {
			return "redirect:manager-view-toll-list";
		}
		else if(submit.equals("viewcity")) {
			return "redirect:manager-view-city-list";
		}
		
		return "manager-access";
	}
	
	@RequestMapping(value="/manager-view-toll-list", method=RequestMethod.GET)
	public String showTollListPage(Model model) {
		
		List<TollGateDetails> tollList = tollService.getDetails();
		model.addAttribute("tollList", tollList);
		
		return "manager-view-toll-list";
	}
	
	@RequestMapping(value="/manager-view-city-list", method=RequestMethod.GET)
	public String showCityListPage(Model model) {
		
		List<TollDetails> cityList = tollService.getTollCities();
		model.addAttribute("cityList", cityList);
		
		return "manager-view-city-list";
	}
	
	
	@RequestMapping(value="/add-toll", method=RequestMethod.GET)
	public String getAddTollPage() {
		
		return "add-toll";
	}
	
	@RequestMapping(value="/add-toll", method=RequestMethod.POST)
	public String addTollDetails(@RequestParam int id, @RequestParam String from, @RequestParam String to, @RequestParam int count, @RequestParam String cities, @RequestParam int amount) {
		
		tollService.addDetails(id, from, to, count, cities, amount);
		return "redirect:manager-access";
	}
	
	@RequestMapping(value="/edit-toll", method=RequestMethod.GET)
	public String getEditTollPage() {
		
		return "edit-toll";
	}
	
	@RequestMapping(value="/edit-toll", method=RequestMethod.POST)
	public String showEditTollPage(@RequestParam int id, @RequestParam String from, @RequestParam String to, @RequestParam int count, @RequestParam String cities, @RequestParam int amount) {
		
		tollService.editDetails(id, from, to, count, cities, amount);
		return "redirect:manager-access";
	}
	
	@RequestMapping(value="/add-city", method=RequestMethod.GET)
	public String getAddCityPage() {
		
		return "add-city";
	}
	
	@RequestMapping(value="/add-city", method=RequestMethod.POST)
	public String addCityDetails(@RequestParam int id, @RequestParam String name, @RequestParam int nooflanes, @RequestParam int classAlaneno, @RequestParam String classAlanevehicles, @RequestParam int classBlaneno, @RequestParam String classBlanevehicles, @RequestParam int classClaneno, @RequestParam String classClanevehicles, @RequestParam int classDlaneno, @RequestParam String classDlanevehicles) {
		
		tollService.addCityDetails(id, name, nooflanes, classAlaneno, classAlanevehicles, classBlaneno, classBlanevehicles, classClaneno, classClanevehicles, classDlaneno, classDlanevehicles);
		return "redirect:manager-access";
	}
	
	@RequestMapping(value="/edit-city", method=RequestMethod.GET)
	public String getEditCityPage() {
		
		return "edit-city";
	}
	
	@RequestMapping(value="/edit-city", method=RequestMethod.POST)
	public String editCityDetails(@RequestParam int id, @RequestParam String name, @RequestParam int nooflanes, @RequestParam int classAlaneno, @RequestParam String classAlanevehicles, @RequestParam int classBlaneno, @RequestParam String classBlanevehicles, @RequestParam int classClaneno, @RequestParam String classClanevehicles, @RequestParam int classDlaneno, @RequestParam String classDlanevehicles) {
		
		tollService.editCityDetails(id, name, nooflanes, classAlaneno, classAlanevehicles, classBlaneno, classBlanevehicles, classClaneno, classClanevehicles, classDlaneno, classDlanevehicles);
		return "redirect:manager-access";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHomePage(Model model) {
		
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String showHomePage(Model model, @RequestParam String from, @RequestParam String to) {
		if(from.equals(to)) {
			model.addAttribute("Invalid", "Select different starting and ending points");
			return "home";
		}
		else {
			List<TollGateDetails> tollList = tollService.getApprovedTollsByLocations(from, to);
			model.addAttribute("tollList", tollList);
			
			List<TollDetails> cityList = tollService.getApprovedTollsByCities(from, to);
			model.addAttribute("cityList", cityList);
		}
		
		return "home";
	}	
}