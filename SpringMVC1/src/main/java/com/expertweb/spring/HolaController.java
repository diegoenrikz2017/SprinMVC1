package com.expertweb.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {
	@RequestMapping("irHola")
	public ModelAndView redireccion() {
		ModelAndView MV = new ModelAndView("hola","mensaje","Mensaje desde el Controller");
//		MV.setViewName("hola");
//		MV.addObject("mensaje", "Hola soy un mensaje desde un Controller");
		return MV;
	}
}
