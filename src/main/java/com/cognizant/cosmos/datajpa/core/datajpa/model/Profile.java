package com.cognizant.cosmos.datajpa.core.datajpa.model;

import java.util.Objects;
import com.cognizant.cosmos.datajpa.core.datajpa.model.Account;
import com.cognizant.cosmos.datajpa.core.datajpa.model.Frequency;
import com.cognizant.cosmos.datajpa.core.datajpa.model.TransferType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents a Transfer Profile of the system
 */
@ApiModel(description = "Represents a Transfer Profile of the system")
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Profile {

    @JsonProperty("id")
    @ApiModelProperty(value = "")
    private Integer id = null;

    @JsonProperty("transfer_amount")
    @ApiModelProperty(required = true, value = "The transfer amount")
    @NotNull
    @DecimalMin("0.01")
    private Double transferAmount = null;

    @JsonProperty("transfer_date")
    @ApiModelProperty(required = true, value = "The transfer date")
    @NotNull
    private Date transferDate = null;

    @JsonProperty("transfer_memo")
    @ApiModelProperty(value = "The transfer memo")
    private String transferMemo = null;

    @JsonProperty("transfer_type")
    @ApiModelProperty(required = true, value = "The transfer type details")
    @NotNull
    private TransferType transferType = null;

    @JsonProperty("transfer_frequency")
    @ApiModelProperty(required = true, value = "The transfer frequency details")
    @NotNull
    private Frequency transferFrequency = null;

    @JsonProperty("target_account")
    @ApiModelProperty(required = true, value = "The transfer target account details")
    @NotNull
    private Account targetAccount = null;

    @JsonProperty("source_account")
    @ApiModelProperty(required = true, value = "The transfer source account details")
    @NotNull
    private Account sourceAccount = null;
}
