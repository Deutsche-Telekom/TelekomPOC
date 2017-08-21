
package com.siebel.selfservice.common.contact;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.contact package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.contact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelfServiceContactExecuteInput }
     * 
     */
    public SelfServiceContactExecuteInput createSelfServiceContactExecuteInput() {
        return new SelfServiceContactExecuteInput();
    }

    /**
     * Create an instance of {@link SelfServiceContactQueryPageOutput }
     * 
     */
    public SelfServiceContactQueryPageOutput createSelfServiceContactQueryPageOutput() {
        return new SelfServiceContactQueryPageOutput();
    }

    /**
     * Create an instance of {@link SelfServiceContactQueryPageInput }
     * 
     */
    public SelfServiceContactQueryPageInput createSelfServiceContactQueryPageInput() {
        return new SelfServiceContactQueryPageInput();
    }

    /**
     * Create an instance of {@link SelfServiceContactExecuteOutput }
     * 
     */
    public SelfServiceContactExecuteOutput createSelfServiceContactExecuteOutput() {
        return new SelfServiceContactExecuteOutput();
    }

}
