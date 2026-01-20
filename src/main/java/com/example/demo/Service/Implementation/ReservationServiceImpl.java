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

        return (List<Reservation>)reservationRepository.findAll();
    }

    @Override
    public Reservation getReservation(int id, Reservation reservation) {

        return reservationRepository.findById(id).get();
    }

    @Override
    public void addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(int id) {
        reservationRepository.deleteById(id);
    }
}
