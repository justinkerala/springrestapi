package com.justy.rest;

 
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

	@RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {//REST Endpoint.
 
        Message msg = new Message(player, "Hello " + player);
        return msg;
    }
	
	@RequestMapping("/reqbodyTesting/")
	public Object getmessage(@RequestBody @Valid ValidatedMessage msg,Errors ex)
	{
		List<String> names = new LinkedList<>();
		names.forEach(name -> System.out.println(name));

		if(ex.hasErrors())
		{
			//ex.getAllErrors().forEach(e->System.out.println(e.getDefaultMessage()));
			List<String> error = ex.getAllErrors().stream()
		            .map(e->e.getDefaultMessage().toString())
		            .collect(Collectors.toList());
			return error;
		}
		System.out.println("inside the controller.");
		 
		System.out.println(msg);
		return msg;
	}
	
	 
	
}
