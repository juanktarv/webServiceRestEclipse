package com.faavoo.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/saludo")
public class Holamundo {
    
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_HTML)
    public String getSaludoHTML(@PathParam("param") String nombre) {
        return "<html> " + "<title>" + "Hola Mundo" + "</title>"  
             + "<body><h1>" + "Hola Mundo en HTML : " + nombre 
             + "</body></h1>" + "</html> ";
    }
    
    
    @GET
    @Path("/mostrar")
    @Produces(MediaType.APPLICATION_JSON)
    public String mostrar() {
    	 
    	 System.out.println(" mostrarv : ");
    	 
    	JSONObject obj = new JSONObject();
 		JSONArray objArray = new JSONArray();
 		
 		try {
 			for (int i=0; i<2;i++) {
 				JSONObject formDetailsJson = new JSONObject();
 				formDetailsJson.put("numdoc","pp"+i == null ? "" : "pp"+i);
 		       
 		        objArray.put(formDetailsJson);
 			}
 			obj.put("Personas", objArray);
 			
 			
 		} catch (JSONException e) {
 			// TODO Auto-generated catch block
 		}
 		return obj.toString(); 
 	
   
   }
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSaludoPlain() {
        return "Hola mundo!"  ;
    }
}
