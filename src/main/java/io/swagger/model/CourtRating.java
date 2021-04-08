package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CourtRating
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-08T20:35:21.763Z[GMT]")


public class CourtRating   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("surfaceQuality")
  private Integer surfaceQuality = null;

  @JsonProperty("basketsQuality")
  private Integer basketsQuality = null;

  @JsonProperty("boardsQuality")
  private Integer boardsQuality = null;

  public CourtRating id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CourtRating userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(description = "")
  
    public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public CourtRating value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public CourtRating surfaceQuality(Integer surfaceQuality) {
    this.surfaceQuality = surfaceQuality;
    return this;
  }

  /**
   * Get surfaceQuality
   * @return surfaceQuality
   **/
  @Schema(description = "")
  
    public Integer getSurfaceQuality() {
    return surfaceQuality;
  }

  public void setSurfaceQuality(Integer surfaceQuality) {
    this.surfaceQuality = surfaceQuality;
  }

  public CourtRating basketsQuality(Integer basketsQuality) {
    this.basketsQuality = basketsQuality;
    return this;
  }

  /**
   * Get basketsQuality
   * @return basketsQuality
   **/
  @Schema(description = "")
  
    public Integer getBasketsQuality() {
    return basketsQuality;
  }

  public void setBasketsQuality(Integer basketsQuality) {
    this.basketsQuality = basketsQuality;
  }

  public CourtRating boardsQuality(Integer boardsQuality) {
    this.boardsQuality = boardsQuality;
    return this;
  }

  /**
   * Get boardsQuality
   * @return boardsQuality
   **/
  @Schema(description = "")
  
    public Integer getBoardsQuality() {
    return boardsQuality;
  }

  public void setBoardsQuality(Integer boardsQuality) {
    this.boardsQuality = boardsQuality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourtRating courtRating = (CourtRating) o;
    return Objects.equals(this.id, courtRating.id) &&
        Objects.equals(this.userId, courtRating.userId) &&
        Objects.equals(this.value, courtRating.value) &&
        Objects.equals(this.surfaceQuality, courtRating.surfaceQuality) &&
        Objects.equals(this.basketsQuality, courtRating.basketsQuality) &&
        Objects.equals(this.boardsQuality, courtRating.boardsQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, value, surfaceQuality, basketsQuality, boardsQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourtRating {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    surfaceQuality: ").append(toIndentedString(surfaceQuality)).append("\n");
    sb.append("    basketsQuality: ").append(toIndentedString(basketsQuality)).append("\n");
    sb.append("    boardsQuality: ").append(toIndentedString(boardsQuality)).append("\n");
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
