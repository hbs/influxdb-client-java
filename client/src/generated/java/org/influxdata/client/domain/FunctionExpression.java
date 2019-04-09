/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.influxdata.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.influxdata.client.domain.Node;
import org.influxdata.client.domain.Property;

/**
 * function expression
 */
@ApiModel(description = "function expression")

public class FunctionExpression extends Expression {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<Property> params = new ArrayList<>();

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  @JsonAdapter(FunctionExpressionBodyAdapter.class)
  private Node body = null;

  public FunctionExpression type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FunctionExpression params(List<Property> params) {
    this.params = params;
    return this;
  }

  public FunctionExpression addParamsItem(Property paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * function parameters
   * @return params
  **/
  @ApiModelProperty(value = "function parameters")
  public List<Property> getParams() {
    return params;
  }

  public void setParams(List<Property> params) {
    this.params = params;
  }

  public FunctionExpression body(Node body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public Node getBody() {
    return body;
  }

  public void setBody(Node body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunctionExpression functionExpression = (FunctionExpression) o;
    return Objects.equals(this.type, functionExpression.type) &&
        Objects.equals(this.params, functionExpression.params) &&
        Objects.equals(this.body, functionExpression.body) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, params, body, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionExpression {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

  public class FunctionExpressionBodyAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {
    private final String discriminator = "type";

    public FunctionExpressionBodyAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      JsonObject jsonObject = json.getAsJsonObject();

      String type = jsonObject.get(discriminator).getAsString();

      return deserialize(type, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String type, final JsonElement json, final JsonDeserializationContext context) {

      if ("ArrayExpression".equals(type)) {
        return context.deserialize(json, ArrayExpression.class);
      }
      if ("FunctionExpression".equals(type)) {
        return context.deserialize(json, FunctionExpression.class);
      }
      if ("BinaryExpression".equals(type)) {
        return context.deserialize(json, BinaryExpression.class);
      }
      if ("CallExpression".equals(type)) {
        return context.deserialize(json, CallExpression.class);
      }
      if ("ConditionalExpression".equals(type)) {
        return context.deserialize(json, ConditionalExpression.class);
      }
      if ("LogicalExpression".equals(type)) {
        return context.deserialize(json, LogicalExpression.class);
      }
      if ("MemberExpression".equals(type)) {
        return context.deserialize(json, MemberExpression.class);
      }
      if ("IndexExpression".equals(type)) {
        return context.deserialize(json, IndexExpression.class);
      }
      if ("ObjectExpression".equals(type)) {
        return context.deserialize(json, ObjectExpression.class);
      }
      if ("PipeExpression".equals(type)) {
        return context.deserialize(json, PipeExpression.class);
      }
      if ("UnaryExpression".equals(type)) {
        return context.deserialize(json, UnaryExpression.class);
      }
      if ("BooleanLiteral".equals(type)) {
        return context.deserialize(json, BooleanLiteral.class);
      }
      if ("DateTimeLiteral".equals(type)) {
        return context.deserialize(json, DateTimeLiteral.class);
      }
      if ("DurationLiteral".equals(type)) {
        return context.deserialize(json, DurationLiteral.class);
      }
      if ("FloatLiteral".equals(type)) {
        return context.deserialize(json, FloatLiteral.class);
      }
      if ("IntegerLiteral".equals(type)) {
        return context.deserialize(json, IntegerLiteral.class);
      }
      if ("PipeLiteral".equals(type)) {
        return context.deserialize(json, PipeLiteral.class);
      }
      if ("RegexpLiteral".equals(type)) {
        return context.deserialize(json, RegexpLiteral.class);
      }
      if ("StringLiteral".equals(type)) {
        return context.deserialize(json, StringLiteral.class);
      }
      if ("UnsignedIntegerLiteral".equals(type)) {
        return context.deserialize(json, UnsignedIntegerLiteral.class);
      }
      if ("Identifier".equals(type)) {
        return context.deserialize(json, Identifier.class);
      }
      if ("Block".equals(type)) {
        return context.deserialize(json, Block.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
}

