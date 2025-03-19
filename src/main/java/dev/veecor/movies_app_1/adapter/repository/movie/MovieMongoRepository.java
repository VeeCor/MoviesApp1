package dev.veecor.movies_app_1.adapter.repository.movie;

import dev.veecor.movies_app_1.domain.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieMongoRepository extends MongoRepository<Movie, ObjectId> {
}
