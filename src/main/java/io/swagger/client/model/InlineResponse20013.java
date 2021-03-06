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
 * InlineResponse20013
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-26T21:41:41.962Z[GMT]")
public class InlineResponse20013 {
  @SerializedName("base")
  private String base = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("isBuyAllowed")
  private Boolean isBuyAllowed = null;

  @SerializedName("isMarginTrade")
  private Boolean isMarginTrade = null;

  @SerializedName("isSellAllowed")
  private Boolean isSellAllowed = null;

  @SerializedName("quote")
  private String quote = null;

  @SerializedName("symbol")
  private String symbol = null;

  public InlineResponse20013 base(String base) {
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @Schema(example = "BNB", description = "")
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public InlineResponse20013 id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "351637150141315840", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse20013 isBuyAllowed(Boolean isBuyAllowed) {
    this.isBuyAllowed = isBuyAllowed;
    return this;
  }

   /**
   * Get isBuyAllowed
   * @return isBuyAllowed
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsBuyAllowed() {
    return isBuyAllowed;
  }

  public void setIsBuyAllowed(Boolean isBuyAllowed) {
    this.isBuyAllowed = isBuyAllowed;
  }

  public InlineResponse20013 isMarginTrade(Boolean isMarginTrade) {
    this.isMarginTrade = isMarginTrade;
    return this;
  }

   /**
   * Get isMarginTrade
   * @return isMarginTrade
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsMarginTrade() {
    return isMarginTrade;
  }

  public void setIsMarginTrade(Boolean isMarginTrade) {
    this.isMarginTrade = isMarginTrade;
  }

  public InlineResponse20013 isSellAllowed(Boolean isSellAllowed) {
    this.isSellAllowed = isSellAllowed;
    return this;
  }

   /**
   * Get isSellAllowed
   * @return isSellAllowed
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsSellAllowed() {
    return isSellAllowed;
  }

  public void setIsSellAllowed(Boolean isSellAllowed) {
    this.isSellAllowed = isSellAllowed;
  }

  public InlineResponse20013 quote(String quote) {
    this.quote = quote;
    return this;
  }

   /**
   * Get quote
   * @return quote
  **/
  @Schema(example = "BTC", description = "")
  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  public InlineResponse20013 symbol(String symbol) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return Objects.equals(this.base, inlineResponse20013.base) &&
        Objects.equals(this.id, inlineResponse20013.id) &&
        Objects.equals(this.isBuyAllowed, inlineResponse20013.isBuyAllowed) &&
        Objects.equals(this.isMarginTrade, inlineResponse20013.isMarginTrade) &&
        Objects.equals(this.isSellAllowed, inlineResponse20013.isSellAllowed) &&
        Objects.equals(this.quote, inlineResponse20013.quote) &&
        Objects.equals(this.symbol, inlineResponse20013.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, id, isBuyAllowed, isMarginTrade, isSellAllowed, quote, symbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBuyAllowed: ").append(toIndentedString(isBuyAllowed)).append("\n");
    sb.append("    isMarginTrade: ").append(toIndentedString(isMarginTrade)).append("\n");
    sb.append("    isSellAllowed: ").append(toIndentedString(isSellAllowed)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
