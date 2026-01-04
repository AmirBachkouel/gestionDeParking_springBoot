package com.example.demo.Service.Implementation;

import com.example.demo.Entity.Reservation;
import com.example.demo.Repository.IReservationRepository;
import com.example.demo.Service.Interface.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {
    @Autowired
    IReservationRepository reservationRepository;

    @Override
    public List<Reservation> getReservations(String sortField, String sortOrder) {
        return List.of();
    }

    @Override
    public Reservation getReservation(int id, Reservation reservation) {
        return null;
    }

    @Override
    public void addReservation(Reservation reservation) {

    }

    @Override
    public void updateReservation(Reservation reservation) {

    }

    @Override
    public void deleteReservation(int id) {

    }
}
