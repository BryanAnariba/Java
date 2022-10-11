
package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        ImplementacionMySql coneccionMysql = new ImplementacionMySql();
        coneccionMysql.insertar();
        coneccionMysql.listar();
        
        ImplementacionOracle coneccionOracle = new ImplementacionOracle();
        coneccionOracle.insertar();
        coneccionOracle.listar();
    }
    
    public static void imprimir( IAccesoDatos datos ) {
        datos.listar();
    }
}
