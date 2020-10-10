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
 * Represents an account of the system
 */
@ApiModel(description = "Represents an account of the system")
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Account {

    @JsonProperty("id")
    @ApiModelProperty(required = true, value = "The ID of the account")
    @NotNull
    private Integer id = null;

    @JsonProperty("number")
    @ApiModelProperty(required = true, value = "The account number")
    @NotNull
    private String number = null;
}
