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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}title" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}ack"/>
 *           &lt;element ref="{}app-group"/>
 *           &lt;element ref="{}bio"/>
 *           &lt;element ref="{}fn-group"/>
 *           &lt;element ref="{}glossary"/>
 *           &lt;element ref="{}ref-list"/>
 *           &lt;element ref="{}notes"/>
 *           &lt;element ref="{}sec"/>
 *         &lt;/choice>
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
    "label",
    "title",
    "ackOrAppGroupOrBio"
})
@XmlRootElement(name = "back")
public class Back {

    protected Label label;
    protected List<Title> title;
    @XmlElements({
        @XmlElement(name = "ack", type = Ack.class),
        @XmlElement(name = "app-group", type = AppGroup.class),
        @XmlElement(name = "bio", type = Bio.class),
        @XmlElement(name = "fn-group", type = FnGroup.class),
        @XmlElement(name = "glossary", type = Glossary.class),
        @XmlElement(name = "ref-list", type = RefList.class),
        @XmlElement(name = "notes", type = Notes.class),
        @XmlElement(name = "sec", type = Sec.class)
    })
    protected List<Object> ackOrAppGroupOrBio;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * 
     * 
     */
    public List<Title> getTitle() {
        if (title == null) {
            title = new ArrayList<Title>();
        }
        return this.title;
    }

    /**
     * Gets the value of the ackOrAppGroupOrBio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ackOrAppGroupOrBio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAckOrAppGroupOrBio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ack }
     * {@link AppGroup }
     * {@link Bio }
     * {@link FnGroup }
     * {@link Glossary }
     * {@link RefList }
     * {@link Notes }
     * {@link Sec }
     * 
     * 
     */
    public List<Object> getAckOrAppGroupOrBio() {
        if (ackOrAppGroupOrBio == null) {
            ackOrAppGroupOrBio = new ArrayList<Object>();
        }
        return this.ackOrAppGroupOrBio;
    }

}
