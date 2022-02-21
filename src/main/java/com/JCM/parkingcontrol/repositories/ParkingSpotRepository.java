package com.JCM.parkingcontrol.repositories;

import com.JCM.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//não é obrigatorio a anotacao de repositorio
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
}
