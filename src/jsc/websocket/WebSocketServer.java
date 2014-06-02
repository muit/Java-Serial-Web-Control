/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsc.websocket;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


/**
 *
 * @author Miguel_F
 */
public class WebSocketServer {
    public static void init() throws Exception {
        Server server = new Server( 8080 );
        
        // Create the 'root' Spring application context
        final ServletHolder servletHolder = new ServletHolder( new DefaultServlet() );
        final ServletContextHandler context = new ServletContextHandler();


        context.setContextPath( "/" );
        context.addServlet( servletHolder, "/*" );
        context.addEventListener( new ContextLoaderListener() ); 
        context.setInitParameter( "contextClass", AnnotationConfigWebApplicationContext.class.getName() );
        context.setInitParameter( "contextConfigLocation", AppConfig.class.getName() );

        server.setHandler( context );
        WebSocketServerContainerInitializer.configureContext( context ); 


        server.start();
        server.join(); 
}

}
