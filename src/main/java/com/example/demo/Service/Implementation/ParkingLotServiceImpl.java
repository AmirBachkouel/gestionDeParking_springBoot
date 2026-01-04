package com.example.demo.Service.Implementation;

import com.example.demo.Entity.ParkingLot;
import com.example.demo.Repository.IParkingLotRepository;
import com.example.demo.Service.Interface.IParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotServiceImpl implements IParkingLotService {
    @Autowired
    IParkingLotRepository iParkingLotRepository;

    @Override
    public List<ParkingLot> getParkingLot(String sortField, String sortOrder) {
        return List.of();
    }

    @Override
    public ParkingLot getParkingLot(int id, ParkingLot parkingLot) {
        return null;
    }

    @Override
    public void addParkingLot(ParkingLot parkingLot) {

    }

    @Override
    public void updateParkingLot(ParkingLot parkingLot) {

    }

    @Override
    public void deleteParkingLot(int id) {

    }
}
