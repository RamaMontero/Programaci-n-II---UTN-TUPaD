package dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Interfaz genérica para operaciones CRUD básicas.
 * @param <T> Tipo de la entidad (por ejemplo, Empresa)
 */
public interface GenericDao<T> {

    // Crear un nuevo registro
    void crear(T t) throws SQLException;

    // Leer un registro por su ID
    T leerPorId(long id) throws SQLException;

    // Leer todos los registros (sin los eliminados lógicamente)
    List<T> leerTodos() throws SQLException;

    // Actualizar un registro existente
    void actualizar(T t) throws SQLException;

    // Eliminar un registro lógicamente (marcarlo como eliminado)
    void eliminarLógico(long id) throws SQLException;
}