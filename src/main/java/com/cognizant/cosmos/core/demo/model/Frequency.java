/*
 * instruction-service
 * api.description
 *
 * OpenAPI spec version: 1.0
 * Contact: api@demo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cognizant.cosmos.core.demo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Represents an frequency of the system
 */
@ApiModel(description = "Represents an frequency of the system")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-09-25T10:14:50.431+05:30")
public class Frequency   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("description")
  private String description = null;

  public Frequency id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the frequency
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(required = true, value = "The ID of the frequency")
  @NotNull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Frequency description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the frequency
   * @return description
   **/
  @JsonProperty("description")
  @ApiModelProperty(required = true, value = "The description of the frequency")
  @NotNull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Frequency frequency = (Frequency) o;
    return Objects.equals(this.id, frequency.id) &&
        Objects.equals(this.description, frequency.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Frequency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

