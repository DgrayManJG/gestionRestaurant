package util;

import javax.servlet.http.HttpServletRequest;

public class Validator {
	
	private ValidatorMessage validatorMessage;
	
	public Validator () {
		validatorMessage = new ValidatorMessage();
	}

	public void formReservation(HttpServletRequest request) {
		if (request.getParameter("nom") == null || request.getParameter("nom").isEmpty()) {
			validatorMessage.setError("true", "Nom vide");
		} else {
			
		}
	}
	
	
	
}
