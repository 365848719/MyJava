package com.scz.demo.controller;

import com.scz.demo.bean.Bill;
import com.scz.demo.repository.BillRepository;
import com.scz.demo.repository.MyBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class BillController {

    @Autowired
    MyBillRepository billRepository;

    @RequestMapping("/bill/findById")
    public Optional<Bill> findById() {
        String id = "1001-00000334.1301042-1211232180-1";
        Optional<Bill> billList = billRepository.findById(id);

        System.out.println(billList);
        return billList;
    }

    @RequestMapping("/bill/save")
    public void save(Bill b) {
        billRepository.save(b);
    }

}
