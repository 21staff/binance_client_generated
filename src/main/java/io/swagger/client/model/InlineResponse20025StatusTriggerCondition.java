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
 * InlineResponse20025StatusTriggerCondition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-26T21:41:41.962Z[GMT]")
public class InlineResponse20025StatusTriggerCondition {
  @SerializedName("gcr")
  private Integer gcr = null;

  @SerializedName("ifer")
  private Integer ifer = null;

  @SerializedName("ufr")
  private Integer ufr = null;

  public InlineResponse20025StatusTriggerCondition gcr(Integer gcr) {
    this.gcr = gcr;
    return this;
  }

   /**
   * Get gcr
   * @return gcr
  **/
  @Schema(example = "150", description = "")
  public Integer getGcr() {
    return gcr;
  }

  public void setGcr(Integer gcr) {
    this.gcr = gcr;
  }

  public InlineResponse20025StatusTriggerCondition ifer(Integer ifer) {
    this.ifer = ifer;
    return this;
  }

   /**
   * Get ifer
   * @return ifer
  **/
  @Schema(example = "150", description = "")
  public Integer getIfer() {
    return ifer;
  }

  public void setIfer(Integer ifer) {
    this.ifer = ifer;
  }

  public InlineResponse20025StatusTriggerCondition ufr(Integer ufr) {
    this.ufr = ufr;
    return this;
  }

   /**
   * Get ufr
   * @return ufr
  **/
  @Schema(example = "150", description = "")
  public Integer getUfr() {
    return ufr;
  }

  public void setUfr(Integer ufr) {
    this.ufr = ufr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025StatusTriggerCondition inlineResponse20025StatusTriggerCondition = (InlineResponse20025StatusTriggerCondition) o;
    return Objects.equals(this.gcr, inlineResponse20025StatusTriggerCondition.gcr) &&
        Objects.equals(this.ifer, inlineResponse20025StatusTriggerCondition.ifer) &&
        Objects.equals(this.ufr, inlineResponse20025StatusTriggerCondition.ufr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcr, ifer, ufr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025StatusTriggerCondition {\n");
    
    sb.append("    gcr: ").append(toIndentedString(gcr)).append("\n");
    sb.append("    ifer: ").append(toIndentedString(ifer)).append("\n");
    sb.append("    ufr: ").append(toIndentedString(ufr)).append("\n");
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