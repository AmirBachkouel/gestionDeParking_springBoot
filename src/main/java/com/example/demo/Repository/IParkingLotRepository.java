package com.example.demo.Repository;

import com.example.demo.Entity.ParkingLot;
import org.springframework.data.repository.CrudRepository;

public interface IParkingLotRepository extends CrudRepository<ParkingLot, Integer> {
}
