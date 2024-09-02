package googledrivelyh.domain;

import googledrivelyh.VideoProcessingApplication;
import googledrivelyh.domain.VideoStreamed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Videoprocessing_table")
@Data
//<<< DDD / Aggregate Root
public class Videoprocessing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileName;

    private String fileType;

    private String videoUrl;

    @PostPersist
    public void onPostPersist() {
        VideoStreamed videoStreamed = new VideoStreamed(this);
        videoStreamed.publishAfterCommit();
    }

    public static VideoprocessingRepository repository() {
        VideoprocessingRepository videoprocessingRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoprocessingRepository.class
        );
        return videoprocessingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void streamVideo(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Videoprocessing videoprocessing = new Videoprocessing();
        repository().save(videoprocessing);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoprocessing->{
            
            videoprocessing // do something
            repository().save(videoprocessing);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
