package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;
    private int capacity;
    private int availableSpots;

    private Date openingHour;
    private Date closingHour;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "parkingLot")
    private List<ParkingSpot> parkingSpots;
}
