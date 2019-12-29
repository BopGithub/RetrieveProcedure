package com.retrieveProcedure.RetrieveProcedure.controller;

import com.retrieveProcedure.RetrieveProcedure.ServiceLayer.MyService;
import com.retrieveProcedure.RetrieveProcedure.model.MyDispatche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DispatchesController {

    @Autowired
    private MyService myService;

    @GetMapping("/dispatches")
    public List<MyDispatche> getAllDispatches() {
        return myService.getAllDispatches();
    }
}
