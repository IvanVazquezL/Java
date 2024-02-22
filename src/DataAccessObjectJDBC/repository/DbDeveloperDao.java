package DataAccessObjectJDBC.repository;

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import DataAccessObjectJDBC.model.Developer;


public class DbDeveloperDao implements DeveloperDao {
    private static final String CONNECTION_URL = "jdbc:h2:./src/developer/db/developer";
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String CREATE_DB = "CREATE TABLE IF NOT EXISTS DEVELOPER(" +
            "id INTEGER PRIMARY KEY," +
            "name TEXT NOT NULL);";
    private static final String SELECT_ALL = "SELECT * FROM DEVELOPER";
    private static final String SELECT = "SELECT * FROM DEVELOPER WHERE id = %d";
    private static final String INSERT_DATA = "INSERT INTO DEVELOPER VALUES (%d , '%s')";
    private static final String UPDATE_DATA = "UPDATE DEVELOPER SET name " +
            "= '%s' WHERE id = %d";
    private static final String DELETE_DATA = "DELETE FROM DEVELOPER WHERE id = %d";

    private DbClient dbClient;

    public DbDeveloperDao() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(CONNECTION_URL);

        dbClient = new DbClient(dataSource);
        dbClient.run(CREATE_DB);
        System.out.println("Developers data structure create");
    }

    @Override
    public void add(Developer developer) {
        dbClient.run(String.format(
                INSERT_DATA, developer.getId(), developer.getName()));
        System.out.println("Developer: Id " + developer.getId() +
                ", name: " + developer.getName() + " added");
    }

    @Override
    public List<Developer> findAll() {
        return dbClient.selectForList(SELECT_ALL);
    }

    @Override
    public Developer findById(int id) {
        Developer developer = dbClient.select(String.format(SELECT, id));

        if (developer != null) {
            System.out.println("Developer: Id " + id + ", found");
            return developer;
        } else {
            System.out.println("Developer: Id " + id + ", not found");
            return null;
        }
    }

    @Override
    public void update(Developer developer) {
        dbClient.run(String.format(
                UPDATE_DATA, developer.getName(), developer.getId()));
        System.out.println("Developer: Id " + developer.getId() + ", updated");
    }

    @Override
    public void deleteById(int id) {
        dbClient.run(String.format(DELETE_DATA, id));
        System.out.println("Developer: Id " + id + ", deleted");
    }
}
*/