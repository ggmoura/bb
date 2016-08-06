package br.com.treinarminas.agenda.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import br.com.treinarminas.agenda.modelo.TipoTelefone;

public class TipoTelefoneTag extends SimpleTagSupport {

	private String id;
	private String name;
	private String selected;
	private Boolean disabled;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public void doTag() throws JspException, IOException {

		StringBuilder sb = new StringBuilder();
		sb.append("<select ");
		sb.append(disabled != null && disabled ? " disabled " : "");

		TipoTelefone tipoSelecionado = selected != null && !selected.isEmpty() ? TipoTelefone
				.valueOf(selected) : null;

		if (id != null && !id.isEmpty()) {
			sb.append("id='").append(id).append("' ");
		}
		if (name != null && !name.isEmpty()) {
			sb.append("name='").append(name).append("' ");
		}
		sb.append(">\n");
		sb.append("<option value=\"-1\">Selecione</option>");
		for (TipoTelefone tipo : TipoTelefone.values()) {
			sb.append("<option value='").append(tipo).append("' ");
			sb.append(tipoSelecionado != null && tipoSelecionado.equals(tipo) ? "selected" : "");
			sb.append(">");
			sb.append(tipo.getDescricao());
			sb.append("</option>\n");
		}
		JspWriter out = getJspContext().getOut();
		out.println(sb.toString());
	}
}