/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vkalyana
 *
 */
@Controller
public class RateController {

	@Value("${rate}")
	String rate;
	
	@Value("${lanecount}")
	String laneCount;
	
	@Value("${tollstart}")
	String tollStart;
	
	@RequestMapping("/rate")
	public String getRate(Model m) {
		
		m.addAttribute("rateAmount", rate);
		m.addAttribute("lanes", laneCount);
		m.addAttribute("tollStart", tollStart);
		
		// name view
		return "rateview";
	}
}
