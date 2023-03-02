
package Modelo;

import Basededatos.ContextoBD;


/**
 *
 * @author Familia
 */
public class CuerpoDeAgua extends ObjetoGeografico {


    public CuerpoDeAgua(String nombre, int codigo, String municipio, String tipo, String tipo_de_agua, int irca, String nivel_de_riesgo) {
        super(nombre, codigo, municipio, tipo, tipo_de_agua, irca, nivel_de_riesgo);
    }

    @Override
    public boolean resgistrarCuerpoEnBD() {
        String sql ="INSERT INTO Objeto(id," +
                                        "nombre," +
                                        "municipio," +
                                        "tipo," +
                                        "tipoagua," +
                                        "irca," +
                                        "nivelderiesgo)"+
                                        "VALUES(%d,%s,%s,%s,%s,%d,%s);";
        
        String campoNombre = "'"+this.getNombre()+"'";
        String campoMunicipio = "'"+this.getMunicipio()+"'";
        String campoTipo = "'"+this.getTipo()+"'";
        String campoTipo_de_Agua = "'"+this.getTipo_de_agua()+"'";
        String campoNivel_de_riesgo = "'"+this.getNivel_de_riesgo()+"'";
        
        
        sql = String.format(sql,this.getCodigo(),campoNombre,campoMunicipio,campoTipo,campoTipo_de_Agua,this.getIrca(),campoNivel_de_riesgo);
        
        
        
        //Enviamos el registro de la ejecucion a la base de datos
        int filasAfectadas = 0;
        ContextoBD contexto = new ContextoBD();//Conexion a Base
        filasAfectadas = contexto.ejecutarUpdate(sql); //Envio de parametros a la tabla mediate el metodo
        System.out.println(contexto.getMensajeError());
        return (filasAfectadas>0);
    }
    
     
    
    
    
    @Override
    public String nivel(){
        String mensaje=" ";
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
    @Override
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
    @Override
    public String nombreMedio(){
        String nota=null;
        if(this.getIrca()>14 && this.getIrca()<=35){
                nota+=this.getNombre()+" ";
            }else{
            nota="NA";
        }
        return nota;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String nombreBajo(){
        String nom=null;
        int menor=10000000;
        int id;
        if(this.getIrca()<menor){
                menor=this.getIrca();
                nom=this.getNombre();
                id=this.getCodigo();
            }
        return nom;
    } 
    
}
