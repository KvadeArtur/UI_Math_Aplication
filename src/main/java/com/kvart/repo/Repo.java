package com.kvart.repo;

import com.kvart.model.Number;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Number, Integer> {

}
