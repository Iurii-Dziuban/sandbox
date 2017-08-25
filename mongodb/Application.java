package test.mongo;

import test.mongo.service.DbService;
import test.mongo.service.GridFsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private final DbService dbService;
    private final GridFsClient gridFsClient;

    @Autowired
    public Application(DbService dbService, GridFsClient gridFsClient) {
        this.dbService = dbService;
        this.gridFsClient = gridFsClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        dbService.updateDB();
//        gridFsClient.storeFileToGridFs("testing.png");
        gridFsClient.findFile();
    }


}
