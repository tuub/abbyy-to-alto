//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.18 at 01:41:32 PM CEST 
//


package org.mycore.xml.abbyy.v10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TableRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cell" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="text" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="colSpan" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *                 &lt;attribute name="rowSpan" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *                 &lt;attribute name="align" default="Top">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Top"/>
 *                       &lt;enumeration value="Center"/>
 *                       &lt;enumeration value="Bottom"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="picture" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="leftBorder" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableCellBorderType" default="Black" />
 *                 &lt;attribute name="topBorder" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableCellBorderType" default="Black" />
 *                 &lt;attribute name="rightBorder" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableCellBorderType" default="Black" />
 *                 &lt;attribute name="bottomBorder" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableCellBorderType" default="Black" />
 *                 &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableRowType", propOrder = {
    "cell"
})
public class TableRowType {

    protected List<TableRowType.Cell> cell;

    /**
     * Gets the value of the cell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableRowType.Cell }
     * 
     * 
     */
    public List<TableRowType.Cell> getCell() {
        if (cell == null) {
            cell = new ArrayList<TableRowType.Cell>();
        }
        return this.cell;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="text" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TextType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="colSpan" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
     *       &lt;attribute name="rowSpan" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
     *       &lt;attribute name="align" default="Top">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Top"/>
     *             &lt;enumeration value="Center"/>
     *             &lt;enumeration value="Bottom"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="picture" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="leftBorder" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableCellBorderType" default="Black" />
     *       &lt;attribute name="topBorder" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableCellBorderType" default="Black" />
     *       &lt;attribute name="rightBorder" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableCellBorderType" default="Black" />
     *       &lt;attribute name="bottomBorder" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableCellBorderType" default="Black" />
     *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class Cell {

        protected List<TextType> text;
        @XmlAttribute(name = "colSpan")
        protected BigInteger colSpan;
        @XmlAttribute(name = "rowSpan")
        protected BigInteger rowSpan;
        @XmlAttribute(name = "align")
        protected String align;
        @XmlAttribute(name = "picture")
        protected Boolean picture;
        @XmlAttribute(name = "leftBorder")
        protected TableCellBorderType leftBorder;
        @XmlAttribute(name = "topBorder")
        protected TableCellBorderType topBorder;
        @XmlAttribute(name = "rightBorder")
        protected TableCellBorderType rightBorder;
        @XmlAttribute(name = "bottomBorder")
        protected TableCellBorderType bottomBorder;
        @XmlAttribute(name = "width", required = true)
        protected BigInteger width;
        @XmlAttribute(name = "height", required = true)
        protected BigInteger height;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TextType }
         * 
         * 
         */
        public List<TextType> getText() {
            if (text == null) {
                text = new ArrayList<TextType>();
            }
            return this.text;
        }

        /**
         * Gets the value of the colSpan property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getColSpan() {
            if (colSpan == null) {
                return new BigInteger("1");
            } else {
                return colSpan;
            }
        }

        /**
         * Sets the value of the colSpan property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setColSpan(BigInteger value) {
            this.colSpan = value;
        }

        /**
         * Gets the value of the rowSpan property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRowSpan() {
            if (rowSpan == null) {
                return new BigInteger("1");
            } else {
                return rowSpan;
            }
        }

        /**
         * Sets the value of the rowSpan property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRowSpan(BigInteger value) {
            this.rowSpan = value;
        }

        /**
         * Gets the value of the align property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlign() {
            if (align == null) {
                return "Top";
            } else {
                return align;
            }
        }

        /**
         * Sets the value of the align property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlign(String value) {
            this.align = value;
        }

        /**
         * Gets the value of the picture property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isPicture() {
            if (picture == null) {
                return false;
            } else {
                return picture;
            }
        }

        /**
         * Sets the value of the picture property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPicture(Boolean value) {
            this.picture = value;
        }

        /**
         * Gets the value of the leftBorder property.
         * 
         * @return
         *     possible object is
         *     {@link TableCellBorderType }
         *     
         */
        public TableCellBorderType getLeftBorder() {
            if (leftBorder == null) {
                return TableCellBorderType.BLACK;
            } else {
                return leftBorder;
            }
        }

        /**
         * Sets the value of the leftBorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link TableCellBorderType }
         *     
         */
        public void setLeftBorder(TableCellBorderType value) {
            this.leftBorder = value;
        }

        /**
         * Gets the value of the topBorder property.
         * 
         * @return
         *     possible object is
         *     {@link TableCellBorderType }
         *     
         */
        public TableCellBorderType getTopBorder() {
            if (topBorder == null) {
                return TableCellBorderType.BLACK;
            } else {
                return topBorder;
            }
        }

        /**
         * Sets the value of the topBorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link TableCellBorderType }
         *     
         */
        public void setTopBorder(TableCellBorderType value) {
            this.topBorder = value;
        }

        /**
         * Gets the value of the rightBorder property.
         * 
         * @return
         *     possible object is
         *     {@link TableCellBorderType }
         *     
         */
        public TableCellBorderType getRightBorder() {
            if (rightBorder == null) {
                return TableCellBorderType.BLACK;
            } else {
                return rightBorder;
            }
        }

        /**
         * Sets the value of the rightBorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link TableCellBorderType }
         *     
         */
        public void setRightBorder(TableCellBorderType value) {
            this.rightBorder = value;
        }

        /**
         * Gets the value of the bottomBorder property.
         * 
         * @return
         *     possible object is
         *     {@link TableCellBorderType }
         *     
         */
        public TableCellBorderType getBottomBorder() {
            if (bottomBorder == null) {
                return TableCellBorderType.BLACK;
            } else {
                return bottomBorder;
            }
        }

        /**
         * Sets the value of the bottomBorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link TableCellBorderType }
         *     
         */
        public void setBottomBorder(TableCellBorderType value) {
            this.bottomBorder = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWidth(BigInteger value) {
            this.width = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHeight(BigInteger value) {
            this.height = value;
        }

    }

}
