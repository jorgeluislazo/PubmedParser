//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 03:33:43 PM PDT 
//


package parsers.PMC;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
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
 *       &lt;sequence>
 *         &lt;element ref="{}object-id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element ref="{}sec-meta" minOccurs="0"/>
 *           &lt;element ref="{}label" minOccurs="0"/>
 *           &lt;element ref="{}title" minOccurs="0"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{}address"/>
 *             &lt;element ref="{}alternatives"/>
 *             &lt;element ref="{}array"/>
 *             &lt;element ref="{}boxed-text"/>
 *             &lt;element ref="{}chem-struct-wrap"/>
 *             &lt;element ref="{}fig"/>
 *             &lt;element ref="{}fig-group"/>
 *             &lt;element ref="{}graphic"/>
 *             &lt;element ref="{}media"/>
 *             &lt;element ref="{}preformat"/>
 *             &lt;element ref="{}supplementary-material"/>
 *             &lt;element ref="{}table-wrap"/>
 *             &lt;element ref="{}table-wrap-group"/>
 *             &lt;element ref="{}disp-formula"/>
 *             &lt;element ref="{}disp-formula-group"/>
 *             &lt;element ref="{}def-list"/>
 *             &lt;element ref="{}list"/>
 *             &lt;element ref="{}tex-math"/>
 *             &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *             &lt;element ref="{}p"/>
 *             &lt;element ref="{}related-article"/>
 *             &lt;element ref="{}related-object"/>
 *             &lt;element ref="{}ack"/>
 *             &lt;element ref="{}disp-quote"/>
 *             &lt;element ref="{}speech"/>
 *             &lt;element ref="{}statement"/>
 *             &lt;element ref="{}verse-group"/>
 *             &lt;element ref="{}x"/>
 *           &lt;/choice>
 *           &lt;element ref="{}sec" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{}notes"/>
 *             &lt;element ref="{}fn-group"/>
 *             &lt;element ref="{}glossary"/>
 *             &lt;element ref="{}ref-list"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="abstract-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "objectId",
    "secMeta",
    "label",
    "title",
    "addressOrAlternativesOrArray",
    "sec",
    "notesOrFnGroupOrGlossary"
})
@XmlRootElement(name = "abstract")
public class Abstract {

    @XmlElement(name = "object-id")
    protected java.util.List<ObjectId> objectId;
    @XmlElement(name = "sec-meta")
    protected SecMeta secMeta;
    protected Label label;
    protected Title title;
    @XmlElements({
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "alternatives", type = Alternatives.class),
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "boxed-text", type = BoxedText.class),
        @XmlElement(name = "chem-struct-wrap", type = ChemStructWrap.class),
        @XmlElement(name = "fig", type = Fig.class),
        @XmlElement(name = "fig-group", type = FigGroup.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "preformat", type = Preformat.class),
        @XmlElement(name = "supplementary-material", type = SupplementaryMaterial.class),
        @XmlElement(name = "table-wrap", type = TableWrap.class),
        @XmlElement(name = "table-wrap-group", type = TableWrapGroup.class),
        @XmlElement(name = "disp-formula", type = DispFormula.class),
        @XmlElement(name = "disp-formula-group", type = DispFormulaGroup.class),
        @XmlElement(name = "def-list", type = DefList.class),
        @XmlElement(name = "list", type = parsers.PMC.List.class),
        @XmlElement(name = "tex-math", type = TexMath.class),
        @XmlElement(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = MathType.class),
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "related-article", type = RelatedArticle.class),
        @XmlElement(name = "related-object", type = RelatedObject.class),
        @XmlElement(name = "ack", type = Ack.class),
        @XmlElement(name = "disp-quote", type = DispQuote.class),
        @XmlElement(name = "speech", type = Speech.class),
        @XmlElement(name = "statement", type = Statement.class),
        @XmlElement(name = "verse-group", type = VerseGroup.class),
        @XmlElement(name = "x", type = X.class)
    })
    protected java.util.List<Object> addressOrAlternativesOrArray;
    protected java.util.List<Sec> sec;
    @XmlElements({
        @XmlElement(name = "notes", type = Notes.class),
        @XmlElement(name = "fn-group", type = FnGroup.class),
        @XmlElement(name = "glossary", type = Glossary.class),
        @XmlElement(name = "ref-list", type = RefList.class)
    })
    protected java.util.List<Object> notesOrFnGroupOrGlossary;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "abstract-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String abstractType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

    /**
     * Gets the value of the objectId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectId }
     * 
     * 
     */
    public java.util.List<ObjectId> getObjectId() {
        if (objectId == null) {
            objectId = new ArrayList<ObjectId>();
        }
        return this.objectId;
    }

    /**
     * Gets the value of the secMeta property.
     * 
     * @return
     *     possible object is
     *     {@link SecMeta }
     *     
     */
    public SecMeta getSecMeta() {
        return secMeta;
    }

    /**
     * Sets the value of the secMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecMeta }
     *     
     */
    public void setSecMeta(SecMeta value) {
        this.secMeta = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the addressOrAlternativesOrArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressOrAlternativesOrArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressOrAlternativesOrArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * {@link Alternatives }
     * {@link Array }
     * {@link BoxedText }
     * {@link ChemStructWrap }
     * {@link Fig }
     * {@link FigGroup }
     * {@link Graphic }
     * {@link Media }
     * {@link Preformat }
     * {@link SupplementaryMaterial }
     * {@link TableWrap }
     * {@link TableWrapGroup }
     * {@link DispFormula }
     * {@link DispFormulaGroup }
     * {@link DefList }
     * {@link parsers.PMC.List }
     * {@link TexMath }
     * {@link MathType }
     * {@link P }
     * {@link RelatedArticle }
     * {@link RelatedObject }
     * {@link Ack }
     * {@link DispQuote }
     * {@link Speech }
     * {@link Statement }
     * {@link VerseGroup }
     * {@link X }
     * 
     * 
     */
    public java.util.List<Object> getAddressOrAlternativesOrArray() {
        if (addressOrAlternativesOrArray == null) {
            addressOrAlternativesOrArray = new ArrayList<Object>();
        }
        return this.addressOrAlternativesOrArray;
    }

    /**
     * Gets the value of the sec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sec }
     * 
     * 
     */
    public java.util.List<Sec> getSec() {
        if (sec == null) {
            sec = new ArrayList<Sec>();
        }
        return this.sec;
    }

    /**
     * Gets the value of the notesOrFnGroupOrGlossary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesOrFnGroupOrGlossary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesOrFnGroupOrGlossary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notes }
     * {@link FnGroup }
     * {@link Glossary }
     * {@link RefList }
     * 
     * 
     */
    public java.util.List<Object> getNotesOrFnGroupOrGlossary() {
        if (notesOrFnGroupOrGlossary == null) {
            notesOrFnGroupOrGlossary = new ArrayList<Object>();
        }
        return this.notesOrFnGroupOrGlossary;
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
     * Gets the value of the abstractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstractType() {
        return abstractType;
    }

    /**
     * Sets the value of the abstractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstractType(String value) {
        this.abstractType = value;
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
