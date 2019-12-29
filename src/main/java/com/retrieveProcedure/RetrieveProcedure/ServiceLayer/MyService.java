package com.retrieveProcedure.RetrieveProcedure.ServiceLayer;

import com.retrieveProcedure.RetrieveProcedure.model.MyDispatche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import java.util.List;


@Service
public class MyService {

    @Autowired
    private EntityManager em;

    public List<MyDispatche> getAllDispatches() {
        return em.createNamedStoredProcedureQuery("GET_ALL_DISPATCHES").getResultList();
    }
}
