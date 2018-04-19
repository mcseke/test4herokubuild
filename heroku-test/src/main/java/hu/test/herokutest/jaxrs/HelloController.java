package hu.test.herokutest.jaxrs;


import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	static final Log logger = LogFactory.getLog(HelloController.class);
	
	
	@RequestMapping(value = "/hello", produces=MediaType.TEXT_PLAIN_VALUE)
    public String hello(@RequestParam(value="name", required=true) String name) throws IOException, Exception {
		
		return "Hello "+name;
		      
	}

	
}
