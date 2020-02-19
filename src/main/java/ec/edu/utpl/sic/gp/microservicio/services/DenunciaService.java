package ec.edu.utpl.sic.gp.microservicio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import ec.edu.utpl.sic.gp.microservicio.dao.DenunciaRepository;
import ec.edu.utpl.sic.gp.microservicio.dto.Denuncia;


@Service
public class DenunciaService implements IDenunciaService {
	@Autowired
	private DenunciaRepository dao;
	
	public Denuncia save(Denuncia denuncia){
		return dao.save(denuncia);
	}

	@Override
	public List<Denuncia> getDenuncia() {
		// TODO Auto-generated method stub
		return (List<Denuncia>) dao.findAll();
	}
}
