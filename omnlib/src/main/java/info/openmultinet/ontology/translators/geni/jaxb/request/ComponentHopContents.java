//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.01 at 01:40:12 PM CEST 
//


package info.openmultinet.ontology.translators.geni.jaxb.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for ComponentHopContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentHopContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://www.geni.net/resources/rspec/3}AnyExtension"/>
 *         &lt;element ref="{http://www.geni.net/resources/rspec/3}component_manager"/>
 *         &lt;group ref="{http://www.geni.net/resources/rspec/3}InterfaceMapping"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.geni.net/resources/rspec/3}AnyExtension"/>
 *       &lt;attribute name="component_id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentHopContents", propOrder = {
    "anyOrComponentManagerOrInterfaceRef"
})
public class ComponentHopContents {

    @XmlElementRefs({
        @XmlElementRef(name = "interface_ref", namespace = "http://www.geni.net/resources/rspec/3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "component_manager", namespace = "http://www.geni.net/resources/rspec/3", type = ComponentManager.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> anyOrComponentManagerOrInterfaceRef;
    @XmlAttribute(name = "component_id")
    @XmlSchemaType(name = "anySimpleType")
    protected String componentId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the anyOrComponentManagerOrInterfaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anyOrComponentManagerOrInterfaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnyOrComponentManagerOrInterfaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link ComponentHopContents.InterfaceRef }{@code >}
     * {@link ComponentManager }
     * 
     * 
     */
    public List<Object> getAnyOrComponentManagerOrInterfaceRef() {
        if (anyOrComponentManagerOrInterfaceRef == null) {
            anyOrComponentManagerOrInterfaceRef = new ArrayList<Object>();
        }
        return this.anyOrComponentManagerOrInterfaceRef;
    }

    /**
     * Gets the value of the componentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentId(String value) {
        this.componentId = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://www.geni.net/resources/rspec/3}AnyExtension"/>
     *       &lt;attGroup ref="{http://www.geni.net/resources/rspec/3}AnyExtension"/>
     *       &lt;attribute name="component_id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="component_manager_id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="client_id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;anyAttribute processContents='lax' namespace='##other'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class InterfaceRef {

        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "component_id", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String componentId;
        @XmlAttribute(name = "component_manager_id", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String componentManagerId;
        @XmlAttribute(name = "client_id")
        @XmlSchemaType(name = "anySimpleType")
        protected String clientId;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Gets the value of the componentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComponentId() {
            return componentId;
        }

        /**
         * Sets the value of the componentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComponentId(String value) {
            this.componentId = value;
        }

        /**
         * Gets the value of the componentManagerId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComponentManagerId() {
            return componentManagerId;
        }

        /**
         * Sets the value of the componentManagerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComponentManagerId(String value) {
            this.componentManagerId = value;
        }

        /**
         * Gets the value of the clientId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientId() {
            return clientId;
        }

        /**
         * Sets the value of the clientId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientId(String value) {
            this.clientId = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }

}
