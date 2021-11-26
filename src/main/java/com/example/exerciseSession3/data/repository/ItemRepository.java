package com.example.exerciseSession3.data.repository;

import com.example.exerciseSession3.data.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<ItemEntity, String> {

}