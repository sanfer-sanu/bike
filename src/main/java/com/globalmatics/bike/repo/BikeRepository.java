package com.globalmatics.bike.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globalmatics.bike.models.Bike;

public interface BikeRepository extends MongoRepository<Bike, String> {
    Bike findByName(String name);
}
