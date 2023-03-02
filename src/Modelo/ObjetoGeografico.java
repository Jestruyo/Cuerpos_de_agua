
package Modelo;

/**
 *
 * @author Familia
 */
public abstract class ObjetoGeografico {
    
    private String nombre;
    private int codigo;
    private String municipio;
    private String tipo;
    private String tipo_de_agua;
    private int irca;
    private String nivel_de_riesgo;
    
    public ObjetoGeografico(int codigo, String municipio){
        this.codigo=codigo;
        this.municipio=municipio;
    
}
      
    public ObjetoGeografico(String nombre, int codigo, String municipio, String tipo, String tipo_de_agua, int irca,String nivel_de_riesgo){
        this.nombre=nombre;
        this.codigo=codigo;
        this.municipio=municipio;
        this.tipo=tipo;
        this.tipo_de_agua=tipo_de_agua;
        this.irca=irca;
        this.nivel_de_riesgo=nivel_de_riesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo_de_agua() {
        return tipo_de_agua;
    }

    public void setTipo_de_agua(String tipo_de_agua) {
        this.tipo_de_agua = tipo_de_agua;
    }

    public int getIrca() {
        return irca;
    }

    public void setIrca(int irca) {
        this.irca = irca;
    }

    public String getNivel_de_riesgo() {
        return nivel_de_riesgo;
    }

    public void setNivel_de_riesgo(String nivel_de_riesgo) {
        this.nivel_de_riesgo = nivel_de_riesgo;
    }
    
    
    
    public abstract boolean resgistrarCuerpoEnBD();
    
    
   
    
    public String nivel(){
        String mensaje = " ";
        if(this.getIrca()>=0 && this.getIrca()<=5){
            mensaje = "SIN RIESGO";
        }else if(this.getIrca()>5 && this.getIrca()<=14){
            mensaje = "BAJO";
        }else if(this.getIrca()>14 && this.getIrca()<=35){
            mensaje = "MEDIO";
        }else if(this.getIrca()>35 && this.getIrca()<=80){
            mensaje = "ALTO";
        }else if(this.getIrca()>80 && this.getIrca()<=100){
            mensaje = "INVIABLE SANITARIAMENTE";
        }return mensaje;
    }
    
    /**
     *
     * @return
     */
    public int contMedio(){
        int cont=0;
        if(this.getIrca()<=35){
            cont++; 
        } 
        return cont;
    }
    
    /**
     *
     * @return
     */
    public String nombreMedio(){
        String nota=null;
        if(this.getIrca()>14 && this.getIrca()<=35){
                nota+=this.getNombre()+" ";
            }else{
            nota="NA";
        }
        return nota;
    }
    
    public String nombreBajo(){
        String nom=null;
        float menor=10000000;
        int id;
        if(this.getIrca()<menor){
                menor=this.getIrca();
                nom=this.getNombre();
                id=this.getCodigo();
            }
        return nom;
    }
}
