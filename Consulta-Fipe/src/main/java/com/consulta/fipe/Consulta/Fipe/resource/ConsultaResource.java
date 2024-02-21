package com.consulta.fipe.Consulta.Fipe.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.fipe.Consulta.Fipe.service.ConsultaFipeService;

@RestController
public class ConsultaResource {
	
	@Autowired
	private ConsultaFipeService consulta;
	
	/**
	 * Consulta o veiculo pelo tipo, modelo e marca
	 * @param modelo, tipo, marca
	 * @return
	 */
	@PostMapping("/v1/consulta")
	public ResponseEntity<String> consultarVeiculo(@RequestParam("modelo") String modelo, @RequestParam("tipo") String tipo, @RequestParam("marca") String marca) {
			String response = consulta.consultar(modelo, tipo, marca);
			return ResponseEntity.ok(response);
		}
	

}

