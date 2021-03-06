/*
 * Binance SPOT Public API
 * The swagger file of Binance Public API  API documents:   - [https://github.com/binance-exchange/binance-official-api-docs](https://github.com/binance-exchange/binance-official-api-docs)   - [https://binance-docs.github.io/apidocs/spot/en](https://binance-docs.github.io/apidocs/spot/en)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse20029AssetDetailCTR
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-26T21:41:41.962Z[GMT]")
public class InlineResponse20029AssetDetailCTR {
  @SerializedName("minWithdrawAmount")
  private String minWithdrawAmount = null;

  @SerializedName("depositStatus")
  private Boolean depositStatus = null;

  @SerializedName("withdrawFee")
  private String withdrawFee = null;

  @SerializedName("withdrawStatus")
  private Boolean withdrawStatus = null;

  public InlineResponse20029AssetDetailCTR minWithdrawAmount(String minWithdrawAmount) {
    this.minWithdrawAmount = minWithdrawAmount;
    return this;
  }

   /**
   * Get minWithdrawAmount
   * @return minWithdrawAmount
  **/
  @Schema(example = "0.02000000", description = "")
  public String getMinWithdrawAmount() {
    return minWithdrawAmount;
  }

  public void setMinWithdrawAmount(String minWithdrawAmount) {
    this.minWithdrawAmount = minWithdrawAmount;
  }

  public InlineResponse20029AssetDetailCTR depositStatus(Boolean depositStatus) {
    this.depositStatus = depositStatus;
    return this;
  }

   /**
   * Get depositStatus
   * @return depositStatus
  **/
  @Schema(example = "true", description = "")
  public Boolean isDepositStatus() {
    return depositStatus;
  }

  public void setDepositStatus(Boolean depositStatus) {
    this.depositStatus = depositStatus;
  }

  public InlineResponse20029AssetDetailCTR withdrawFee(String withdrawFee) {
    this.withdrawFee = withdrawFee;
    return this;
  }

   /**
   * Get withdrawFee
   * @return withdrawFee
  **/
  @Schema(example = "0.01", description = "")
  public String getWithdrawFee() {
    return withdrawFee;
  }

  public void setWithdrawFee(String withdrawFee) {
    this.withdrawFee = withdrawFee;
  }

  public InlineResponse20029AssetDetailCTR withdrawStatus(Boolean withdrawStatus) {
    this.withdrawStatus = withdrawStatus;
    return this;
  }

   /**
   * Get withdrawStatus
   * @return withdrawStatus
  **/
  @Schema(example = "true", description = "")
  public Boolean isWithdrawStatus() {
    return withdrawStatus;
  }

  public void setWithdrawStatus(Boolean withdrawStatus) {
    this.withdrawStatus = withdrawStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20029AssetDetailCTR inlineResponse20029AssetDetailCTR = (InlineResponse20029AssetDetailCTR) o;
    return Objects.equals(this.minWithdrawAmount, inlineResponse20029AssetDetailCTR.minWithdrawAmount) &&
        Objects.equals(this.depositStatus, inlineResponse20029AssetDetailCTR.depositStatus) &&
        Objects.equals(this.withdrawFee, inlineResponse20029AssetDetailCTR.withdrawFee) &&
        Objects.equals(this.withdrawStatus, inlineResponse20029AssetDetailCTR.withdrawStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minWithdrawAmount, depositStatus, withdrawFee, withdrawStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20029AssetDetailCTR {\n");
    
    sb.append("    minWithdrawAmount: ").append(toIndentedString(minWithdrawAmount)).append("\n");
    sb.append("    depositStatus: ").append(toIndentedString(depositStatus)).append("\n");
    sb.append("    withdrawFee: ").append(toIndentedString(withdrawFee)).append("\n");
    sb.append("    withdrawStatus: ").append(toIndentedString(withdrawStatus)).append("\n");
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
