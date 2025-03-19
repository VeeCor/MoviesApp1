package dev.veecor.movies_app_1.app.impl;

import dev.veecor.movies_app_1.app.api.movie.FindAllMoviesInbound;
import dev.veecor.movies_app_1.app.api.movie.MovieRepository;
import dev.veecor.movies_app_1.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FindAllMoviesUseCase implements FindAllMoviesInbound {
    private final MovieRepository movieRepository;

    @Autowired
    public FindAllMoviesUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Transactional
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
