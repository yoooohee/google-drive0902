package googledrivelyh.domain;

import googledrivelyh.domain.*;
import googledrivelyh.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileType;
    private String videoUrl;

    public VideoStreamed(Videoprocessing aggregate) {
        super(aggregate);
    }

    public VideoStreamed() {
        super();
    }
}
//>>> DDD / Domain Event
