package com.caridadja.routing;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable("dojo") String str) {
		if(str.equals("dojo")) {
			str = "The dojo is awesome!";
		}
		else if(str.equals("burbank-dojo")) {
			str = "Burbank Dojo is located in Southern California";
			}
		else if(str.equals("san-jose")) {
			str = "SJ dojo is the headquarters";
		}
		return str;
		}
	
}
