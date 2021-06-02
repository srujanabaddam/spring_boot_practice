package com.cah.spring.web.practice5.practice5;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PracticeController {
	  private static final Logger logger = LogManager.getLogger(PracticeController.class);

	    private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

	    @GetMapping("/")
	    public String getTask(Model model) {

	        if (logger.isDebugEnabled()) {
	            logger.debug("Hello from Log4j 2 - num : {}", num);
	        }

	        logger.debug("Hello from Log4j 2 - num : {}", () -> num);

	        model.addAttribute("tasks", num);

	        return "practice5"; //view
	    }

	  
}
