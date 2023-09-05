package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.TourokuRequest;
import com.example.demo.entity.Touorku;
import com.example.demo.repository.TouorkuRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TouorkuService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private TouorkuRepository tourokuRepository;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<Touorku> searchAll() {
    return tourokuRepository.findAll();
  }

  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void create(TourokuRequest tourokuRequest) {
    Date now = new Date();
    Touorku user = new Touorku();
    user.setNAME(tourokuRequest.getName());
    user.setSEIBETSU(tourokuRequest.getSeibetsu());
    user.setBIRTHDAY(tourokuRequest.getBirthday());
    user.setENTRY_DATE(now);
    user.setUPDATE_DATE(now);
    tourokuRepository.save(user);
  }
}