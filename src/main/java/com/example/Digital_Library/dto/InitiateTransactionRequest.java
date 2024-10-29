package com.example.Digital_Library.dto;

import com.example.Digital_Library.models.TransactionType;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InitiateTransactionRequest {

    @NotNull
    private String studentRollNumber;
    @NotNull
    private Integer bookId;
    @NotNull
    private Integer adminId;
    @NotNull
    private TransactionType transactionType;





}
