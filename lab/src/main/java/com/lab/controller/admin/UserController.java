package com.lab.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="admin/users")
public class UserController {
//	@Autowired
//	private HttpServletRequest request;
	@GetMapping()
	public String index() {
		return "admin/users/index";
	}
	@GetMapping(value = "{id}")
		public String show(
			Model model,
			@PathVariable("id") Integer  id
	) {
//		this.request.getParameter("id");
		System.out.println("id " +id);
		model.addAttribute("id",id);
		return "admin/users/show";
	}
	@GetMapping(value="/create")
	public String create() {
		return "admin/users/create";
	}
	@GetMapping(value="/store")
	public String store() {
		return "admin/users/store";
	}
	@GetMapping(value="/edit",params = "id")
	public String edit() {
		return "admin/users/edit";
	}
	@GetMapping(value="/update",params = "id")
	public String update() {
		return "admin/users/update";
	}
	@GetMapping(value="/delete",params = "id")
	public String delete() {
		return "admin/users/delete";
	}
	
}
