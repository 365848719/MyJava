package com.scz.demo.service;

import com.scz.demo.bean.Bill;
import com.scz.demo.bean.dto.BillDto;

import java.util.List;


public interface BillService {
     Bill getByHisId(String hisId);
     List<Bill> getBills(String tableParBegin,String tableParEnd);

     BillDto getByHisId2(String hisId);
}
