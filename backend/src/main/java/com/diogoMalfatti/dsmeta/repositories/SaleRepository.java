package com.diogoMalfatti.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogoMalfatti.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
