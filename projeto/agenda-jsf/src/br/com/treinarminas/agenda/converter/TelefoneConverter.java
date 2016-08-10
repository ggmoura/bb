package br.com.treinarminas.agenda.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.eclipse.jdt.internal.compiler.ast.TrueLiteral;

import br.com.treinarminas.agenda.modelo.Telefone;

@FacesConverter("br.com.treinar.test.TelefoneConverter")
public class TelefoneConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Telefone t = null;
		if (value != null && !value.isEmpty() && value.length() > 7) {
			String dddStr = value.substring(1, 3);
			String numeroStr = value.substring(4, value.length());
			t = new Telefone();
			t.setDdd(Integer.parseInt(dddStr));
			t.setNumero(Integer.parseInt(numeroStr));
		}
		return t;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		
		Telefone t = null;
		String telefoneStr = "";
		if (value != null) {
			t = (Telefone)value;
			telefoneStr = "(" + t.getDdd() + ")" + t.getNumero();
			
			
		}
		
		return telefoneStr;
	}

}
