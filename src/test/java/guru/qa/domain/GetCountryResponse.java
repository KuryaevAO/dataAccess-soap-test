//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.4 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.09 at 08:21:48 PM MSK 
//


package guru.qa.domain;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://spring.io/guides/gs-producing-web-service}country"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "country"
})
@XmlRootElement(name = "getCountryResponse")
public class GetCountryResponse {

    @XmlElement(required = true)
    protected io.spring.guides.gs_producing_web_service.Country country;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link io.spring.guides.gs_producing_web_service.Country }
     *     
     */
    public io.spring.guides.gs_producing_web_service.Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.spring.guides.gs_producing_web_service.Country }
     *     
     */
    public void setCountry(io.spring.guides.gs_producing_web_service.Country value) {
        this.country = value;
    }

}
