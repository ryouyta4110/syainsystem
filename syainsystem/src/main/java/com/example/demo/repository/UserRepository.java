package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query (value = "SELECT syain_id"
					+"from t_syain"
					+"ORDER BY syain_id DESC"
					+"LIMIT 1"
					+"substring(syain_id,6,3)"
					+"and max(syain_id)+1"
					+"and LPAD(syain_id,3,0)"
					+"and contact (ENTRY_DATE,'-',syain_id",nativeQuery = true)
	List<User> searchAll();
}