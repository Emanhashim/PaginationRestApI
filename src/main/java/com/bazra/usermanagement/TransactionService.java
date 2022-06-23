package com.bazra.usermanagement;

import com.bazra.usermanagement.model.Transaction;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TransactionService {
    List<Transaction> findByPagination(int pageNo, int pageSize);

    }


