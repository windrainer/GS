package com.nighteagle.base.generic;

import java.util.List;

/**
 * Created by gaosen1 on 2016/10/6.
 */
public interface GenericService<DTO,PK> {
    int insert(DTO model);

    int update(DTO model);

    int delete(PK id);

    DTO selectById(PK id);

    DTO selectOne();

    List<DTO> selectList();
}
