package com.webshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.dto.NewDTO;
import com.webshop.service.INewService;

@RestController
public class NewAPI {

	@Autowired
	private INewService newService;

	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return newService.save(model);
	}

	@PutMapping(value = "/new/{id}")
	public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id) {
		model.setId(id);
		return newService.save(model);
	}

	@DeleteMapping(value = "/new")
	public void deleteNew(@RequestBody long[] ids) {
		newService.delete(ids);
	}
	/*
	 * @GetMapping(value = "/") public String home() { return "<h1>welcome</h1>"; }
	 */
}
