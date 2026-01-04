package com.example.demo.Service.Implementation;

import com.example.demo.Entity.ParkingSpot;
import com.example.demo.Repository.IParkingSpotRepository;
import com.example.demo.Service.Interface.IParkingSpotService;
import com.example.demo.Service.Interface.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpotServiceImpl implements IParkingSpotService {
    @Autowired
    IParkingSpotRepository iParkingSpotRepository;

    @Override
    public List<ParkingSpot> getParkingSpot(String sortField, String sortOrder) {
        return List.of();
    }

    @Override
    public ParkingSpot getParkingSpot(int id, ParkingSpot parkingSpot) {
        return null;
    }

    @Override
    public void addParkingSpot(ParkingSpot parkingSpot) {

    }

    @Override
    public void updateParkingSpot(ParkingSpot parkingSpot) {

    }

    @Override
    public void deleteParkingSpot(int id) {

    }
}
