
package Controlador;

import Modelo.DensidadPoblacional;
import Modelo.ObjetoGeografico;
import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public class Controlador extends ObjetoGeografico {
    
    ArrayList<DensidadPoblacional>DensidadPoblaciones=new ArrayList<>();


    public Controlador(String nombre, int codigo, String municipio, String tipo, String tipo_de_agua, int irca, String nivel_de_riesgo) {
        super(nombre, codigo, municipio, tipo, tipo_de_agua, irca, nivel_de_riesgo);
    }
    
    @Override
    public boolean resgistrarCuerpoEnBD() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
    public void AñadirDesidad(int Nhabitantes, int codigo, String municipio){
        DensidadPoblacional DesidadPoblacion = new DensidadPoblacional(Nhabitantes,codigo,municipio);
        DensidadPoblaciones.add(DesidadPoblacion);
    }
    
    public String ProcesarPoblacion(){
        String affeciones=" ";
        for (int i = 0; i < DensidadPoblaciones.size(); i++) {
            affeciones += "id: "+DensidadPoblaciones.get(i).getCodigo()+" "
                    +"municipio: "+DensidadPoblaciones.get(i).getMunicipio()+" "
                    +"affecion: "+DensidadPoblaciones.get(i).affeccion()+"\n";   
        }
        return affeciones;
    }
    
    
    
}
