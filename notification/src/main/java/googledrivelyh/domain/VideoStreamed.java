package googledrivelyh.domain;

import googledrivelyh.domain.*;
import googledrivelyh.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileType;
    private String videoUrl;
}
