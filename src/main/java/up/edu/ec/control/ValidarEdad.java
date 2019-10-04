package up.edu.ec.control;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("vedad")

public class ValidarEdad implements Validator {

	
	@Override
	public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
		
		String edad= o.toString().trim();
		
		if(edad.length()==0) {
			
			throw new ValidatorException(new FacesMessage("Ingrese Edad"));
		}else {
			
			String erEdad="^\\d{1,3}$";
			boolean estaBien=Pattern.matches(erEdad, edad);
			
			if(!estaBien){
				
				throw new ValidatorException(new FacesMessage("###"));

				
			}
		}
		
		
		
	}
	
	
	

}
