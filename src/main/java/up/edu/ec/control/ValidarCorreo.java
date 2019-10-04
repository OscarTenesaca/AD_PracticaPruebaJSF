package up.edu.ec.control;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("vcorreo")

public class ValidarCorreo implements Validator {

	@Override
	public void validate(FacesContext fc, UIComponent uio, Object o) throws ValidatorException {
		
		String correov = o.toString().trim();
		
		if(correov.length()==0){
			
			throw new ValidatorException(new FacesMessage("Ingrese el Correo"));
			
			
		}else {
			String erCorreo = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
			boolean ok = Pattern.matches(erCorreo, correov);
			
			if (!ok) {
				throw new ValidatorException(new FacesMessage("Formato debe ser abg@abg.com"));
				
			}
			
			
		}

		
		
	}
	
	
	
	
	

}
