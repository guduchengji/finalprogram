package com.xlx.service;

import java.util.List;

public interface BaseService<T> {
    List<T> queryAll();
    Boolean addOne(T t);
    Boolean deleteOne(T t);
}
