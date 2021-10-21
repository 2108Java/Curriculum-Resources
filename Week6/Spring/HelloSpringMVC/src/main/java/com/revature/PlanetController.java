package com.revature;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

@Controller("PlanetAPIController")
@RequestMapping("/api/")  //localhost:<>/HelloSpringMVC/mvc/api/
public class PlanetController {
	
	@Autowired
	private PlanetDao pdao;
	
	@RequestMapping(value = "/planets/all", method = RequestMethod.GET)
	public @ResponseBody List<Planet> seeAllPlanets(){
		
		//Skip the service layer now, and use a dao layer!
		return pdao.viewAllPlanets();
	}
	
	@GetMapping(value = "/planets/name")
	public @ResponseBody Planet selectPlanetByName(@RequestParam Map<String,String> reqParam) {
		
		String name = reqParam.get("name");
		return pdao.selectPlanetByName(name);
	}
	
	@GetMapping(value = "/planets/{name}")
//	@RequestMapping(value = "/planets/{name}", method = RequestMethod.GET)
	public @ResponseBody Planet selectPlanetByName( @PathVariable("name") String name) {
		
		return pdao.selectPlanetByName(name);
	}
	
	@PostMapping(value = "/planets")
	@ResponseStatus(value = HttpStatus.CREATED)
	public void insertPlanet(@RequestBody Planet p, HttpSession hp) {
		
		if((Boolean) hp.getAttribute("access") == true) {
			pdao.insertPlanet(p);
		}
		
	}
	

}
