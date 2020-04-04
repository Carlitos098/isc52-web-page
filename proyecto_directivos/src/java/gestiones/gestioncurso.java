/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestiones;
import clases.*;
import java.util.List;

public class gestioncurso implements Icrud<cliente>{
    private List<cliente> listacliente;

    
    public List<cliente> getListacliente() {
        return listacliente;
    }

    
    public void setListacliente(List<cliente> listacliente) {
        this.listacliente = listacliente;
    }

    @Override
    public void insertar(cliente p) {
    listacliente.add(p);
    }

    @Override
    public void modificar(cliente p) {
    cliente auxiliarcliente = consultaIndividual(p);
    auxiliarcliente.setCedula(p.getCedula());
    auxiliarcliente.setNombre(p.getNombre());
    auxiliarcliente.setApellido(p.getApellido());
    }

    @Override
    public void eliminar(cliente p) {
    cliente auxiliar = this.consultarIndividual(p.getCedula());
    listacliente.remove(auxiliar);
    }

    @Override
    public cliente consultaIndividual(cliente p) {
        try {
            return listacliente.stream().filter(x -> (x.getCedula() == null ? p.getCedula() == null : x.getCedula().equals(p.getCedula()))).findFirst().get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<cliente> consultar() {
    return listacliente;
    }
    public cliente consultarIndividual(String paramcedula){
        try {
            return listacliente.stream().filter(x -> (x.getCedula() == null ? paramcedula == null : x.getCedula().equals(paramcedula))).findFirst().get();
        } catch (Exception e) {
            return null;
        }
   
    }
}

