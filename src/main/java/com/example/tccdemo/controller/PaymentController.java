package com.example.tccdemo.controller;

import com.example.tccdemo.service.PaymentServcie;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author afu */
@RestController
public class PaymentController {
  @Autowired private PaymentServcie paymentServcie;

  @RequestMapping("payment")
  public String payment(int userId, int orderId, BigDecimal amount) throws Exception {

    int result = paymentServcie.pamentMQ(userId, orderId, amount);

    return "支付结果：" + result;
  }
}
