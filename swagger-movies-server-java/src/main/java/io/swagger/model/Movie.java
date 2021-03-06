package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Actors;
import io.swagger.model.MovieRatings;
import io.swagger.model.Posters;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Movie
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-22T22:19:58.119+02:00")

public class Movie   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("ratings")
  private MovieRatings ratings = null;

  @JsonProperty("criticsConsensus")
  private String criticsConsensus = null;

  @JsonProperty("Directors")
  private List<String> directors = null;

  @JsonProperty("Actors")
  private List<Actors> actors = null;

  @JsonProperty("posters")
  private Posters posters = null;

  public Movie id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Movie title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Movie ratings(MovieRatings ratings) {
    this.ratings = ratings;
    return this;
  }

   /**
   * Get ratings
   * @return ratings
  **/
  @ApiModelProperty(value = "")
  public MovieRatings getRatings() {
    return ratings;
  }

  public void setRatings(MovieRatings ratings) {
    this.ratings = ratings;
  }

  public Movie criticsConsensus(String criticsConsensus) {
    this.criticsConsensus = criticsConsensus;
    return this;
  }

   /**
   * Get criticsConsensus
   * @return criticsConsensus
  **/
  @ApiModelProperty(value = "")
  public String getCriticsConsensus() {
    return criticsConsensus;
  }

  public void setCriticsConsensus(String criticsConsensus) {
    this.criticsConsensus = criticsConsensus;
  }

  public Movie directors(List<String> directors) {
    this.directors = directors;
    return this;
  }

  public Movie addDirectorsItem(String directorsItem) {
    if (this.directors == null) {
      this.directors = new ArrayList<String>();
    }
    this.directors.add(directorsItem);
    return this;
  }

   /**
   * Get directors
   * @return directors
  **/
  @ApiModelProperty(value = "")
  public List<String> getDirectors() {
    return directors;
  }

  public void setDirectors(List<String> directors) {
    this.directors = directors;
  }

  public Movie actors(List<Actors> actors) {
    this.actors = actors;
    return this;
  }

  public Movie addActorsItem(Actors actorsItem) {
    if (this.actors == null) {
      this.actors = new ArrayList<Actors>();
    }
    this.actors.add(actorsItem);
    return this;
  }

   /**
   * Get actors
   * @return actors
  **/
  @ApiModelProperty(value = "")
  public List<Actors> getActors() {
    return actors;
  }

  public void setActors(List<Actors> actors) {
    this.actors = actors;
  }

  public Movie posters(Posters posters) {
    this.posters = posters;
    return this;
  }

   /**
   * Get posters
   * @return posters
  **/
  @ApiModelProperty(value = "")
  public Posters getPosters() {
    return posters;
  }

  public void setPosters(Posters posters) {
    this.posters = posters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movie movie = (Movie) o;
    return Objects.equals(this.id, movie.id) &&
        Objects.equals(this.title, movie.title) &&
        Objects.equals(this.ratings, movie.ratings) &&
        Objects.equals(this.criticsConsensus, movie.criticsConsensus) &&
        Objects.equals(this.directors, movie.directors) &&
        Objects.equals(this.actors, movie.actors) &&
        Objects.equals(this.posters, movie.posters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, ratings, criticsConsensus, directors, actors, posters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movie {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    criticsConsensus: ").append(toIndentedString(criticsConsensus)).append("\n");
    sb.append("    directors: ").append(toIndentedString(directors)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    posters: ").append(toIndentedString(posters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

