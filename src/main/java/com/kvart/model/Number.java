package com.kvart.model;

import javax.persistence.*;

@Entity
@Table(name = "number")
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int BDNumber;

    public Number() {
    }

    public Number(int BDNumber) {
        this.BDNumber = BDNumber;
    }

    public int getId() {
        return id;
    }

    public int getBDNumber() {
        return BDNumber;
    }

    @Override
    public String toString() {
        return "Number{" +
                "id=" + id +
                ", BDNumber=" + BDNumber +
                '}';
    }
}
