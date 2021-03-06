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
 * Transaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-26T21:41:41.962Z[GMT]")
public class Transaction {
  @SerializedName("tranId")
  private Integer tranId = null;

  public Transaction tranId(Integer tranId) {
    this.tranId = tranId;
    return this;
  }

   /**
   * transaction id
   * @return tranId
  **/
  @Schema(example = "345196462", description = "transaction id")
  public Integer getTranId() {
    return tranId;
  }

  public void setTranId(Integer tranId) {
    this.tranId = tranId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.tranId, transaction.tranId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    tranId: ").append(toIndentedString(tranId)).append("\n");
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
