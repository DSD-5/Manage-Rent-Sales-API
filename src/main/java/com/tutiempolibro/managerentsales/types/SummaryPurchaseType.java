package com.tutiempolibro.managerentsales.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SummaryPurchaseType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-03T12:20:16.232-05:00")

public class SummaryPurchaseType {
    @JsonProperty("fecha")
    private String fecha = null;

    @JsonProperty("total")
    private Double total = null;

    @JsonProperty("estado")
    private String estado = null;

    @JsonProperty("direction")
    private String direction = null;

    @JsonProperty("reference")
    private String reference = null;

    @JsonProperty("departamento")
    private String departamento = null;

    @JsonProperty("province")
    private String province = null;

    @JsonProperty("district")
    private String district = null;

    @JsonProperty("delivery")
    private Double delivery = null;

    @JsonProperty("descuentoventa")
    private String descuentoventa = null;

    @JsonProperty("descuentoalquiler")
    private String descuentoalquiler = null;

    @JsonProperty("totaldescventa")
    private Double totaldescventa = null;

    @JsonProperty("totaldescalquier")
    private Double totaldescalquier = null;

    @JsonProperty("codventa")
    private String codventa = null;

    @JsonProperty("codalquiler")
    private String codalquiler = null;

    @JsonProperty("subtotalventa")
    private Double subtotalventa = null;

    @JsonProperty("subtotalalquiler")
    private Double subtotalalquiler = null;

    @JsonProperty("PurchaseDetailType")
    @Valid
    private List<PurchaseDetailRefType> purchaseDetailType = new ArrayList<PurchaseDetailRefType>();

    public SummaryPurchaseType fecha(String fecha) {
	this.fecha = fecha;
	return this;
    }

    /**
     * date of purchase
     * 
     * @return fecha
     **/
    @ApiModelProperty(required = true, value = "date of purchase")
    @NotNull

    public String getFecha() {
	return fecha;
    }

    public void setFecha(String fecha) {
	this.fecha = fecha;
    }

    public SummaryPurchaseType total(Double total) {
	this.total = total;
	return this;
    }

    /**
     * total purchase cost
     * 
     * @return total
     **/
    @ApiModelProperty(required = true, value = "total purchase cost")
    @NotNull

    @Valid

    public Double getTotal() {
	return total;
    }

    public void setTotal(Double total) {
	this.total = total;
    }

    public SummaryPurchaseType estado(String estado) {
	this.estado = estado;
	return this;
    }

    /**
     * State Purchase
     * 
     * @return estado
     **/
    @ApiModelProperty(required = true, value = "State Purchase")
    @NotNull

    public String getEstado() {
	return estado;
    }

    public void setEstado(String estado) {
	this.estado = estado;
    }

    public SummaryPurchaseType direction(String direction) {
	this.direction = direction;
	return this;
    }

    /**
     * direction purchase
     * 
     * @return direction
     **/
    @ApiModelProperty(required = true, value = "direction purchase")
    @NotNull

    public String getDirection() {
	return direction;
    }

    public void setDirection(String direction) {
	this.direction = direction;
    }

    public SummaryPurchaseType reference(String reference) {
	this.reference = reference;
	return this;
    }

    /**
     * direction reference
     * 
     * @return reference
     **/
    @ApiModelProperty(required = true, value = "direction reference")
    @NotNull

    public String getReference() {
	return reference;
    }

    public void setReference(String reference) {
	this.reference = reference;
    }

    public SummaryPurchaseType departamento(String departamento) {
	this.departamento = departamento;
	return this;
    }

    /**
     * Department
     * 
     * @return departamento
     **/
    @ApiModelProperty(value = "Department")

    public String getDepartamento() {
	return departamento;
    }

    public void setDepartamento(String departamento) {
	this.departamento = departamento;
    }

    public SummaryPurchaseType province(String province) {
	this.province = province;
	return this;
    }

    /**
     * province
     * 
     * @return province
     **/
    @ApiModelProperty(required = true, value = "province")
    @NotNull

    public String getProvince() {
	return province;
    }

    public void setProvince(String province) {
	this.province = province;
    }

    public SummaryPurchaseType district(String district) {
	this.district = district;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "district")
    @NotNull

    public String getDistrict() {
	return district;
    }

    public void setDistrict(String district) {
	this.district = district;
    }

    public SummaryPurchaseType delivery(Double delivery) {
	this.delivery = delivery;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "delivery")
    @NotNull

    public Double getDelivery() {
	return delivery;
    }

    public void setDelivery(Double delivery) {
	this.delivery = delivery;
    }

    public SummaryPurchaseType descuentoventa(String descuentoventa) {
	this.descuentoventa = descuentoventa;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "descuentoventa")
    @NotNull

    public String getDescuentoventa() {
	return descuentoventa;
    }

    public void setDescuentoventa(String descuentoventa) {
	this.descuentoventa = descuentoventa;
    }

    public SummaryPurchaseType descuentoalquiler(String descuentoalquiler) {
	this.descuentoalquiler = descuentoalquiler;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "descuentoalquiler")
    @NotNull

    public String getDescuentoalquiler() {
	return descuentoalquiler;
    }

    public void setDescuentoalquiler(String descuentoalquiler) {
	this.descuentoalquiler = descuentoalquiler;
    }

    public SummaryPurchaseType totaldescventa(Double totaldescventa) {
	this.totaldescventa = totaldescventa;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "totaldescventa")
    @NotNull

    public Double getTotaldescventa() {
	return totaldescventa;
    }

    public void setTotaldescventa(Double totaldescventa) {
	this.totaldescventa = totaldescventa;
    }

    public SummaryPurchaseType totaldescalquier(Double totaldescalquiler) {
	this.totaldescalquier = totaldescalquiler;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "totaldescventa")
    @NotNull

    public Double getTotaldescalquier() {
	return totaldescalquier;
    }

    public void setTotaldescalquier(Double totaldescalquier) {
	this.totaldescalquier = totaldescalquier;
    }

    public SummaryPurchaseType codventa(String codventa) {
	this.codventa = codventa;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "codventa")
    @NotNull

    public String getCodventa() {
	return codventa;
    }

    public void setCodventa(String codventa) {
	this.codventa = codventa;
    }

    public SummaryPurchaseType codalquiler(String codalquiler) {
	this.codalquiler = codalquiler;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "codalquiler")
    @NotNull

    public String getCodalquiler() {
	return codalquiler;
    }

    public void setCodalquiler(String codalquiler) {
	this.codalquiler = codalquiler;
    }

    public SummaryPurchaseType subtotalventa(Double subtotalventa) {
	this.subtotalventa = subtotalventa;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "subtotalventa")
    @NotNull

    public Double getSubtotalventa() {
	return subtotalventa;
    }

    public void setSubtotalventa(Double subtotalventa) {
	this.subtotalventa = subtotalventa;
    }

    public SummaryPurchaseType subtotalalquiler(Double subtotalalquiler) {
	this.subtotalalquiler = subtotalalquiler;
	return this;
    }

    /**
     * district
     * 
     * @return district
     **/
    @ApiModelProperty(required = true, value = "subtotalalquiler")
    @NotNull

    public Double getSubtotalalquiler() {
	return subtotalalquiler;
    }

    public void setSubtotalalquiler(Double subtotalalquiler) {
	this.subtotalalquiler = subtotalalquiler;
    }

    public SummaryPurchaseType purchaseDetailType(List<PurchaseDetailRefType> purchaseDetailType) {
	this.purchaseDetailType = purchaseDetailType;
	return this;
    }

    public SummaryPurchaseType addPurchaseDetailTypeItem(PurchaseDetailRefType purchaseDetailTypeItem) {
	this.purchaseDetailType.add(purchaseDetailTypeItem);
	return this;
    }

    /**
     * List of items associated to the order
     * 
     * @return purchaseDetailType
     **/
    @ApiModelProperty(required = true, value = "List of items associated to the order")
    @NotNull

    @Valid
    @Size(min = 0)
    public List<PurchaseDetailRefType> getPurchaseDetailType() {
	return purchaseDetailType;
    }

    public void setPurchaseDetailType(List<PurchaseDetailRefType> purchaseDetailType) {
	this.purchaseDetailType = purchaseDetailType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
	if (this == o) {
	    return true;
	}
	if (o == null || getClass() != o.getClass()) {
	    return false;
	}
	SummaryPurchaseType summaryPurchaseType = (SummaryPurchaseType) o;
	return Objects.equals(this.fecha, summaryPurchaseType.fecha) && Objects.equals(this.total, summaryPurchaseType.total)
		&& Objects.equals(this.estado, summaryPurchaseType.estado) && Objects.equals(this.direction, summaryPurchaseType.direction)
		&& Objects.equals(this.reference, summaryPurchaseType.reference)
		&& Objects.equals(this.departamento, summaryPurchaseType.departamento)
		&& Objects.equals(this.province, summaryPurchaseType.province)
		&& Objects.equals(this.district, summaryPurchaseType.district)
		&& Objects.equals(this.purchaseDetailType, summaryPurchaseType.purchaseDetailType);
    }

    @Override
    public int hashCode() {
	return Objects.hash(fecha, total, estado, direction, reference, departamento, province, district, purchaseDetailType);
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("class SummaryPurchaseType {\n");

	sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
	sb.append("    total: ").append(toIndentedString(total)).append("\n");
	sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
	sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
	sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
	sb.append("    departamento: ").append(toIndentedString(departamento)).append("\n");
	sb.append("    province: ").append(toIndentedString(province)).append("\n");
	sb.append("    district: ").append(toIndentedString(district)).append("\n");
	sb.append("    purchaseDetailType: ").append(toIndentedString(purchaseDetailType)).append("\n");
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
