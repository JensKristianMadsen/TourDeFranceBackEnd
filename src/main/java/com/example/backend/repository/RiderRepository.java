package com.example.backend.repository;

import com.example.backend.model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiderRepository extends JpaRepository<Rider, Integer> {


  List<Rider> findRiderByRiderFirstName(String riderFirstName);

  List<Rider> findRiderByRiderId(int riderId );
}
