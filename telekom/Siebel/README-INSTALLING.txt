Summary
-------
The following steps outline how to setup this project in an IDE (such as
Eclipse), how to compile the project, and finally how to run it.

Development Environment
-----------------------
If you are viewing/editing this code in an IDE, you will need to run
"ant -f siebelBuild.xml build" prior to importing the code.  As part
of that command a "gensrc" directory will be created.  This contains
source files created from the WSDL files and are referenced in the
delivered source.

Once that is done, add "gensrc" and "src" to your project as source
folders.  You may also need to add "$JAVA_HOME/lib/tools.jar" to your
project's classpath (e.g., "Referenced Libraries" in Eclipse).


Configuration
-------------
Be sure to update the values in config/atg/siebel/integration in the
AuthMessageHandler.properties and WebServiceHelper.properties to match the
Siebel environment you will connect to.
If the SCOA export directory is password protected or on a windows server with Oracle Commerce on 
a *nix server (or vice versa) then it should be mounted/mapped to a local directory/drive. 
This is then defined in the mappings/catalog/path-transforms file. 
Please see comments section in that file for more detailed instructions.


Database
--------
Run the SQL scripts under sql/db_components/YOUR_DB_TYPE to create and update
tables used for this integration.


Compilation / Installation
--------------------------
The ant build file included is named "siebelBuild.xml".  This needs
to be invoked with ant as follows "ant -f siebelBuild.xml".  Be
sure your DYNAMO_HOME is set properly before invoking this script.


There are two targets that can be called.


all:  This is the default and will build the Siebel module only.  This is good
if you are only working on or testing the profile integration.  Note that the
'clean' will wipe out the Siebel module so the results of the next target
will also be removed.


all-with-ws:  This will create the Siebel module and the web services.  The
web services are for the SCOA (Siebel) interface.  If this is primarily what
you will be working on, you may want to change the default target to this in
siebelBuild.xml.


Running
-------
Per the instructions the Siebel module can now be started with Oracle Commerce.
For Production environments start the module by supplying 
a "-m Siebel.PublishingAgent" or including it in your list of modules to startup.
For Publishing start the module by supplying "-m Siebel.Versioned".
NOTE - In some Weblogic environments it may be necessary to modify the CLASSPATH
variable in the Weblogic startup script to avoid issues with multiple versions of SAAJ libraries
colliding with each other e.g. if you encounter the following during webservice invocation :-
java.lang.NoClassDefFoundError: com/sun/xml/messaging/saaj/soap/ver1_1/SOAPMessageFactory1_1Impl
...
com.sun.xml.internal.messaging.saaj.soap.LocalStrings != com.sun.xml.messaging.saaj.soap.LocalStrings

then download and add the saaj-impl13.jar to the top of the CLASSPATH and restart the server.


Structured Product UI (SPU)
---------------------------
Template SPU repository data is included in 'test-data/spu/base-data.xml' and can be 
loaded into the /atg/siebel/configurator/spu/StructuredProductUIRepository/ using the 
startSQLRepository script. This template data will facilitate the generation of SPU 
definitions for products imported into the ProductCatalog repository.
