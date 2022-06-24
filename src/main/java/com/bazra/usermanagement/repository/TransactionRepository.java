package com.bazra.usermanagement.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazra.usermanagement.model.Transaction;



@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

    Page<Transaction> findByAccountNumber(String accountNumber, Pageable pageable);

    Page<Transaction> findByAccountNumberContaining(String accountNumber, Pageable pageable);

    List<Transaction> findByAccountNumberContaining(String accountNumber, Sort sort);


//    this repo for previous transaction
List<Transaction> findByaccountNumberEquals(String accountNumber);
    List<Transaction> findByfromAccountNumberEquals(String fromAccountNumber);
}

