package com.haritha.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.haritha.DMS.Models.Dog;

/**
 * @author S564205 Haritha Kolusu
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {

}
