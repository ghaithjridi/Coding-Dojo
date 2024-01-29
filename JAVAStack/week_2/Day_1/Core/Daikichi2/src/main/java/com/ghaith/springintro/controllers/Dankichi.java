package com.ghaith.springintro.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Dankichi {
	@GetMapping("daikishis/{travel}/{Honolulu}")

	public String ShowClass(@PathVariable("travel") String  travel,@PathVariable("Honolulu") String  Honolulu) {
      
		return " congratulation!"+ travel +"to" + Honolulu;	
	}
	
	
	
		@GetMapping("daikishis/{lotto}/{count}")

		public String gretting(@PathVariable("lotto") String  lotto,@PathVariable("count") int  count) {
	       if (count % 2 ==0) {
	    	   return "You will take a grand journey in the near future, but be weary of tempting offers";
	       }
	       else {
	    	   return"You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	    	   
	       }
				
		}

}
