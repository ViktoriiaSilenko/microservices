package org.it.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainingContr")
public class TrainingController {

	/*@Value("${training}")
	private String trainingName;

	@RequestMapping("/name")
	public String getTrainingName() {
		return trainingName;
	}*/

}
