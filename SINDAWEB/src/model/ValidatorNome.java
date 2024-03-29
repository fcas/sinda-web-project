package model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "nomeValidator")
public class ValidatorNome implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
	    String nome = String.valueOf(value);
	    boolean valid = true;
	    
		if (nome.equals("") || value == null) {
			valid = false; 
		}
		
		if (!valid) {
            FacesMessage message = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Nome inválido", "Insira um nome válido");
            throw new ValidatorException(message);
        }
		
	}

	
}
