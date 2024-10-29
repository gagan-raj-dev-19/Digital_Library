package com.example.Digital_Library.repository;

import com.example.Digital_Library.models.Book;
import com.example.Digital_Library.models.Student;
import com.example.Digital_Library.models.Transaction;
import com.example.Digital_Library.models.TransactionType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDao extends CrudRepository<Transaction, Integer> {

    Transaction findTransactionByStudentAndBookAndTransactionTypeOrderByIdDesc(Student student,
                                                                               Book book,
                                                                               TransactionType transactionType);


}
