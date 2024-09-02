package googledrivelyh.domain;

import googledrivelyh.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String fileLocation;
    private String fileType;
    private String fileName;
    private String indexStatus;
}
