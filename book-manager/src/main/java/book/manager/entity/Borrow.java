package book.manager.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Borrow {
    private int id;
    private int sid;
    private int bid;
    private Date time;
}
