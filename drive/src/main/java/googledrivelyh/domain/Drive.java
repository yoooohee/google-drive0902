package googledrivelyh.domain;

import googledrivelyh.DriveApplication;
import googledrivelyh.domain.FileUploaded;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Drive_table")
@Data
//<<< DDD / Aggregate Root
public class Drive {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileLocaton;

    private String fileName;

    private String fileType;

    private String uploadDate;

    private String fileSize;

    private String uploadStatus;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static DriveRepository repository() {
        DriveRepository driveRepository = DriveApplication.applicationContext.getBean(
            DriveRepository.class
        );
        return driveRepository;
    }
}
//>>> DDD / Aggregate Root
