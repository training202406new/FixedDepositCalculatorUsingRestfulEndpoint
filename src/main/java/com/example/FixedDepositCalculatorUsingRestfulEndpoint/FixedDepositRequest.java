package com.example.FixedDepositCalculatorUsingRestfulEndpoint;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class FixedDepositRequest {
    List<FixedDepositRequestDetails> myFixedDepositRequest;
}
