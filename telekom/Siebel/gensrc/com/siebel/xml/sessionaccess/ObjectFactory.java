
package com.siebel.xml.sessionaccess;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.sessionaccess package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.sessionaccess
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SessionAccessEchoInput }
     * 
     */
    public SessionAccessEchoInput createSessionAccessEchoInput() {
        return new SessionAccessEchoInput();
    }

    /**
     * Create an instance of {@link SessionAccessEchoOutput }
     * 
     */
    public SessionAccessEchoOutput createSessionAccessEchoOutput() {
        return new SessionAccessEchoOutput();
    }

    /**
     * Create an instance of {@link SessionAccessSetProfileAttrInput }
     * 
     */
    public SessionAccessSetProfileAttrInput createSessionAccessSetProfileAttrInput() {
        return new SessionAccessSetProfileAttrInput();
    }

    /**
     * Create an instance of {@link SessionAccessGetProfileAttrInput }
     * 
     */
    public SessionAccessGetProfileAttrInput createSessionAccessGetProfileAttrInput() {
        return new SessionAccessGetProfileAttrInput();
    }

    /**
     * Create an instance of {@link SessionAccessGetProfileAttrOutput }
     * 
     */
    public SessionAccessGetProfileAttrOutput createSessionAccessGetProfileAttrOutput() {
        return new SessionAccessGetProfileAttrOutput();
    }

    /**
     * Create an instance of {@link SessionAccessPingInput }
     * 
     */
    public SessionAccessPingInput createSessionAccessPingInput() {
        return new SessionAccessPingInput();
    }

    /**
     * Create an instance of {@link SessionAccessPingOutput }
     * 
     */
    public SessionAccessPingOutput createSessionAccessPingOutput() {
        return new SessionAccessPingOutput();
    }

}
