package DataAccessObjectJDBC.repository;

import DataAccessObjectJDBC.model.Developer;

import java.util.List;

public interface DeveloperDao {
    List<Developer> findAll();
    Developer findById(int id);
    void add(Developer developer);
    void update(Developer developer);
    void deleteById(int id);
}