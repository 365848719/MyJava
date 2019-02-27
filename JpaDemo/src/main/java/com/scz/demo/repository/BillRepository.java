package com.scz.demo.repository;

import com.scz.demo.bean.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, String> {
}
