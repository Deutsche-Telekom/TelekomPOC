
package com.siebel.selfservice.common.account;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.account package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.account
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelfServiceAccountExecuteOutput }
     * 
     */
    public SelfServiceAccountExecuteOutput createSelfServiceAccountExecuteOutput() {
        return new SelfServiceAccountExecuteOutput();
    }

    /**
     * Create an instance of {@link SelfServiceAccountExecuteInput }
     * 
     */
    public SelfServiceAccountExecuteInput createSelfServiceAccountExecuteInput() {
        return new SelfServiceAccountExecuteInput();
    }

    /**
     * Create an instance of {@link SelfServiceAccountQueryPageInput }
     * 
     */
    public SelfServiceAccountQueryPageInput createSelfServiceAccountQueryPageInput() {
        return new SelfServiceAccountQueryPageInput();
    }

    /**
     * Create an instance of {@link SelfServiceAccountQueryPageOutput }
     * 
     */
    public SelfServiceAccountQueryPageOutput createSelfServiceAccountQueryPageOutput() {
        return new SelfServiceAccountQueryPageOutput();
    }

}
