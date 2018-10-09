package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StatusPort;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameServerStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-30T13:45:08.782-04:00")

public class GameServerStatus   {
  @JsonProperty("state")
  private String state = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("ports")
  @Valid
  private List<StatusPort> ports = null;

  public GameServerStatus state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public GameServerStatus address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public GameServerStatus ports(List<StatusPort> ports) {
    this.ports = ports;
    return this;
  }

  public GameServerStatus addPortsItem(StatusPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<StatusPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Get ports
   * @return ports
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusPort> getPorts() {
    return ports;
  }

  public void setPorts(List<StatusPort> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameServerStatus gameServerStatus = (GameServerStatus) o;
    return Objects.equals(this.state, gameServerStatus.state) &&
        Objects.equals(this.address, gameServerStatus.address) &&
        Objects.equals(this.ports, gameServerStatus.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, address, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameServerStatus {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

