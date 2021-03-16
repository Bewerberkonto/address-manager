package com.mossmann.address.controller;

import com.mossmann.address.model.Person;
import com.mossmann.address.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/person-list")
public class PersonListController {

	private final PersonRepository personRepo;

	@Autowired
	public PersonListController(PersonRepository personRepo){
		this.personRepo = personRepo;
	}


	@GetMapping("/")
	public String personList(Model model) {
		Iterable<Person> personList =  personRepo.findAll();
		model.addAttribute("persons", personList);
		return "/person/person-list";
	}
}
