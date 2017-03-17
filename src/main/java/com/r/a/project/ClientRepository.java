package com.r.a.project;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by crci1 on 3/17/2017.
 */
public interface ClientRepository extends CrudRepository<Client, Integer> {

    List<Client> findByfirstName(String firstName);

}
