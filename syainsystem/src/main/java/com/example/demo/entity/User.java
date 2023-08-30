package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "user")
public class User implements Serializable {
  /**
   * 社員ID
   */
  @Id
  @Column(name = "SYAIN_ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long SYAIN_ID;
  /**
   * 氏名
   */
  @Column(name = "NAME")
  private String NAME;
  /**
   * 性別
   */
  @Column(name = "SEIBETSU")
  private String SEIBETSU;
  /**
   * 生年月日
   */
  @Column(name = "BIRTHDAY")
  private String BIRTHDAY;
  /**
   * 登録日時
   */
  @Column(name = "ENTRY_DATE")
  private Date ENTRY_DATE;
  /**
   * 登録者
   */
  @Column(name = "ENTRY_USER")
  private Date ENTRY_USER;
  /**
   * 更新日時
   */
  @Column(name = "UPDATE_DATE")
  private Date UPDATE_DATE;
  /**
   * 更新者
   */
  @Column(name = "UPDATE_USER")
  private Date UPDATE_USER;
}