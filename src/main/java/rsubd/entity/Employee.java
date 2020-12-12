package rsubd.entity;

import lombok.Data;


@Data
public class Employee {
    private long id;
    private String name;
    private String surname;
    private Boolean isBoss;
    private Integer divisionId;


}
