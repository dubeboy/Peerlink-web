package za.co.dubedivine.networks.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import za.co.dubedivine.networks.model.Tag;

public interface TagRepository extends MongoRepository<Tag, String>, QueryDslPredicateExecutor<Tag> {
}