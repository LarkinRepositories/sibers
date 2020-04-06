package com.larkinds.sibers.mapper;

import java.util.List;

public interface Mapper<E, D> {
    E toEntity(D dto);
    D toDto(E entity);
}
