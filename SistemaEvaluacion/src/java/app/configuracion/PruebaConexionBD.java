
package app.configuracion;


public class PruebaConexionBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ConexionBD cn = new ConexionBD();
       
        if (cn.getConnection() != null) {
            System.out.println("Conexion Exitosa");
            
        } else {
            System.out.println("Conexion Fallida");
        }
       
    }
    
}
