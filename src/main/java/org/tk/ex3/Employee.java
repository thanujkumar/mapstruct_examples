package org.tk.ex3;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private Date startDate;
    private int id;
    private String name;
    private Division division;
}