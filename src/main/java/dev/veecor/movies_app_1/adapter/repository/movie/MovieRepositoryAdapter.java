package dev.veecor.movies_app_1.adapter.repository.movie;

import dev.veecor.movies_app_1.app.api.movie.MovieRepository;
import dev.veecor.movies_app_1.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepositoryAdapter implements MovieRepository {
    private final MovieMongoRepository movieMongoRepository;

    @Autowired
    public MovieRepositoryAdapter(MovieMongoRepository movieMongoRepository) {
        this.movieMongoRepository = movieMongoRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieMongoRepository.findAll();
    }
}
