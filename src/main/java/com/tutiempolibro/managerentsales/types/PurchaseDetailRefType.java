package com.tutiempolibro.managerentsales.types;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PurchaseDetailRefType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-03T13:07:06.665-05:00")




public class PurchaseDetailRefType   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("autor")
  private String autor = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("urlimage")
  private String urlimage = null;

  @JsonProperty("price")
  private String price = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("subtotal")
  private String subtotal = null;

  @JsonProperty("shoppingid")
  private String shoppingid = null;

  public PurchaseDetailRefType title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the book
   * @return title
  **/
  @ApiModelProperty(required = true, value = "title of the book")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PurchaseDetailRefType autor(String autor) {
    this.autor = autor;
    return this;
  }

  /**
   * Autor of the book
   * @return autor
  **/
  @ApiModelProperty(required = true, value = "Autor of the book")
  @NotNull


  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public PurchaseDetailRefType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of Book
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of Book")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PurchaseDetailRefType urlimage(String urlimage) {
    this.urlimage = urlimage;
    return this;
  }

  /**
   * Url Image
   * @return urlimage
  **/
  @ApiModelProperty(required = true, value = "Url Image")
  @NotNull


  public String getUrlimage() {
    return urlimage;
  }

  public void setUrlimage(String urlimage) {
    this.urlimage = urlimage;
  }

  public PurchaseDetailRefType price(String price) {
    this.price = price;
    return this;
  }

  /**
   * price Rental or Sales of the book
   * @return price
  **/
  @ApiModelProperty(required = true, value = "price Rental or Sales of the book")
  @NotNull


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public PurchaseDetailRefType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Sales or Rent
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Sales or Rent")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PurchaseDetailRefType quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Indentity of Book
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Indentity of Book")
  @NotNull


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PurchaseDetailRefType subtotal(String subtotal) {
    this.subtotal = subtotal;
    return this;
  }

  /**
   * subtotal of shipping cart
   * @return subtotal
  **/
  @ApiModelProperty(required = true, value = "subtotal of shipping cart")
  @NotNull


  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  public PurchaseDetailRefType shoppingid(String shoppingid) {
    this.shoppingid = shoppingid;
    return this;
  }

  /**
   * Shopping id value
   * @return shoppingid
  **/
  @ApiModelProperty(required = true, value = "Shopping id value")
  @NotNull


  public String getShoppingid() {
    return shoppingid;
  }

  public void setShoppingid(String shoppingid) {
    this.shoppingid = shoppingid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseDetailRefType purchaseDetailRefType = (PurchaseDetailRefType) o;
    return Objects.equals(this.title, purchaseDetailRefType.title) &&
        Objects.equals(this.autor, purchaseDetailRefType.autor) &&
        Objects.equals(this.description, purchaseDetailRefType.description) &&
        Objects.equals(this.urlimage, purchaseDetailRefType.urlimage) &&
        Objects.equals(this.price, purchaseDetailRefType.price) &&
        Objects.equals(this.type, purchaseDetailRefType.type) &&
        Objects.equals(this.quantity, purchaseDetailRefType.quantity) &&
        Objects.equals(this.subtotal, purchaseDetailRefType.subtotal) &&
        Objects.equals(this.shoppingid, purchaseDetailRefType.shoppingid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, autor, description, urlimage, price, type, quantity, subtotal, shoppingid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseDetailRefType {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    autor: ").append(toIndentedString(autor)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    urlimage: ").append(toIndentedString(urlimage)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    shoppingid: ").append(toIndentedString(shoppingid)).append("\n");
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

