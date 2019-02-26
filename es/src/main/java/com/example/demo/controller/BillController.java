package com.example.demo.controller;

import com.example.demo.bean.Bill;
import com.example.demo.dao.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class BillController {

    @Autowired
    BillRepository billRepository;

    @RequestMapping("/bill/findByHisId")
    public Optional<Bill> findByHisId()
    {
        String hisId = "1001-00000334.1301042-1211232180-1";
        Optional billList = billRepository.findById(hisId);
        return billList;
    }

    @RequestMapping("/save")
    public  void save(Bill b) {
        billRepository.save(b);
    }

}
