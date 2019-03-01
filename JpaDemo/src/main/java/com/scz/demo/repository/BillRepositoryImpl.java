package com.scz.demo.repository;

import com.scz.demo.bean.Bill;
import com.scz.demo.bean.BillDetail;
import com.scz.demo.bean.dto.BillDetailDto;
import com.scz.demo.bean.dto.BillDto;
import com.scz.demo.tools.DateHelper;
import org.assertj.core.internal.Iterables;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.sound.midi.SysexMessage;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Repository
public class BillRepositoryImpl implements BillRepository {

    @PersistenceContext
    EntityManager em;

    public Bill getByHisId(String hisId) {
        StringBuilder builder = new StringBuilder("SELECT T.hisid as hisId,\n" +
                "       T.BILLDATE as billDate,\n" +
                "       T.ID as id" +

                "  FROM DW_BILL T ");

        builder.append(" WHERE 1=1 ");
        builder.append(" AND T.hisid = ?1 ");

        Query query = em.createNativeQuery(builder.toString());
        query.setParameter(1, hisId);

        /*
        List<Bill> myList = query.getResultList();
        if (!myList.isEmpty())
        {
            Bill _bill = (Bill) myList.get(0);
            System.out.println(_bill);
        }
        */

        Object[] r = (Object[]) query.getSingleResult();

        Bill b = new Bill();
        b.setHisId(r[0].toString());

        Timestamp ts = (Timestamp) r[1];
        Date d2 = null;
        try {
            d2 = ts;
            System.out.println(d2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        b.setBillDate(d2);

        /*
        try {
            b.setBillDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(r[1].toString()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
*/

        b.setId(r[2].toString());

        return b;
    }

    public List<Bill> getBills(String tableParBegin, String tableParEnd) {
        StringBuilder builder = new StringBuilder("SELECT T.HISID,\n" +
                "       T.BILLDATE,\n" +
                "       T.ID,\n" +
                "       T.HOSPITAL_ID,\n" +
                "       T.HOSPITAL_NAME,\n" +
                "       T.BMI_NOPAY\n" +
                "  FROM DW_BILL T ");

        builder.append(" WHERE 1=1 ");
        builder.append(" AND T.TABLE_PAR >= ?1 ");
        builder.append(" AND T.TABLE_PAR <= ?2 ");

        Query query = em.createNativeQuery(builder.toString());

        query.setParameter(1, tableParBegin);
        query.setParameter(2, tableParEnd);

        List result = query.getResultList();

        return result;
    }

    public BillDto getByHisId2(String hisId) {

        StringBuilder builder = new StringBuilder("SELECT B.hisid ,\n" +
                "       B.BILLDATE ,\n" +
                "       B.ID AS BillId ," +
                "D.ID AS DetailId,\n" +
                "       D.PID,\n" +
                "       D.ITEM_ID,\n" +
                "       D.ITEM_DATE " +
                "  FROM DW_BILL B ");
        builder.append(" LEFT JOIN DW_BILLDETAIL D\n" +
                "    ON B.HISID = D.PID\n" +
                "       AND B.TABLE_PAR = D.TABLE_PAR ");

        builder.append(" WHERE 1=1 ");
        builder.append(" AND B.hisid = ?1 ");

        Query query = em.createNativeQuery(builder.toString());
        query.setParameter(1, hisId);

        List bills = query.getResultList();

        List<BillDto> billDtos ;

        /*
        for (Object[] r : bills) {
            BillDto b = new BillDto();

            b.setHisId(r[0].toString());
            b.setId(r[1].toString());

            String detailId = r[3].toString();
            String pId = r[4].toString();
            String itemId = r[5].toString();
            String itemName = r[6].toString();
            Date itemDate = DateHelper.parse(r[7]);

            BillDetailDto billDetailDto = new BillDetailDto(detailId,pId,itemId,itemName,itemDate);

            b.setDetails(billDetailDto);

            System.out.println(r);
        }
*/

       /* b.setHisId(r[0].toString());
        b.setId(r[1].toString());

        String detailId = r[3].toString();
        String pId = r[4].toString();
        String itemId = r[5].toString();
        String itemName = r[6].toString();
        Date itemDate = DateHelper.parse(r[7]);

        BillDetailDto billDetailDto = new BillDetailDto(detailId,pId,itemId,itemName,itemDate);

        b.setDetails(billDetailDto);*/

        /*Timestamp ts = (Timestamp) r[1];
        Date d2 = null;
        try {
            d2 = ts;
            System.out.println(d2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        b.setBillDate(d2);*/

        return null;

    }

}
