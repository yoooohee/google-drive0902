package googledrivelyh.domain;

import googledrivelyh.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileType;
    private String videoUrl;
}
