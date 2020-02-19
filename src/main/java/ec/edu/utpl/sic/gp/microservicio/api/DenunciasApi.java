package ec.edu.utpl.sic.gp.microservicio.api;

import ec.edu.utpl.sic.gp.microservicio.dto.Denuncia;
import ec.edu.utpl.sic.gp.microservicio.services.DenunciaService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DenunciasApi{
	
	@Autowired
	private DenunciaService denunciaService;

	@RequestMapping(value="/registrar", method=RequestMethod.POST)
	public Denuncia updateOrSave(@RequestBody Denuncia denuncia){
		return denunciaService.save(denuncia);
	}
	
	/*@RequestMapping(value="/denuncias", method=RequestMethod.GET)
    public Denuncia getById(){
		return new Denuncia(1L, "Higienico", "El Valle", "Basura regada", false);
    }*/
	@GetMapping(value="/denuncias")
	public List<Denuncia> getDenuncias(){
		return denunciaService.getDenuncia();
	}
}
