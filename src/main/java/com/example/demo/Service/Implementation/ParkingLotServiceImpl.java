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
    IParkingLotRepository parkingLotRepository;

    @Override
    public List<ParkingLot> getParkingLot(String sortField, String sortOrder) {

        return (List<ParkingLot>)parkingLotRepository.findAll();
    }

    @Override
    public ParkingLot getParkingLot(int id, ParkingLot parkingLot) {

        return parkingLotRepository.findById(id).get();
    }

    @Override
    public void addParkingLot(ParkingLot parkingLot) {
        parkingLotRepository.save(parkingLot);
    }

    @Override
    public void updateParkingLot(ParkingLot parkingLot) {
        parkingLotRepository.save(parkingLot);
    }

    @Override
    public void deleteParkingLot(int id) {
        parkingLotRepository.deleteById(id);
    }
}
