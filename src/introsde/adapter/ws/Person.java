
package introsde.adapter.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per person complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auth_secret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auth_token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "authSecret",
    "authToken"
})
public class Person {

    @XmlElement(name = "auth_secret")
    protected String authSecret;
    @XmlElement(name = "auth_token")
    protected String authToken;

    /**
     * Recupera il valore della proprietà authSecret.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSecret() {
        return authSecret;
    }

    /**
     * Imposta il valore della proprietà authSecret.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSecret(String value) {
        this.authSecret = value;
    }

    /**
     * Recupera il valore della proprietà authToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Imposta il valore della proprietà authToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

}
