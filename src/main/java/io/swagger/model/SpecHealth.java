package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecHealth
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-30T13:45:08.782-04:00")

public class SpecHealth   {
  @JsonProperty("Disabled")
  private Boolean disabled = null;

  @JsonProperty("PeriodSeconds")
  private Integer periodSeconds = null;

  @JsonProperty("FailureThreshold")
  private Integer failureThreshold = null;

  @JsonProperty("InitialDelaySeconds")
  private Integer initialDelaySeconds = null;

  public SpecHealth disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public SpecHealth periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * Get periodSeconds
   * @return periodSeconds
  **/
  @ApiModelProperty(value = "")


  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public SpecHealth failureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return this;
  }

  /**
   * Get failureThreshold
   * @return failureThreshold
  **/
  @ApiModelProperty(value = "")


  public Integer getFailureThreshold() {
    return failureThreshold;
  }

  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }

  public SpecHealth initialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

  /**
   * Get initialDelaySeconds
   * @return initialDelaySeconds
  **/
  @ApiModelProperty(value = "")


  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecHealth specHealth = (SpecHealth) o;
    return Objects.equals(this.disabled, specHealth.disabled) &&
        Objects.equals(this.periodSeconds, specHealth.periodSeconds) &&
        Objects.equals(this.failureThreshold, specHealth.failureThreshold) &&
        Objects.equals(this.initialDelaySeconds, specHealth.initialDelaySeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, periodSeconds, failureThreshold, initialDelaySeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecHealth {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
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

