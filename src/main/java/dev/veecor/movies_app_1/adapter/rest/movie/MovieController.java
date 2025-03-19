package dev.veecor.movies_app_1.adapter.rest.movie;

import dev.veecor.movies_app_1.app.api.movie.FindAllMoviesInbound;
import dev.veecor.movies_app_1.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest-api/movies")
public class MovieController {
    private final FindAllMoviesInbound findAllMoviesInbound;

    @Autowired
    public MovieController(FindAllMoviesInbound findAllMoviesInbound) {
        this.findAllMoviesInbound = findAllMoviesInbound;
    }

    @GetMapping()
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(findAllMoviesInbound.getAllMovies(), HttpStatus.OK);
    }
}
