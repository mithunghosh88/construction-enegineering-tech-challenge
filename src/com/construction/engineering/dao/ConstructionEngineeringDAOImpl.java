package com.construction.engineering.dao;

import java.util.ArrayList;
import java.util.List;

public class ConstructionEngineeringDAOImpl implements ConstructionEngineeringDAO{
    //storing data in memory,
    // alternatively file or database can be used to store data
    private static final List data = new ArrayList<>();

    /**
     * This method will return list of data
     * @return
     */
    @Override
    public List getEntities() {
        return data;
    }

    /**
     * This method will persist entity data
     * @param entity
     */
    @Override
    public void saveEntity(Object entity) {
        data.add(entity);
    }

    /**
     * This will delete a specific entity data.
     * @param entity
     * @return
     */
    @Override
    public Object delete(Object entity) {
        return data.remove(entity);
    }

}
