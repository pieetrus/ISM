package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SportHallRating
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-08T20:35:21.763Z[GMT]")


public class SportHallRating   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("parquetQuality")
  private Integer parquetQuality = null;

  @JsonProperty("basketsQuality")
  private Integer basketsQuality = null;

  @JsonProperty("boardsQuality")
  private Integer boardsQuality = null;

  @JsonProperty("showersQuality")
  private Integer showersQuality = null;

  public SportHallRating id(Long id) {
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

  public SportHallRating userId(Long userId) {
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

  public SportHallRating value(Integer value) {
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

  public SportHallRating parquetQuality(Integer parquetQuality) {
    this.parquetQuality = parquetQuality;
    return this;
  }

  /**
   * Get parquetQuality
   * @return parquetQuality
   **/
  @Schema(description = "")
  
    public Integer getParquetQuality() {
    return parquetQuality;
  }

  public void setParquetQuality(Integer parquetQuality) {
    this.parquetQuality = parquetQuality;
  }

  public SportHallRating basketsQuality(Integer basketsQuality) {
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

  public SportHallRating boardsQuality(Integer boardsQuality) {
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

  public SportHallRating showersQuality(Integer showersQuality) {
    this.showersQuality = showersQuality;
    return this;
  }

  /**
   * Get showersQuality
   * @return showersQuality
   **/
  @Schema(description = "")
  
    public Integer getShowersQuality() {
    return showersQuality;
  }

  public void setShowersQuality(Integer showersQuality) {
    this.showersQuality = showersQuality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SportHallRating sportHallRating = (SportHallRating) o;
    return Objects.equals(this.id, sportHallRating.id) &&
        Objects.equals(this.userId, sportHallRating.userId) &&
        Objects.equals(this.value, sportHallRating.value) &&
        Objects.equals(this.parquetQuality, sportHallRating.parquetQuality) &&
        Objects.equals(this.basketsQuality, sportHallRating.basketsQuality) &&
        Objects.equals(this.boardsQuality, sportHallRating.boardsQuality) &&
        Objects.equals(this.showersQuality, sportHallRating.showersQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, value, parquetQuality, basketsQuality, boardsQuality, showersQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SportHallRating {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    parquetQuality: ").append(toIndentedString(parquetQuality)).append("\n");
    sb.append("    basketsQuality: ").append(toIndentedString(basketsQuality)).append("\n");
    sb.append("    boardsQuality: ").append(toIndentedString(boardsQuality)).append("\n");
    sb.append("    showersQuality: ").append(toIndentedString(showersQuality)).append("\n");
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
