package com.retrieveProcedure.RetrieveProcedure.model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DISPATCHES")
@NamedStoredProcedureQueries(
        @NamedStoredProcedureQuery(name = "GET_ALL_DISPATCHES", procedureName = "GET_ALL_DISPATCHES", resultClasses = MyDispatche.class,
                parameters = {@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, type = void.class)}))
@Data
public class MyDispatche {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

    @Column(name = "PRODUCTNAME")
    private String PRODUCTNAME;

    @Column(name = "CUSTOMERNAME")
    private String CUSTOMERNAME;

    @Column(name = "DISPATCHDATE")
    private Date DISPATCHDATE;

    @Column(name = "DELIVERYTIME")
    private String DELIVERYTIME;

    @Column(name = "PRICE")
    private Double PRICE;

    @Column(name = "LOCATION")
    private String LOCATION;
}
