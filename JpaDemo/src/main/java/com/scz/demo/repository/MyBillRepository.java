package com.scz.demo.repository;

import com.scz.demo.bean.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBillRepository extends JpaRepository<Bill,String> {
}
