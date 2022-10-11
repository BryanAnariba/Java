package accesodatos;

public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando registro desde mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listando registros deesde mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando registros desde mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando registros desde mysql");
    }
    
}
