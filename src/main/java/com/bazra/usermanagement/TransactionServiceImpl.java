package com.bazra.usermanagement;

import com.bazra.usermanagement.model.Transaction;
import com.bazra.usermanagement.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionServiceImpl implements TransactionService{

@Autowired
    TransactionRepository transactionRepository;


    @Override
    public List<Transaction> findByPagination(int pageNo, int pageSize) {
//        to auto generate or dynamic generate

        Pageable pageable = PageRequest.of(pageNo, pageSize);
       Page<Transaction>pagedResult = transactionRepository.findAll(pageable);
       return pagedResult.toList();

    }
}
