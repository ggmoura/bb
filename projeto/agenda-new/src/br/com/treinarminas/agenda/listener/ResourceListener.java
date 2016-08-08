package br.com.treinarminas.agenda.listener;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.treinarminas.agenda.modelo.TipoTelefone;

/**
 * Application Lifecycle Listener implementation class ResourceListener
 *
 */
@WebListener
public class ResourceListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ResourceListener() {
    	super();
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	TipoTelefone[] tiposPossiveis = TipoTelefone.values();
		List<TipoTelefone> tipos = Arrays.asList(tiposPossiveis);
		sce.getServletContext().setAttribute("tipos", tipos);
		
		System.out.println("MY APP IS RUNNING...");
		
    }
	
}
