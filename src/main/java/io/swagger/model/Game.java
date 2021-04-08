package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Game
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-08T20:35:21.763Z[GMT]")


public class Game   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("courtId")
  private Long courtId = null;

  @JsonProperty("sportHallId")
  private Long sportHallId = null;

  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("gotBall")
  private String gotBall = null;

  @JsonProperty("playersMaxAmount")
  private Integer playersMaxAmount = null;

  @JsonProperty("photoUrls")
  @Valid
  private List<String> photoUrls = null;

  public Game id(Long id) {
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

  public Game courtId(Long courtId) {
    this.courtId = courtId;
    return this;
  }

  /**
   * Get courtId
   * @return courtId
   **/
  @Schema(description = "")
  
    public Long getCourtId() {
    return courtId;
  }

  public void setCourtId(Long courtId) {
    this.courtId = courtId;
  }

  public Game sportHallId(Long sportHallId) {
    this.sportHallId = sportHallId;
    return this;
  }

  /**
   * Get sportHallId
   * @return sportHallId
   **/
  @Schema(description = "")
  
    public Long getSportHallId() {
    return sportHallId;
  }

  public void setSportHallId(Long sportHallId) {
    this.sportHallId = sportHallId;
  }

  public Game price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Game date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Game gotBall(String gotBall) {
    this.gotBall = gotBall;
    return this;
  }

  /**
   * Get gotBall
   * @return gotBall
   **/
  @Schema(description = "")
  
    public String getGotBall() {
    return gotBall;
  }

  public void setGotBall(String gotBall) {
    this.gotBall = gotBall;
  }

  public Game playersMaxAmount(Integer playersMaxAmount) {
    this.playersMaxAmount = playersMaxAmount;
    return this;
  }

  /**
   * Get playersMaxAmount
   * @return playersMaxAmount
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getPlayersMaxAmount() {
    return playersMaxAmount;
  }

  public void setPlayersMaxAmount(Integer playersMaxAmount) {
    this.playersMaxAmount = playersMaxAmount;
  }

  public Game photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Game addPhotoUrlsItem(String photoUrlsItem) {
    if (this.photoUrls == null) {
      this.photoUrls = new ArrayList<String>();
    }
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

  /**
   * Get photoUrls
   * @return photoUrls
   **/
  @Schema(description = "")
  
    public List<String> getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Game game = (Game) o;
    return Objects.equals(this.id, game.id) &&
        Objects.equals(this.courtId, game.courtId) &&
        Objects.equals(this.sportHallId, game.sportHallId) &&
        Objects.equals(this.price, game.price) &&
        Objects.equals(this.date, game.date) &&
        Objects.equals(this.gotBall, game.gotBall) &&
        Objects.equals(this.playersMaxAmount, game.playersMaxAmount) &&
        Objects.equals(this.photoUrls, game.photoUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, courtId, sportHallId, price, date, gotBall, playersMaxAmount, photoUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    courtId: ").append(toIndentedString(courtId)).append("\n");
    sb.append("    sportHallId: ").append(toIndentedString(sportHallId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    gotBall: ").append(toIndentedString(gotBall)).append("\n");
    sb.append("    playersMaxAmount: ").append(toIndentedString(playersMaxAmount)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
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
