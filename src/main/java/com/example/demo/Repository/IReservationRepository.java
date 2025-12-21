package com.example.demo.Repository;

import com.example.demo.Entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationRepository extends CrudRepository<Reservation, Integer> {
}
