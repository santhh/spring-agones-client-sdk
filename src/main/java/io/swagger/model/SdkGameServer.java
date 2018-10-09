package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GameServerObjectMeta;
import io.swagger.model.GameServerSpec;
import io.swagger.model.GameServerStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A GameServer Custom Resource Definition object We will only export those resources that make the most sense. Can always expand to more as needed.
 */
@ApiModel(description = "A GameServer Custom Resource Definition object We will only export those resources that make the most sense. Can always expand to more as needed.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-30T13:45:08.782-04:00")

public class SdkGameServer   {
  @JsonProperty("object_meta")
  private GameServerObjectMeta objectMeta = null;

  @JsonProperty("spec")
  private GameServerSpec spec = null;

  @JsonProperty("status")
  private GameServerStatus status = null;

  public SdkGameServer objectMeta(GameServerObjectMeta objectMeta) {
    this.objectMeta = objectMeta;
    return this;
  }

  /**
   * Get objectMeta
   * @return objectMeta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GameServerObjectMeta getObjectMeta() {
    return objectMeta;
  }

  public void setObjectMeta(GameServerObjectMeta objectMeta) {
    this.objectMeta = objectMeta;
  }

  public SdkGameServer spec(GameServerSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GameServerSpec getSpec() {
    return spec;
  }

  public void setSpec(GameServerSpec spec) {
    this.spec = spec;
  }

  public SdkGameServer status(GameServerStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GameServerStatus getStatus() {
    return status;
  }

  public void setStatus(GameServerStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SdkGameServer sdkGameServer = (SdkGameServer) o;
    return Objects.equals(this.objectMeta, sdkGameServer.objectMeta) &&
        Objects.equals(this.spec, sdkGameServer.spec) &&
        Objects.equals(this.status, sdkGameServer.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectMeta, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdkGameServer {\n");
    
    sb.append("    objectMeta: ").append(toIndentedString(objectMeta)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

