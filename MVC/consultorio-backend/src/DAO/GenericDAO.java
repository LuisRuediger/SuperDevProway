package DAO;

import java.util.List;

public interface GenericDAO {

    public List<Object> getAll();

    public Object getById(int id);

    public Boolean insert(Object object) throws Exception;

    public Boolean update(Object object);

    public void delete(int id);
}
