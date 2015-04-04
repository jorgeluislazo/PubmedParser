//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 03:33:43 PM PDT 
//


package parsers.PMC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for mo.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mo.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1998/Math/MathML}Glyph-alignmark.class" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.w3.org/1998/Math/MathML}mo.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mo.type", namespace = "http://www.w3.org/1998/Math/MathML", propOrder = {
    "content"
})
public class MoType {

    @XmlElementRefs({
        @XmlElementRef(name = "malignmark", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mglyph", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "form")
    protected String form;
    @XmlAttribute(name = "lspace")
    protected String lspace;
    @XmlAttribute(name = "rspace")
    protected String rspace;
    @XmlAttribute(name = "fence")
    protected Boolean fence;
    @XmlAttribute(name = "separator")
    protected Boolean separator;
    @XmlAttribute(name = "stretchy")
    protected Boolean stretchy;
    @XmlAttribute(name = "symmetric")
    protected Boolean symmetric;
    @XmlAttribute(name = "movablelimits")
    protected Boolean movablelimits;
    @XmlAttribute(name = "accent")
    protected Boolean accent;
    @XmlAttribute(name = "largeop")
    protected Boolean largeop;
    @XmlAttribute(name = "minsize")
    protected String minsize;
    @XmlAttribute(name = "maxsize")
    protected String maxsize;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "xref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object xref;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAttribute(name = "mathvariant")
    protected String mathvariant;
    @XmlAttribute(name = "mathsize")
    protected String mathsize;
    @XmlAttribute(name = "mathcolor")
    protected String mathcolor;
    @XmlAttribute(name = "mathbackground")
    protected String mathbackground;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MglyphType }{@code >}
     * {@link JAXBElement }{@code <}{@link MalignmarkType }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the lspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLspace() {
        return lspace;
    }

    /**
     * Sets the value of the lspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLspace(String value) {
        this.lspace = value;
    }

    /**
     * Gets the value of the rspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspace() {
        return rspace;
    }

    /**
     * Sets the value of the rspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspace(String value) {
        this.rspace = value;
    }

    /**
     * Gets the value of the fence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFence() {
        return fence;
    }

    /**
     * Sets the value of the fence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFence(Boolean value) {
        this.fence = value;
    }

    /**
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeparator(Boolean value) {
        this.separator = value;
    }

    /**
     * Gets the value of the stretchy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStretchy() {
        return stretchy;
    }

    /**
     * Sets the value of the stretchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStretchy(Boolean value) {
        this.stretchy = value;
    }

    /**
     * Gets the value of the symmetric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSymmetric() {
        return symmetric;
    }

    /**
     * Sets the value of the symmetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSymmetric(Boolean value) {
        this.symmetric = value;
    }

    /**
     * Gets the value of the movablelimits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMovablelimits() {
        return movablelimits;
    }

    /**
     * Sets the value of the movablelimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMovablelimits(Boolean value) {
        this.movablelimits = value;
    }

    /**
     * Gets the value of the accent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccent() {
        return accent;
    }

    /**
     * Sets the value of the accent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccent(Boolean value) {
        this.accent = value;
    }

    /**
     * Gets the value of the largeop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLargeop() {
        return largeop;
    }

    /**
     * Sets the value of the largeop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLargeop(Boolean value) {
        this.largeop = value;
    }

    /**
     * Gets the value of the minsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinsize() {
        return minsize;
    }

    /**
     * Sets the value of the minsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinsize(String value) {
        this.minsize = value;
    }

    /**
     * Gets the value of the maxsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxsize() {
        return maxsize;
    }

    /**
     * Sets the value of the maxsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxsize(String value) {
        this.maxsize = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<String>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXref() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXref(Object value) {
        this.xref = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the mathvariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathvariant() {
        return mathvariant;
    }

    /**
     * Sets the value of the mathvariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathvariant(String value) {
        this.mathvariant = value;
    }

    /**
     * Gets the value of the mathsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathsize() {
        return mathsize;
    }

    /**
     * Sets the value of the mathsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathsize(String value) {
        this.mathsize = value;
    }

    /**
     * Gets the value of the mathcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathcolor() {
        return mathcolor;
    }

    /**
     * Sets the value of the mathcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathcolor(String value) {
        this.mathcolor = value;
    }

    /**
     * Gets the value of the mathbackground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathbackground() {
        return mathbackground;
    }

    /**
     * Sets the value of the mathbackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathbackground(String value) {
        this.mathbackground = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
