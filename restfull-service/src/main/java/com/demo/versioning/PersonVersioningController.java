package com.demo.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

	@GetMapping("v1/person")
	public PersonV1 personeV1()
	{
		return new PersonV1("Chetan Chitte");
	}
	
	@GetMapping("v2/person")
	public PersonV2 personeV2()
	{
		return new PersonV2(new Name("Chetan", "Chitte"));
	}
	
	@GetMapping(value = "/person/param", params = "version=1")
	public PersonV1 paramV1()
	{
		return new PersonV1("Chetan Chitte");
	}
	
	@GetMapping(value = "/person/param", params = "version=2")
	public PersonV2 paramV2()
	{
		return new PersonV2(new Name("Chetan", "Chitte"));
	}
	
	/*
	 * note :- param, header and produce are types of versions
	 */
}
