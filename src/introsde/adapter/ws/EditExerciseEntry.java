
package introsde.adapter.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per editExerciseEntry complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="editExerciseEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://ws.adapter.introsde/}person" minOccurs="0"/>
 *         &lt;element name="id_exercise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="change_sleeping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editExerciseEntry", propOrder = {
    "user",
    "idExercise",
    "minutes",
    "changeSleeping"
})
public class EditExerciseEntry {

    protected Person user;
    @XmlElement(name = "id_exercise")
    protected int idExercise;
    protected int minutes;
    @XmlElement(name = "change_sleeping")
    protected boolean changeSleeping;

    /**
     * Recupera il valore della proprietà user.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getUser() {
        return user;
    }

    /**
     * Imposta il valore della proprietà user.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setUser(Person value) {
        this.user = value;
    }

    /**
     * Recupera il valore della proprietà idExercise.
     * 
     */
    public int getIdExercise() {
        return idExercise;
    }

    /**
     * Imposta il valore della proprietà idExercise.
     * 
     */
    public void setIdExercise(int value) {
        this.idExercise = value;
    }

    /**
     * Recupera il valore della proprietà minutes.
     * 
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Imposta il valore della proprietà minutes.
     * 
     */
    public void setMinutes(int value) {
        this.minutes = value;
    }

    /**
     * Recupera il valore della proprietà changeSleeping.
     * 
     */
    public boolean isChangeSleeping() {
        return changeSleeping;
    }

    /**
     * Imposta il valore della proprietà changeSleeping.
     * 
     */
    public void setChangeSleeping(boolean value) {
        this.changeSleeping = value;
    }

}
