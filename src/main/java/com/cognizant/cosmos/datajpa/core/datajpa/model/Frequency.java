package com.cognizant.cosmos.datajpa.core.datajpa.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents an frequency of the system
 */
@ApiModel(description = "Represents an frequency of the system")
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Frequency {

    @JsonProperty("id")
    @ApiModelProperty(required = true, value = "The ID of the frequency")
    @NotNull
    private Integer id = null;

    @JsonProperty("description")
    @ApiModelProperty(required = true, value = "The description of the frequency")
    @NotNull
    private String description = null;
}
