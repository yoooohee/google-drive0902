package googledrivelyh.domain;

import googledrivelyh.domain.*;
import googledrivelyh.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileLocaton;
    private String fileName;
    private String fileType;
    private String uploadDate;
    private String fileSize;
    private String uploadStatus;
}
