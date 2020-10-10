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
 * Represents an transfer type of the system
 */
@ApiModel(description = "Represents an transfer type of the system")
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TransferType {

    @JsonProperty("id")
    @ApiModelProperty(required = true, value = "The ID of the transfer type")
    @NotNull
    private Integer id = null;

    @JsonProperty("description")
    @ApiModelProperty(required = true, value = "The description of the transfer type")
    @NotNull
    private String description = null;
}
