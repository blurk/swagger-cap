/*
 * The Capgemini Movie Database
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.Movie;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertFalse;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Ajouter un nouveau film
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMovieTest() throws ApiException {
        Movie movie = null;
        Movie response = api.addMovie(movie);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Supprimer un film
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMovieByIdTest() throws ApiException {
        Long id = null;
        api.deleteMovieById(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retourne un seul film
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMovieByIdTest() throws ApiException {
        Long id = null;
        Movie response = api.getMovieById(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retourne tous les films
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMoviesTest() throws ApiException {
        List<Movie> response = api.getMovies();
        System.out.println(response);
        assertFalse(response.isEmpty());    }
    
    /**
     * 
     *
     * Mettre à jour un film existant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMovieByIdTest() throws ApiException {
        Long id = null;
        Movie movie = null;
        Movie response = api.updateMovieById(id, movie);

        // TODO: test validations
    }
    
}
