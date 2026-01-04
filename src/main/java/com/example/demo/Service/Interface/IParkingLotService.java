package com.example.demo.Service.Interface;

import com.example.demo.Entity.ParkingLot;

import java.util.List;

public interface IParkingLotService {
    List<ParkingLot> getParkingLot(String sortField, String sortOrder);
    ParkingLot getParkingLot(int id, ParkingLot parkingLot);
    void addParkingLot(ParkingLot parkingLot);
    void updateParkingLot(ParkingLot parkingLot);
    void deleteParkingLot(int id);
}
