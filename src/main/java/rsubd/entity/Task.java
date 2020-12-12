package rsubd.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Task {
    private long id;
    private String name;
    private Timestamp dateStart;
    private Timestamp realDateEnd;
    private Timestamp dateEnd;


}
