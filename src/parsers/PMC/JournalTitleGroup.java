//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 03:33:43 PM PDT 
//


package parsers.PMC;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}journal-title" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}journal-subtitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}trans-title-group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}abbrev-journal-title" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalTitle",
    "journalSubtitle",
    "transTitleGroup",
    "abbrevJournalTitle"
})
@XmlRootElement(name = "journal-title-group")
public class JournalTitleGroup {

    @XmlElement(name = "journal-title")
    protected List<JournalTitle> journalTitle;
    @XmlElement(name = "journal-subtitle")
    protected List<JournalSubtitle> journalSubtitle;
    @XmlElement(name = "trans-title-group")
    protected List<TransTitleGroup> transTitleGroup;
    @XmlElement(name = "abbrev-journal-title")
    protected List<AbbrevJournalTitle> abbrevJournalTitle;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;

    /**
     * Gets the value of the journalTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalTitle }
     * 
     * 
     */
    public List<JournalTitle> getJournalTitle() {
        if (journalTitle == null) {
            journalTitle = new ArrayList<JournalTitle>();
        }
        return this.journalTitle;
    }

    /**
     * Gets the value of the journalSubtitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalSubtitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalSubtitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalSubtitle }
     * 
     * 
     */
    public List<JournalSubtitle> getJournalSubtitle() {
        if (journalSubtitle == null) {
            journalSubtitle = new ArrayList<JournalSubtitle>();
        }
        return this.journalSubtitle;
    }

    /**
     * Gets the value of the transTitleGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transTitleGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransTitleGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransTitleGroup }
     * 
     * 
     */
    public List<TransTitleGroup> getTransTitleGroup() {
        if (transTitleGroup == null) {
            transTitleGroup = new ArrayList<TransTitleGroup>();
        }
        return this.transTitleGroup;
    }

    /**
     * Gets the value of the abbrevJournalTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbrevJournalTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbrevJournalTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbbrevJournalTitle }
     * 
     * 
     */
    public List<AbbrevJournalTitle> getAbbrevJournalTitle() {
        if (abbrevJournalTitle == null) {
            abbrevJournalTitle = new ArrayList<AbbrevJournalTitle>();
        }
        return this.abbrevJournalTitle;
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

}
