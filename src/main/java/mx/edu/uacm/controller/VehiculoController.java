package mx.edu.uacm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.edu.uacm.domain.Vehiculo;
import mx.edu.uacm.repository.VehiculoRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class VehiculoController {
	
	private Logger log = LogManager.getLogger(VehiculoController.class);
	
	
	//@Autowired //--> inyeccion de dependencias
	//VehiculoRepository vehiculoRepository; //No hagan esto
	
	//VehiculoService vehiculoService;
	
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public String guardarVehiculo(Vehiculo vehiculo) {
		
		log.debug("******Entrando al metodo guardarVehiculo()****");
		
		log.debug("----> " +  vehiculo.getModelo());
		
		//vehiculoRepository.save(vehiculo);
		
		return "redirect:/";
	}
	

}
