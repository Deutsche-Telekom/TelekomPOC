
package com.siebel.ordermanagement.configurator.webchannelobjgroupitems;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.configurator.webchannelobjgroupitems package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListOfObject_QNAME = new QName("http://siebel.com/OrderManagement/Configurator/WebChannelObjGroupItems", "ListOfObject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.configurator.webchannelobjgroupitems
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AttributeDecoration }
     * 
     */
    public AttributeDecoration createAttributeDecoration() {
        return new AttributeDecoration();
    }

    /**
     * Create an instance of {@link AttributeDomain }
     * 
     */
    public AttributeDomain createAttributeDomain() {
        return new AttributeDomain();
    }

    /**
     * Create an instance of {@link ObjectDecoration }
     * 
     */
    public ObjectDecoration createObjectDecoration() {
        return new ObjectDecoration();
    }

    /**
     * Create an instance of {@link LinkedItem }
     * 
     */
    public LinkedItem createLinkedItem() {
        return new LinkedItem();
    }

    /**
     * Create an instance of {@link ListOfObjectTopElmt }
     * 
     */
    public ListOfObjectTopElmt createListOfObjectTopElmt() {
        return new ListOfObjectTopElmt();
    }

    /**
     * Create an instance of {@link Object }
     * 
     */
    public Object createObject() {
        return new Object();
    }

    /**
     * Create an instance of {@link GroupDecoration }
     * 
     */
    public GroupDecoration createGroupDecoration() {
        return new GroupDecoration();
    }

    /**
     * Create an instance of {@link AttributeDefaultValue }
     * 
     */
    public AttributeDefaultValue createAttributeDefaultValue() {
        return new AttributeDefaultValue();
    }

    /**
     * Create an instance of {@link ResourceDecoration }
     * 
     */
    public ResourceDecoration createResourceDecoration() {
        return new ResourceDecoration();
    }

    /**
     * Create an instance of {@link AttributeDomainDecoration }
     * 
     */
    public AttributeDomainDecoration createAttributeDomainDecoration() {
        return new AttributeDomainDecoration();
    }

    /**
     * Create an instance of {@link RelationshipDecoration }
     * 
     */
    public RelationshipDecoration createRelationshipDecoration() {
        return new RelationshipDecoration();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link AttributeRejectedValue }
     * 
     */
    public AttributeRejectedValue createAttributeRejectedValue() {
        return new AttributeRejectedValue();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link RelationshipDomainDecoration }
     * 
     */
    public RelationshipDomainDecoration createRelationshipDomainDecoration() {
        return new RelationshipDomainDecoration();
    }

    /**
     * Create an instance of {@link GroupItem }
     * 
     */
    public GroupItem createGroupItem() {
        return new GroupItem();
    }

    /**
     * Create an instance of {@link UIOption }
     * 
     */
    public UIOption createUIOption() {
        return new UIOption();
    }

    /**
     * Create an instance of {@link UIOptionDecoration }
     * 
     */
    public UIOptionDecoration createUIOptionDecoration() {
        return new UIOptionDecoration();
    }

    /**
     * Create an instance of {@link LinkedItemDecoration }
     * 
     */
    public LinkedItemDecoration createLinkedItemDecoration() {
        return new LinkedItemDecoration();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link Responsibility }
     * 
     */
    public Responsibility createResponsibility() {
        return new Responsibility();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link ListOfObject }
     * 
     */
    public ListOfObject createListOfObject() {
        return new ListOfObject();
    }

    /**
     * Create an instance of {@link RelationshipDomain }
     * 
     */
    public RelationshipDomain createRelationshipDomain() {
        return new RelationshipDomain();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Configurator/WebChannelObjGroupItems", name = "ListOfObject")
    public JAXBElement<ListOfObject> createListOfObject(ListOfObject value) {
        return new JAXBElement<ListOfObject>(_ListOfObject_QNAME, ListOfObject.class, null, value);
    }

}
