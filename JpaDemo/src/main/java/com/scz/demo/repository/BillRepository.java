package com.scz.demo.repository;

import com.scz.demo.bean.Bill;
import com.scz.demo.bean.dto.BillDto;

import java.util.List;


public interface BillRepository  {
     Bill getByHisId(String hisId);
     List<Bill> getBills(String tableParBegin, String tableEnd);

     BillDto getByHisId2(String hisId);
}
