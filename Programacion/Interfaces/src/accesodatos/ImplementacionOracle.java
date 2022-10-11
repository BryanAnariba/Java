package accesodatos;
public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando registro desde oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listando registros deesde oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando registros desde oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando registros desde oracle");
    }
    
}
