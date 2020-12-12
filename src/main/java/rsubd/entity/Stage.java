package rsubd.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class Stage {
    private long id;
    private Timestamp dateStart;
    private Integer importance;
    private Integer readinessDegree;
    private Timestamp realDateEnd;
    private Timestamp dateEnd;
    private Integer  nameId;
    private Integer taskId;
    private Integer responsibleId;



}
