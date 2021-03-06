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
 * OrderDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-26T21:41:41.962Z[GMT]")
public class OrderDetails {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("origClientOrderId")
  private String origClientOrderId = null;

  @SerializedName("orderId")
  private Integer orderId = null;

  @SerializedName("orderListId")
  private Integer orderListId = null;

  @SerializedName("price")
  private Float price = null;

  @SerializedName("origQty")
  private Float origQty = null;

  @SerializedName("executedQty")
  private Float executedQty = null;

  @SerializedName("cummulativeQuoteQty")
  private Float cummulativeQuoteQty = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("timeInForce")
  private String timeInForce = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("stopPrice")
  private Float stopPrice = null;

  @SerializedName("icebergQty")
  private Float icebergQty = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("updateTime")
  private Integer updateTime = null;

  @SerializedName("isWorking")
  private Boolean isWorking = null;

  @SerializedName("origQuoteOrderQty")
  private Float origQuoteOrderQty = null;

  public OrderDetails symbol(String symbol) {
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

  public OrderDetails origClientOrderId(String origClientOrderId) {
    this.origClientOrderId = origClientOrderId;
    return this;
  }

   /**
   * Get origClientOrderId
   * @return origClientOrderId
  **/
  @Schema(example = "msXkySR3u5uYwpvRMFsi3u", description = "")
  public String getOrigClientOrderId() {
    return origClientOrderId;
  }

  public void setOrigClientOrderId(String origClientOrderId) {
    this.origClientOrderId = origClientOrderId;
  }

  public OrderDetails orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(example = "28", description = "")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public OrderDetails orderListId(Integer orderListId) {
    this.orderListId = orderListId;
    return this;
  }

   /**
   * Unless OCO, value will be -1
   * @return orderListId
  **/
  @Schema(example = "-1", description = "Unless OCO, value will be -1")
  public Integer getOrderListId() {
    return orderListId;
  }

  public void setOrderListId(Integer orderListId) {
    this.orderListId = orderListId;
  }

  public OrderDetails price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(example = "1.00000000", description = "")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public OrderDetails origQty(Float origQty) {
    this.origQty = origQty;
    return this;
  }

   /**
   * Get origQty
   * @return origQty
  **/
  @Schema(example = "10.00000000", description = "")
  public Float getOrigQty() {
    return origQty;
  }

  public void setOrigQty(Float origQty) {
    this.origQty = origQty;
  }

  public OrderDetails executedQty(Float executedQty) {
    this.executedQty = executedQty;
    return this;
  }

   /**
   * Get executedQty
   * @return executedQty
  **/
  @Schema(example = "10.00000000", description = "")
  public Float getExecutedQty() {
    return executedQty;
  }

  public void setExecutedQty(Float executedQty) {
    this.executedQty = executedQty;
  }

  public OrderDetails cummulativeQuoteQty(Float cummulativeQuoteQty) {
    this.cummulativeQuoteQty = cummulativeQuoteQty;
    return this;
  }

   /**
   * Get cummulativeQuoteQty
   * @return cummulativeQuoteQty
  **/
  @Schema(example = "10.00000000", description = "")
  public Float getCummulativeQuoteQty() {
    return cummulativeQuoteQty;
  }

  public void setCummulativeQuoteQty(Float cummulativeQuoteQty) {
    this.cummulativeQuoteQty = cummulativeQuoteQty;
  }

  public OrderDetails status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(example = "FILLED", description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrderDetails timeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @Schema(example = "GTC", description = "")
  public String getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  public OrderDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(example = "LIMIT", description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderDetails side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @Schema(example = "SELL", description = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public OrderDetails stopPrice(Float stopPrice) {
    this.stopPrice = stopPrice;
    return this;
  }

   /**
   * Get stopPrice
   * @return stopPrice
  **/
  @Schema(example = "10.00000000", description = "")
  public Float getStopPrice() {
    return stopPrice;
  }

  public void setStopPrice(Float stopPrice) {
    this.stopPrice = stopPrice;
  }

  public OrderDetails icebergQty(Float icebergQty) {
    this.icebergQty = icebergQty;
    return this;
  }

   /**
   * Get icebergQty
   * @return icebergQty
  **/
  @Schema(example = "0E-8", description = "")
  public Float getIcebergQty() {
    return icebergQty;
  }

  public void setIcebergQty(Float icebergQty) {
    this.icebergQty = icebergQty;
  }

  public OrderDetails time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(example = "1507725176595", description = "")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public OrderDetails updateTime(Integer updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(example = "1507725176595", description = "")
  public Integer getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }

  public OrderDetails isWorking(Boolean isWorking) {
    this.isWorking = isWorking;
    return this;
  }

   /**
   * Get isWorking
   * @return isWorking
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsWorking() {
    return isWorking;
  }

  public void setIsWorking(Boolean isWorking) {
    this.isWorking = isWorking;
  }

  public OrderDetails origQuoteOrderQty(Float origQuoteOrderQty) {
    this.origQuoteOrderQty = origQuoteOrderQty;
    return this;
  }

   /**
   * Get origQuoteOrderQty
   * @return origQuoteOrderQty
  **/
  @Schema(example = "0E-8", description = "")
  public Float getOrigQuoteOrderQty() {
    return origQuoteOrderQty;
  }

  public void setOrigQuoteOrderQty(Float origQuoteOrderQty) {
    this.origQuoteOrderQty = origQuoteOrderQty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetails orderDetails = (OrderDetails) o;
    return Objects.equals(this.symbol, orderDetails.symbol) &&
        Objects.equals(this.origClientOrderId, orderDetails.origClientOrderId) &&
        Objects.equals(this.orderId, orderDetails.orderId) &&
        Objects.equals(this.orderListId, orderDetails.orderListId) &&
        Objects.equals(this.price, orderDetails.price) &&
        Objects.equals(this.origQty, orderDetails.origQty) &&
        Objects.equals(this.executedQty, orderDetails.executedQty) &&
        Objects.equals(this.cummulativeQuoteQty, orderDetails.cummulativeQuoteQty) &&
        Objects.equals(this.status, orderDetails.status) &&
        Objects.equals(this.timeInForce, orderDetails.timeInForce) &&
        Objects.equals(this.type, orderDetails.type) &&
        Objects.equals(this.side, orderDetails.side) &&
        Objects.equals(this.stopPrice, orderDetails.stopPrice) &&
        Objects.equals(this.icebergQty, orderDetails.icebergQty) &&
        Objects.equals(this.time, orderDetails.time) &&
        Objects.equals(this.updateTime, orderDetails.updateTime) &&
        Objects.equals(this.isWorking, orderDetails.isWorking) &&
        Objects.equals(this.origQuoteOrderQty, orderDetails.origQuoteOrderQty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, origClientOrderId, orderId, orderListId, price, origQty, executedQty, cummulativeQuoteQty, status, timeInForce, type, side, stopPrice, icebergQty, time, updateTime, isWorking, origQuoteOrderQty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetails {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    origClientOrderId: ").append(toIndentedString(origClientOrderId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderListId: ").append(toIndentedString(orderListId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    origQty: ").append(toIndentedString(origQty)).append("\n");
    sb.append("    executedQty: ").append(toIndentedString(executedQty)).append("\n");
    sb.append("    cummulativeQuoteQty: ").append(toIndentedString(cummulativeQuoteQty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    stopPrice: ").append(toIndentedString(stopPrice)).append("\n");
    sb.append("    icebergQty: ").append(toIndentedString(icebergQty)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    isWorking: ").append(toIndentedString(isWorking)).append("\n");
    sb.append("    origQuoteOrderQty: ").append(toIndentedString(origQuoteOrderQty)).append("\n");
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
