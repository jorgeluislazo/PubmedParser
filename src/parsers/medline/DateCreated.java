//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.26 at 10:14:53 AM PDT 
//


package parsers.medline;

import javax.xml.bind.annotation.*;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "year",
    "month",
    "day"
})
@XmlRootElement(name = "DateCreated")
public class DateCreated extends DateBase {

    @XmlElement(name = "Year", required = true)
    protected Year year;
    @XmlElement(name = "Month", required = true)
    protected Month month;
    @XmlElement(name = "Day", required = true)
    protected Day day;

    /**
     * Gets the value of the year property.
     *
     * @return
     *     possible object is
     *     {@link parsers.medline.Year }
     *
     */
    public Year getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     * @param value
     *     allowed object is
     *     {@link parsers.medline.Year }
     *
     */
    public void setYear(Year value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     *
     * @return
     *     possible object is
     *     {@link parsers.medline.Month }
     *
     */
    public Month getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     *
     * @param value
     *     allowed object is
     *     {@link parsers.medline.Month }
     *
     */
    public void setMonth(Month value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     *
     * @return
     *     possible object is
     *     {@link Day }
     *
     */
    public Day getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     *
     * @param value
     *     allowed object is
     *     {@link Day }
     *     
     */
    public void setDay(Day value) {
        this.day = value;
    }

}