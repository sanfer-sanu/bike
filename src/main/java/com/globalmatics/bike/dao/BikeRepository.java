package com.globalmatics.bike.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globalmatics.bike.models.Bike;

public interface BikeRepository extends MongoRepository<Bike, Integer> {
    Bike findByName(String id);
}
