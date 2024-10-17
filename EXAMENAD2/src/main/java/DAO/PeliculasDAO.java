package DAO;

import org.example.model.Peliculas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Esta clase implementa el patrón DAO para manejar operaciones con el objeto Perro.
public class PeliculasDAO implements DAO<Peliculas> {

    // Conexión a la base de datos.
    Connection con;

    // Constructor que recibe la conexión a la base de datos.
    public PeliculasDAO(Connection c) {
        con = c;
    }

    // Método para encontrar todas los peliculas en la base de datos.
    @Override
    public List<Peliculas> findAll() {
        List<Peliculas> listaPeliculas = new ArrayList<>(); // Lista para almacenar resultados.

        try (PreparedStatement ps = con.prepareStatement("SELECT * FROM Peliculas")) {
            ResultSet rs = ps.executeQuery(); // Ejecuta la consulta.
        }

        // Encuentra una pelicula por su año.
        @Override
        public Perro findById (YEAR año){
            // Comprobar si id es null antes de continuar
            if (año == null) {
                throw new IllegalArgumentException("El año no puede ser null");
            }

            Peliculas pelis = null;
            String query = "SELECT * FROM perros WHERE id = ?";

            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                // Si se encuentra un perro, se crea el objeto Perro
                if (rs.next()) {
                    pelis = new Perro();
                    pelis.setId(rs.getInt("id"));
                    pelis.setNombre(rs.getString("nombre"));
                    pelis.setEdad(rs.getInt("edad"));
                    pelis.setRaza(rs.getString("raza"));
                }
            } catch (SQLException e) {
                throw new RuntimeException("Error al buscar perro por ID", e);
            }

            return pelis; // Puede ser null si no se encuentra
        }

    }

    @Override
    public Peliculas findById(Integer id) {
        return null;
    }

    @Override
    public void save(Peliculas peliculas) {

    }

    @Override
    public void update(Peliculas peliculas) {

    }

    @Override
    public void delete(Peliculas peliculas) {

    }
}
