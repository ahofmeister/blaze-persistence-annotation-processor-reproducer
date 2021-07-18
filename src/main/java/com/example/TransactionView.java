package com.example;

import com.blazebit.persistence.view.EntityView;

import javax.validation.constraints.Min;

@EntityView(Transaction.class)
public interface TransactionView {

    @Min(20)
    Integer getLabel();

}
