
package servicios;
import clases.*;
import gestiones.*;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("curso")
public class rsCurso {
    public static List<cliente> listadeclientes= new ArrayList<>();
    public gestioncurso gc= new gestioncurso();
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<cliente> consultar(){
    gc.setListacliente(listadeclientes);
    return gc.consultar();
    }
    
    @GET
    @Path("{parametroconsulta}")
    @Produces({MediaType.APPLICATION_JSON})
    public cliente conultarIndividual(@PathParam("parametroconsulta") String param){
        gc.setListacliente(listadeclientes);
        return gc.consultarIndividual(param);
        
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void insertar(cliente c){
        gc.setListacliente(listadeclientes);
        gc.insertar(c);
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    public void modificar(cliente cl){
        gc.setListacliente(listadeclientes);
        gc.modificar(cl);
    }
    
    @DELETE
    @Path("{parmetroeliminar}")
    public void eliminar(@PathParam ("parmetroeliminar") String eliminar){
        cliente auxiliar= new cliente(eliminar, null, null, null, null);
        gc.setListacliente(listadeclientes);
        gc.eliminar(auxiliar);
               
        
    }
}
