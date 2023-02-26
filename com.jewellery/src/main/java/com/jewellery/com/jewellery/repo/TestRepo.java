package com.jewellery.com.jewellery.repo;

import org.springframework.data.repository.CrudRepository;

import com.jewellery.com.jewellery.entity.TestEntity;


public interface TestRepo extends CrudRepository<TestEntity, Integer>
{

}
