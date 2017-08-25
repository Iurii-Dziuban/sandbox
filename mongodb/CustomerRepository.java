package test.mongo.db.repo;

import test.mongo.db.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
@SuppressWarnings("SameParameterValue")
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByFirstName(@Param("name") String firstName);

    List<Customer> findByLastName(@Param("lastName") String lastName);
}
