package com.example.tccdemo.db132.model;

import java.math.BigDecimal;

public class AccountB {
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * account_b.id
   *
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  private Integer id;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * account_b.name
   *
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  private String name;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * account_b.balance
   *
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  private BigDecimal balance;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column account_b.id
   *
   * @return the value of account_b.id
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  public Integer getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column account_b.id
   *
   * @param id the value for account_b.id
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column account_b.name
   *
   * @return the value of account_b.name
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  public String getName() {
    return name;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column account_b.name
   *
   * @param name the value for account_b.name
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  public void setName(String name) {
    this.name = name == null ? null : name.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column account_b.balance
   *
   * @return the value of account_b.balance
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  public BigDecimal getBalance() {
    return balance;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column account_b.balance
   *
   * @param balance the value for account_b.balance
   * @mbg.generated Thu Oct 03 14:33:42 CST 2019
   */
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}
