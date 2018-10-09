package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SpecHealth;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameServerSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-30T13:45:08.782-04:00")

public class GameServerSpec   {
  @JsonProperty("health")
  private SpecHealth health = null;

  public GameServerSpec health(SpecHealth health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpecHealth getHealth() {
    return health;
  }

  public void setHealth(SpecHealth health) {
    this.health = health;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameServerSpec gameServerSpec = (GameServerSpec) o;
    return Objects.equals(this.health, gameServerSpec.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(health);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameServerSpec {\n");
    
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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

