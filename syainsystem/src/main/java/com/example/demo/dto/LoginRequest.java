package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;


@Data
public class LoginRequest implements Serializable {
  
  private String id;
  private String password;
}