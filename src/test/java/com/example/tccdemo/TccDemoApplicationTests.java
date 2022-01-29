package com.example.tccdemo;

import com.example.tccdemo.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TccDemoApplicationTests {
  @Autowired private AccountService accountService;

  @Test
  public void contextLoads() {}

  @Test
  public void testAccount() {
    accountService.transferAccount();
  }
}
