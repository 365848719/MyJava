package com.scz.demo.service;

import com.scz.demo.bean.Bill;
import com.scz.demo.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    BillRepository repository;

    @Override
    public Bill getByHisId(String hisId) {
        return repository.getByHisId(hisId);
    }

    @Override
    public List<Bill> getBills(String tableParBegin, String tableParEnd) {
        return repository.getBills(tableParBegin,tableParEnd);
    }

}
