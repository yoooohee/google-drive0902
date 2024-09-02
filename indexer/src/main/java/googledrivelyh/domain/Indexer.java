package googledrivelyh.domain;

import googledrivelyh.IndexerApplication;
import googledrivelyh.domain.FileIndexed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Indexer_table")
@Data
//<<< DDD / Aggregate Root
public class Indexer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileLocation;

    private String fileName;

    private String fileType;

    private String indexStatus;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static IndexerRepository repository() {
        IndexerRepository indexerRepository = IndexerApplication.applicationContext.getBean(
            IndexerRepository.class
        );
        return indexerRepository;
    }

    //<<< Clean Arch / Port Method
    public static void indexFile(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Indexer indexer = new Indexer();
        repository().save(indexer);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(indexer->{
            
            indexer // do something
            repository().save(indexer);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
