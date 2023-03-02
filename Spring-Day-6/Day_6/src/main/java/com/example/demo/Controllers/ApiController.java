package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Services.ApiService;

@RestController
public class ApiController {

	@Autowired
	private ApiService childServ;

	@PostMapping("/")
	public boolean addChild(@RequestBody Child child) {
		childServ.addChild(child);
		return true;
	}

	@GetMapping("/{field}")
	public List<Child> addChild(@PathVariable("field") String field) {
		return childServ.sortByField(field);
	}

	@GetMapping("/{offset}/{pagesize}")
	public Page<Child> paginationWithoutSort(@PathVariable("offset") int pageNum, @PathVariable("pagesize") int pageSize) {
		return childServ.paginationWithoutSorting(pageNum, pageSize);
	}
	
	@GetMapping("/{offset}/{pagesize}/{field}")
	public Page<Child> paginationWithSort(@PathVariable("offset") int pageNum, @PathVariable("pagesize") int pageSize, @PathVariable("field") String field) {
		return childServ.paginationWithSorting(pageNum, pageSize, field);
	}

}
