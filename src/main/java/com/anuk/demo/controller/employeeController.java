package com.anuk.demo.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.anuk.demo.dao.employeeDao;
import com.anuk.demo.model.Employee;

@RestController
public class employeeController {

	@Autowired
	employeeDao empService;

	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("show")
	public String showForm() {

		return "empForm";
	}


	
	// @ResponseBody
	@PostMapping("save")
	public void save(@RequestBody Employee emp) {
		empService.save(emp);
	}
	
	

	// @ResponseBody
		@RequestMapping(value="save", method=RequestMethod.PUT)
		public void updateEmp(@RequestBody Employee emp) {
			empService.save(emp);
		}
	



	@RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
	public void empDelete(@PathVariable("id") int id) {
		System.out.println(id);
		empService.deleteById(id);
		// return "redirect:/empView";
	}

	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<Employee> empJson() {
		List<Employee> empList = new ArrayList<>();

		empService.findAll().forEach(empList::add);
		return empList;
	}

}
