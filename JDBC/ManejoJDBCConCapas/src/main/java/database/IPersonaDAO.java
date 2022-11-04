package database;

import domain.PersonaDTO;
import java.util.List;
import java.sql.SQLException;

public interface IPersonaDAO {
    public List<PersonaDTO> find() throws SQLException;
    public PersonaDTO findOne( PersonaDTO persona ) throws SQLException;
    public int create( PersonaDTO persona ) throws SQLException;
    public int updateOne( PersonaDTO persona ) throws SQLException;
    public int deleteOne( PersonaDTO persona ) throws SQLException;
}
