package DAO;

import java.util.List;
import java.util.Objects;

public interface GenericDAO {
    public Boolean insert(Object object);

    public List<Object> getAll();

}
