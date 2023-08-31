package com.example.demo.dto;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * ユーザー情報 リクエストデータ
 */
@Data
public class UserRequest implements Serializable {
  /**
   * 名前
   */
  @NotEmpty(message = "名前を入力してください")
  @Size(max = 20, message = "名前は20桁以内で入力してください")
  @Pattern(regexp = "^[^ -~｡-ﾟ]*$",message = "全角で入力してください")
  private String name;
  /**
   * 性別
   */
  @NotNull( message = "どちらか選択してください")
  private String seibetsu;
  /**
   * 生年月日
   */
  @DateTimeFormat(pattern = "yyyy/MM/dd")
  private String birthday;
  
public String getSyain_id() {
	return "2000-000";
}
  
  
	
}