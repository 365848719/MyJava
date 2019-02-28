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
    public Bill findById() {
        String id = "1001-00000334.1301042-1211232180-1";
        Optional<Bill> billList = billRepository.findById(id);
        Bill b = null;

        if (billList.isPresent()) {
            b = billList.get();
        }

        System.out.println(b);
        return b;
    }

}
