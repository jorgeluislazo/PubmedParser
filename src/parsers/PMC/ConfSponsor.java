//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 03:33:43 PM PDT 
//


package parsers.PMC;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}inline-supplementary-material"/>
 *         &lt;element ref="{}related-article"/>
 *         &lt;element ref="{}related-object"/>
 *         &lt;element ref="{}hr"/>
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}overline-start"/>
 *         &lt;element ref="{}overline-end"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}underline-start"/>
 *         &lt;element ref="{}underline-end"/>
 *         &lt;element ref="{}alternatives"/>
 *         &lt;element ref="{}inline-graphic"/>
 *         &lt;element ref="{}private-char"/>
 *         &lt;element ref="{}chem-struct"/>
 *         &lt;element ref="{}inline-formula"/>
 *         &lt;element ref="{}tex-math"/>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *         &lt;element ref="{}abbrev"/>
 *         &lt;element ref="{}milestone-end"/>
 *         &lt;element ref="{}milestone-start"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}fn"/>
 *         &lt;element ref="{}target"/>
 *         &lt;element ref="{}xref"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *         &lt;element ref="{}x"/>
 *       &lt;/choice>
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "conf-sponsor")
public class ConfSponsor {

    @XmlElementRefs({
        @XmlElementRef(name = "named-content", type = NamedContent.class, required = false),
        @XmlElementRef(name = "x", type = X.class, required = false),
        @XmlElementRef(name = "xref", type = Xref.class, required = false),
        @XmlElementRef(name = "target", type = Target.class, required = false),
        @XmlElementRef(name = "roman", type = Roman.class, required = false),
        @XmlElementRef(name = "overline-start", type = OverlineStart.class, required = false),
        @XmlElementRef(name = "bold", type = Bold.class, required = false),
        @XmlElementRef(name = "strike", type = Strike.class, required = false),
        @XmlElementRef(name = "overline", type = Overline.class, required = false),
        @XmlElementRef(name = "underline-end", type = UnderlineEnd.class, required = false),
        @XmlElementRef(name = "styled-content", type = StyledContent.class, required = false),
        @XmlElementRef(name = "milestone-end", type = MilestoneEnd.class, required = false),
        @XmlElementRef(name = "sans-serif", type = SansSerif.class, required = false),
        @XmlElementRef(name = "abbrev", type = Abbrev.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "private-char", type = PrivateChar.class, required = false),
        @XmlElementRef(name = "sup", type = Sup.class, required = false),
        @XmlElementRef(name = "related-article", type = RelatedArticle.class, required = false),
        @XmlElementRef(name = "ext-link", type = ExtLink.class, required = false),
        @XmlElementRef(name = "underline", type = Underline.class, required = false),
        @XmlElementRef(name = "underline-start", type = UnderlineStart.class, required = false),
        @XmlElementRef(name = "inline-graphic", type = InlineGraphic.class, required = false),
        @XmlElementRef(name = "tex-math", type = TexMath.class, required = false),
        @XmlElementRef(name = "hr", type = Hr.class, required = false),
        @XmlElementRef(name = "monospace", type = Monospace.class, required = false),
        @XmlElementRef(name = "inline-supplementary-material", type = InlineSupplementaryMaterial.class, required = false),
        @XmlElementRef(name = "chem-struct", type = ChemStruct.class, required = false),
        @XmlElementRef(name = "related-object", type = RelatedObject.class, required = false),
        @XmlElementRef(name = "fn", type = Fn.class, required = false),
        @XmlElementRef(name = "alternatives", type = Alternatives.class, required = false),
        @XmlElementRef(name = "email", type = Email.class, required = false),
        @XmlElementRef(name = "italic", type = Italic.class, required = false),
        @XmlElementRef(name = "sc", type = Sc.class, required = false),
        @XmlElementRef(name = "inline-formula", type = InlineFormula.class, required = false),
        @XmlElementRef(name = "sub", type = Sub.class, required = false),
        @XmlElementRef(name = "milestone-start", type = MilestoneStart.class, required = false),
        @XmlElementRef(name = "overline-end", type = OverlineEnd.class, required = false),
        @XmlElementRef(name = "uri", type = Uri.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

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
     * {@link NamedContent }
     * {@link Xref }
     * {@link X }
     * {@link Target }
     * {@link String }
     * {@link Roman }
     * {@link OverlineStart }
     * {@link Bold }
     * {@link Strike }
     * {@link UnderlineEnd }
     * {@link Overline }
     * {@link StyledContent }
     * {@link SansSerif }
     * {@link MilestoneEnd }
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link Abbrev }
     * {@link PrivateChar }
     * {@link Sup }
     * {@link Underline }
     * {@link ExtLink }
     * {@link RelatedArticle }
     * {@link InlineGraphic }
     * {@link UnderlineStart }
     * {@link Hr }
     * {@link TexMath }
     * {@link ChemStruct }
     * {@link InlineSupplementaryMaterial }
     * {@link Monospace }
     * {@link RelatedObject }
     * {@link Alternatives }
     * {@link Fn }
     * {@link Email }
     * {@link Italic }
     * {@link Sc }
     * {@link InlineFormula }
     * {@link Sub }
     * {@link MilestoneStart }
     * {@link OverlineEnd }
     * {@link Uri }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
