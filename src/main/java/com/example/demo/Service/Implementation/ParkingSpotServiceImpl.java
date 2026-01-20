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
    IParkingSpotRepository parkingSpotRepository;

    @Override
    public List<ParkingSpot> getParkingSpot(String sortField, String sortOrder) {

        return (List<ParkingSpot>)parkingSpotRepository.findAll();
    }

    @Override
    public ParkingSpot getParkingSpot(int id, ParkingSpot parkingSpot) {

        return parkingSpotRepository.findById(id).get();
    }

    @Override
    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotRepository.save(parkingSpot);
    }

    @Override
    public void updateParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotRepository.save(parkingSpot);
    }

    @Override
    public void deleteParkingSpot(int id) {
        parkingSpotRepository.deleteById(id);
    }
}
