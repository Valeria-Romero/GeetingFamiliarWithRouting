package com.valeria;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	
	@RequestMapping(value="/dojo", method= RequestMethod.GET)
	public String getDojoHome() {
		return"<h1>The dojo is awesome</h1>";
	}
	
	
	@RequestMapping(value="/{dojo_name}", method=RequestMethod.GET)
	public String getDojoByName(@PathVariable("dojo_name") String dojoName) {

			if(dojoName.equals("burbank-dojo")) {
				return "Burbank Dojo is located in Southern California";
			}
			else {
				if(dojoName.equals("san-jose")) {
					return "SJ dojo is the headquarters";
				}
			}	
		return "That dojo doesn't exist";
	}
}
