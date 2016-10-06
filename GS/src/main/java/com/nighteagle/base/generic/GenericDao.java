package com.nighteagle.base.generic;

/**
 * Created by gaosen1 on 2016/10/6.
 */
public interface GenericDao<Model, PK> {

    int insertSelective(Model model);

    int updateByPrimaryKeySelective(Model model);

    int deleteByPrimaryKey(PK id);

    Model selectByPrimaryKey(PK id);
}
