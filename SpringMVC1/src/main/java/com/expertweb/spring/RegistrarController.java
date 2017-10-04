package com.expertweb.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.expertweb.model.Persona;

@Controller
public class RegistrarController {
		
	@RequestMapping("/irFormulario")
	public ModelAndView irFormulario() {
		return new ModelAndView("formulario","cmdForm",new Persona());
	}
	
	@RequestMapping(value="/agregar", method= {RequestMethod.GET, RequestMethod.POST})
	public String agregar(Persona per, ModelMap model){
		model.addAttribute("nombre", per.getNombre());
		model.addAttribute("apellido", per.getApellido());
		return "exito";
	}

}
