
package com.siebel.ordermanagement.quote.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.quote.data package. 
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

    private final static QName _ListOfQuote_QNAME = new QName("http://siebel.com/OrderManagement/Quote/Data", "ListOfQuote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.quote.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuoteItemXA }
     * 
     */
    public QuoteItemXA createQuoteItemXA() {
        return new QuoteItemXA();
    }

    /**
     * Create an instance of {@link QuoteItem }
     * 
     */
    public QuoteItem createQuoteItem() {
        return new QuoteItem();
    }

    /**
     * Create an instance of {@link Quote }
     * 
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link ListOfQuoteItemXA }
     * 
     */
    public ListOfQuoteItemXA createListOfQuoteItemXA() {
        return new ListOfQuoteItemXA();
    }

    /**
     * Create an instance of {@link ListOfQuoteTopElmt }
     * 
     */
    public ListOfQuoteTopElmt createListOfQuoteTopElmt() {
        return new ListOfQuoteTopElmt();
    }

    /**
     * Create an instance of {@link ListOfQuoteItem }
     * 
     */
    public ListOfQuoteItem createListOfQuoteItem() {
        return new ListOfQuoteItem();
    }

    /**
     * Create an instance of {@link ListOfQuote }
     * 
     */
    public ListOfQuote createListOfQuote() {
        return new ListOfQuote();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Quote/Data", name = "ListOfQuote")
    public JAXBElement<ListOfQuote> createListOfQuote(ListOfQuote value) {
        return new JAXBElement<ListOfQuote>(_ListOfQuote_QNAME, ListOfQuote.class, null, value);
    }

}
