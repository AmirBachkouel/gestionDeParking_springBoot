package com.example.demo.Repository;

import com.example.demo.Entity.ParkingSpot;
import org.springframework.data.repository.CrudRepository;

public interface IParkingSpotRepository extends CrudRepository<ParkingSpot, Integer> {
}
