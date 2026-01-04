package com.example.demo.Service.Interface;

import com.example.demo.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> getReservations(String sortField, String sortOrder);
    Reservation getReservation(int id, Reservation reservation);
    void addReservation(Reservation reservation);
    void updateReservation(Reservation reservation);
    void deleteReservation(int id);
}
