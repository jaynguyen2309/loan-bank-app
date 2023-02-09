package com.java.bank.repository;

import com.java.bank.entity.CreditFacility;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

public interface CreditFacilityRepository extends JpaRepository<CreditFacility, UUID> {
//    Page<CreditFacility> findAllByCsn(Integer csn, Pageable pageable);
//    Optional<CreditFacility> findCreditAccountByIdAndDeleted(Integer id, boolean deleted);
//    Optional<CreditFacility> findByCsn(Integer csn);
    Optional<CreditFacility> findByUser_Id(UUID userId);
}
