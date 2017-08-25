package test.rxjava.db.repo;

import test.rxjava.db.model.Processed;
import org.springframework.data.repository.CrudRepository;

public interface ProcessedRepository extends CrudRepository<Processed, Integer> {

}
