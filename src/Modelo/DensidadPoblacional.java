
package Modelo;

/**
 *
 * @author Familia
 */
public class DensidadPoblacional extends ObjetoGeografico{
    private int Nhabitantes;
    
    public DensidadPoblacional(int Nhabitantes,int codigo, String municipio) {
        super(codigo, municipio);
        this.Nhabitantes=Nhabitantes;
    }
    
    
    @Override
    public boolean resgistrarCuerpoEnBD() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getNhabitantes() {
        return Nhabitantes;
    }

    public void setNhabitantes(int Nhabitantes) {
        this.Nhabitantes = Nhabitantes;
    }
    
    
    public int affeccion(){
        if(Nhabitantes<10000){
            return 0;
        }else if(Nhabitantes>=10000 && Nhabitantes <=50000){
            return 1;
        }else{
            return 2;
        }
    }
}
    
    
  
