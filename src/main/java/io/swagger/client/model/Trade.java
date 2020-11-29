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
 * Trade
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-26T21:41:41.962Z[GMT]")
public class Trade {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("qty")
  private String qty = null;

  @SerializedName("quoteQty")
  private String quoteQty = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("isBuyerMaker")
  private Boolean isBuyerMaker = null;

  @SerializedName("isBestMatch")
  private Boolean isBestMatch = null;

  public Trade id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * trade id
   * @return id
  **/
  @Schema(example = "345196462", description = "trade id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Trade price(String price) {
    this.price = price;
    return this;
  }

   /**
   * price
   * @return price
  **/
  @Schema(example = "9638.99000000", description = "price")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Trade qty(String qty) {
    this.qty = qty;
    return this;
  }

   /**
   * amount of base asset
   * @return qty
  **/
  @Schema(example = "0.02077200", description = "amount of base asset")
  public String getQty() {
    return qty;
  }

  public void setQty(String qty) {
    this.qty = qty;
  }

  public Trade quoteQty(String quoteQty) {
    this.quoteQty = quoteQty;
    return this;
  }

   /**
   * amount of quote asset
   * @return quoteQty
  **/
  @Schema(example = "0.02077200", description = "amount of quote asset")
  public String getQuoteQty() {
    return quoteQty;
  }

  public void setQuoteQty(String quoteQty) {
    this.quoteQty = quoteQty;
  }

  public Trade time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * trade timestamp
   * @return time
  **/
  @Schema(example = "1592887772684", description = "trade timestamp")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public Trade isBuyerMaker(Boolean isBuyerMaker) {
    this.isBuyerMaker = isBuyerMaker;
    return this;
  }

   /**
   * Get isBuyerMaker
   * @return isBuyerMaker
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsBuyerMaker() {
    return isBuyerMaker;
  }

  public void setIsBuyerMaker(Boolean isBuyerMaker) {
    this.isBuyerMaker = isBuyerMaker;
  }

  public Trade isBestMatch(Boolean isBestMatch) {
    this.isBestMatch = isBestMatch;
    return this;
  }

   /**
   * Get isBestMatch
   * @return isBestMatch
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsBestMatch() {
    return isBestMatch;
  }

  public void setIsBestMatch(Boolean isBestMatch) {
    this.isBestMatch = isBestMatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trade trade = (Trade) o;
    return Objects.equals(this.id, trade.id) &&
        Objects.equals(this.price, trade.price) &&
        Objects.equals(this.qty, trade.qty) &&
        Objects.equals(this.quoteQty, trade.quoteQty) &&
        Objects.equals(this.time, trade.time) &&
        Objects.equals(this.isBuyerMaker, trade.isBuyerMaker) &&
        Objects.equals(this.isBestMatch, trade.isBestMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, qty, quoteQty, time, isBuyerMaker, isBestMatch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trade {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    quoteQty: ").append(toIndentedString(quoteQty)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    isBuyerMaker: ").append(toIndentedString(isBuyerMaker)).append("\n");
    sb.append("    isBestMatch: ").append(toIndentedString(isBestMatch)).append("\n");
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