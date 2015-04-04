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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}count" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fig-count" minOccurs="0"/>
 *         &lt;element ref="{}table-count" minOccurs="0"/>
 *         &lt;element ref="{}equation-count" minOccurs="0"/>
 *         &lt;element ref="{}ref-count" minOccurs="0"/>
 *         &lt;element ref="{}page-count" minOccurs="0"/>
 *         &lt;element ref="{}word-count" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "count",
    "figCount",
    "tableCount",
    "equationCount",
    "refCount",
    "pageCount",
    "wordCount"
})
@XmlRootElement(name = "counts")
public class Counts {

    protected List<Count> count;
    @XmlElement(name = "fig-count")
    protected FigCount figCount;
    @XmlElement(name = "table-count")
    protected TableCount tableCount;
    @XmlElement(name = "equation-count")
    protected EquationCount equationCount;
    @XmlElement(name = "ref-count")
    protected RefCount refCount;
    @XmlElement(name = "page-count")
    protected PageCount pageCount;
    @XmlElement(name = "word-count")
    protected WordCount wordCount;

    /**
     * Gets the value of the count property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the count property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Count }
     * 
     * 
     */
    public List<Count> getCount() {
        if (count == null) {
            count = new ArrayList<Count>();
        }
        return this.count;
    }

    /**
     * Gets the value of the figCount property.
     * 
     * @return
     *     possible object is
     *     {@link FigCount }
     *     
     */
    public FigCount getFigCount() {
        return figCount;
    }

    /**
     * Sets the value of the figCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FigCount }
     *     
     */
    public void setFigCount(FigCount value) {
        this.figCount = value;
    }

    /**
     * Gets the value of the tableCount property.
     * 
     * @return
     *     possible object is
     *     {@link TableCount }
     *     
     */
    public TableCount getTableCount() {
        return tableCount;
    }

    /**
     * Sets the value of the tableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableCount }
     *     
     */
    public void setTableCount(TableCount value) {
        this.tableCount = value;
    }

    /**
     * Gets the value of the equationCount property.
     * 
     * @return
     *     possible object is
     *     {@link EquationCount }
     *     
     */
    public EquationCount getEquationCount() {
        return equationCount;
    }

    /**
     * Sets the value of the equationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquationCount }
     *     
     */
    public void setEquationCount(EquationCount value) {
        this.equationCount = value;
    }

    /**
     * Gets the value of the refCount property.
     * 
     * @return
     *     possible object is
     *     {@link RefCount }
     *     
     */
    public RefCount getRefCount() {
        return refCount;
    }

    /**
     * Sets the value of the refCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefCount }
     *     
     */
    public void setRefCount(RefCount value) {
        this.refCount = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link PageCount }
     *     
     */
    public PageCount getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageCount }
     *     
     */
    public void setPageCount(PageCount value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link WordCount }
     *     
     */
    public WordCount getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordCount }
     *     
     */
    public void setWordCount(WordCount value) {
        this.wordCount = value;
    }

}