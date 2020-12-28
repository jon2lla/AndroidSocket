package main;

import java.io.IOException;
import java.util.*;

public class GestorConexiones {
    
	private Map<String, IOListenerSrv> conexiones = new Hashtable<String, IOListenerSrv>();
    
    private GestorConexiones() {}
    
    public static GestorConexiones getInstance() {
        return Holder.INSTANCE;
    }
    
    private static class Holder {
        private static final GestorConexiones INSTANCE = new GestorConexiones();
    }

    private Object readResolve()  {
        return Holder.INSTANCE;
    }
    
    public void registrarConexion(IOListenerSrv conexion){
    	conexiones.put(conexion.getIdConexion(), conexion);
    }
    
    public IOListenerSrv recuperarConexion(String idConexion) {
    	return conexiones.get(idConexion);
    }
    
    public synchronized void cerrarConexion(String idConexion){
    	IOListenerSrv conexion = conexiones.get(idConexion);
        if (conexion != null) {
            conexiones.remove(idConexion);
        }
    }
    
    public synchronized void cerrarConexiones() throws IOException{
    	for (Map.Entry<String, IOListenerSrv> entrada : conexiones.entrySet()){
    		if (entrada.getValue() != null) {
    			entrada.getValue().cerrarConexion();
            }        
    	}     
    }
    
    public synchronized void mensajeDeDifusion(String mensaje) throws IOException{
        for (Map.Entry<String, IOListenerSrv> entrada : conexiones.entrySet()){
        	entrada.getValue().enviarMensaje(mensaje);            
        }
    }  
    
    public Map<String, IOListenerSrv> getConexiones(){
    	return conexiones;
    }
    
    public int getNumUsuarios() {
		return conexiones.size();
	}
}