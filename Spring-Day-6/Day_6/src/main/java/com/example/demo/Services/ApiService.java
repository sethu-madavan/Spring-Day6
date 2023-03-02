package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Child;
import com.example.demo.Repositories.ChildRepo;

@Service
public class ApiService {
	
	@Autowired
	private ChildRepo repo;
	
	public List<Child> sortByField(String field) {
		return repo.findAll(Sort.by(field));
	}

	public Page<Child> paginationWithoutSorting(int pageNo, int pageSize) {
		Pageable page = PageRequest.of(pageNo, pageSize);
		return repo.findAll(page);
	}

	public Page<Child> paginationWithSorting(int pageNo, int pageSize, String field) {
		Pageable page = PageRequest.of(pageNo, pageSize).withSort(Sort.by(field));
		return repo.findAll(page);
	}
	
	public void addChild(Child child) {
		repo.save(child);
	}
	
	public List<Child> showChild() {
		return repo.findAll();
	}

}
