package com.example.demo.Service.Interface;

import com.example.demo.Entity.ParkingSpot;

import java.util.List;

public interface IParkingSpotService {
    List<ParkingSpot> getParkingSpot(String sortField, String sortOrder);
    ParkingSpot getParkingSpot(int id, ParkingSpot parkingSpot);
    void addParkingSpot(ParkingSpot parkingSpot);
    void updateParkingSpot(ParkingSpot parkingSpot);
    void deleteParkingSpot(int id);
}
