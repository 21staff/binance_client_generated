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
 * BookTicker
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-26T21:41:41.962Z[GMT]")
public class BookTicker implements OneOfinlineResponse2006 {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("bidPrice")
  private String bidPrice = null;

  @SerializedName("bidQty")
  private String bidQty = null;

  @SerializedName("askPrice")
  private String askPrice = null;

  @SerializedName("askQty")
  private String askQty = null;

  public BookTicker symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(example = "BNBBTC", description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public BookTicker bidPrice(String bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * Get bidPrice
   * @return bidPrice
  **/
  @Schema(example = "16.36240000", description = "")
  public String getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(String bidPrice) {
    this.bidPrice = bidPrice;
  }

  public BookTicker bidQty(String bidQty) {
    this.bidQty = bidQty;
    return this;
  }

   /**
   * Get bidQty
   * @return bidQty
  **/
  @Schema(example = "256.78000000", description = "")
  public String getBidQty() {
    return bidQty;
  }

  public void setBidQty(String bidQty) {
    this.bidQty = bidQty;
  }

  public BookTicker askPrice(String askPrice) {
    this.askPrice = askPrice;
    return this;
  }

   /**
   * Get askPrice
   * @return askPrice
  **/
  @Schema(example = "16.36450000", description = "")
  public String getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(String askPrice) {
    this.askPrice = askPrice;
  }

  public BookTicker askQty(String askQty) {
    this.askQty = askQty;
    return this;
  }

   /**
   * Get askQty
   * @return askQty
  **/
  @Schema(example = "12.56000000", description = "")
  public String getAskQty() {
    return askQty;
  }

  public void setAskQty(String askQty) {
    this.askQty = askQty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookTicker bookTicker = (BookTicker) o;
    return Objects.equals(this.symbol, bookTicker.symbol) &&
        Objects.equals(this.bidPrice, bookTicker.bidPrice) &&
        Objects.equals(this.bidQty, bookTicker.bidQty) &&
        Objects.equals(this.askPrice, bookTicker.askPrice) &&
        Objects.equals(this.askQty, bookTicker.askQty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, bidPrice, bidQty, askPrice, askQty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookTicker {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidQty: ").append(toIndentedString(bidQty)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    askQty: ").append(toIndentedString(askQty)).append("\n");
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
