package googledrivelyh.domain;

import googledrivelyh.domain.*;
import googledrivelyh.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String fileLocation;
    private String fileType;
    private String fileName;
    private String indexStatus;

    public FileIndexed(Indexer aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
//>>> DDD / Domain Event
