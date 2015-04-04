//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.26 at 10:14:53 AM PDT 
//


package parsers.medline;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "AbstractText")
public class AbstractText {

    @XmlAttribute(name = "Label")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String label;
    @XmlAttribute(name = "NlmCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nlmCategory;
    @XmlValue
    protected String value;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the nlmCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlmCategory() {
        return nlmCategory;
    }

    /**
     * Sets the value of the nlmCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlmCategory(String value) {
        this.nlmCategory = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getvalue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setvalue(String value) {
        this.value = value;
    }

}
