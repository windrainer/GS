package com.nighteagle.base.generic;

import java.util.List;

/**
 * Created by gaosen1 on 2016/10/6.
 */
public abstract class GenericServiceImpl<Model, PK> implements GenericService<Model, PK> {

    public abstract GenericDao<Model, PK> getDao();

    public int insert(Model model) {
        return getDao().insertSelective(model);
    }

    public int update(Model model) {
        return getDao().updateByPrimaryKeySelective(model);
    }

    public int delete(PK id) {
        return getDao().deleteByPrimaryKey(id);
    }

    public Model selectById(PK id) {
        return getDao().selectByPrimaryKey(id);
    }

    public Model selectOne() {
        return null;
    }

    @Override
    public List<Model> selectList() {
        return null;
    }
}
