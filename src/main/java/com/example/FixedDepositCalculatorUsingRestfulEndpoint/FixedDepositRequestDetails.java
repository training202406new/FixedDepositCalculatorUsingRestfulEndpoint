package com.example.FixedDepositCalculatorUsingRestfulEndpoint;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FixedDepositRequestDetails {
   double principal;
   double rateOfInterest;
   double timePeriod;
   double totalAmount;
   double interestEarned;
}
