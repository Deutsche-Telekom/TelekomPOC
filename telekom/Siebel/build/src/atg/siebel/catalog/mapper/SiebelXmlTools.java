/*<ORACLECOPYRIGHT>
 * Copyright (C) 1994, 2015, Oracle and/or its affiliates. All rights reserved.
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 * UNIX is a registered trademark of The Open Group.
 *
 * This software and related documentation are provided under a license agreement
 * containing restrictions on use and disclosure and are protected by intellectual property laws.
 * Except as expressly permitted in your license agreement or allowed by law, you may not use, copy,
 * reproduce, translate, broadcast, modify, license, transmit, distribute, exhibit, perform, publish,
 * or display any part, in any form, or by any means. Reverse engineering, disassembly,
 * or decompilation of this software, unless required by law for interoperability, is prohibited.
 *
 * The information contained herein is subject to change without notice and is not warranted to be error-free.
 * If you find any errors, please report them to us in writing.
 *
 * U.S. GOVERNMENT RIGHTS Programs, software, databases, and related documentation and technical data delivered to U.S.
 * Government customers are "commercial computer software" or "commercial technical data" pursuant to the applicable
 * Federal Acquisition Regulation and agency-specific supplemental regulations.
 * As such, the use, duplication, disclosure, modification, and adaptation shall be subject to the restrictions and
 * license terms set forth in the applicable Government contract, and, to the extent applicable by the terms of the
 * Government contract, the additional rights set forth in FAR 52.227-19, Commercial Computer Software License
 * (December 2007). Oracle America, Inc., 500 Oracle Parkway, Redwood City, CA 94065.
 *
 * This software or hardware is developed for general use in a variety of information management applications.
 * It is not developed or intended for use in any inherently dangerous applications, including applications that
 * may create a risk of personal injury. If you use this software or hardware in dangerous applications,
 * then you shall be responsible to take all appropriate fail-safe, backup, redundancy,
 * and other measures to ensure its safe use. Oracle Corporation and its affiliates disclaim any liability for any
 * damages caused by use of this software or hardware in dangerous applications.
 *
 * This software or hardware and documentation may provide access to or information on content,
 * products, and services from third parties. Oracle Corporation and its affiliates are not responsible for and
 * expressly disclaim all warranties of any kind with respect to third-party content, products, and services.
 * Oracle Corporation and its affiliates will not be responsible for any loss, costs,
 * or damages incurred due to your access to or use of third-party content, products, or services.
 </ORACLECOPYRIGHT>*/

package atg.siebel.catalog.mapper;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.ResourceUtils;
import atg.nucleus.GenericService;
import atg.siebel.catalog.mappingfilebindings.SiebelAtgMappings;
import atg.siebel.catalog.importer.ImportConstants;
import atg.xml.jaxb.JaxbInvoker;
import atg.xml.tools.DefaultXMLToolsFactory;
import atg.xml.tools.XMLToolsFactory;

/**
 * 
 * 
 * 
 * @author dreiman
 */
public class SiebelXmlTools
  extends GenericService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mapper/SiebelXmlTools.java#2 $$Change: 1194813 $";


  public static final String MY_RESOURCE_NAME =
    "atg.siebel.catalog.importer.ImportResources";

  public static java.util.ResourceBundle sResourceBundle =
    LayeredResourceBundle.getBundle(MY_RESOURCE_NAME,
      atg.service.dynamo.LangLicense.getLicensedDefault());

  // -----------------------------
  // property: jaxbInvoker
  // -----------------------------
  JaxbInvoker mJaxbInvoker;

  public void setJaxbInvoker(JaxbInvoker pJaxbInvoker) {
    mJaxbInvoker = pJaxbInvoker;
  }

  public JaxbInvoker getJaxbInvoker() {
    return mJaxbInvoker;
  }

  // -----------------------------
  // property: mapperPackageName
  // -----------------------------
  String mMapperPackageName;

  public String getMapperPackageName() {
    return mMapperPackageName;
  }

  public void setMapperPackageName(String pMapperPackageName) {
    mMapperPackageName = pMapperPackageName;
  }

  // -----------------------------
  // property: mapperFile
  // -----------------------------
  private File mMapperFile;

  /**
   * @return File specifying the Siebel-to-ATG mappings.
   */
  public File getMapperFile() {
    return mMapperFile;
  }

  /**
   * @param pMapperFile
   *          File specifying the Siebel-to-ATG mappings.
   */
  public void setMapperFile(File pMapperFile) {
    mMapperFile = pMapperFile;
  }

  // -----------------------------
  // property: pathTransformConfigFile
  // -----------------------------
  File mPathTransformConfigFile;

  /**
   * @return File of the ... TODO document this
   */
  public File getPathTransformConfigFile() {
    return mPathTransformConfigFile;
  }

  /**
   * @param pPathTransformConfigFile
   *          File of the ... TODO document this
   */
  public void setPathTransformConfigFile(File pPathTransformConfigFile) {
    mPathTransformConfigFile = pPathTransformConfigFile;
  }

  // -------------------------------------
  // Methods
  // -------------------------------------
  /**
   * TODO document this
   * 
   * @return
   * @throws JAXBException
   * @throws IOException
   */
  public SiebelAtgMappings getSiebelToAtgMappingDefinitions()
    throws JAXBException, IOException {
    SiebelAtgMappings mappingDefinitions = null;
    FileInputStream is = null;
    BufferedInputStream bis = null;

    if (!getMapperFile().exists()) {
      StringBuilder msg = new StringBuilder("Mapping File not found");
      if (getMapperFile() != null) {
        msg.append(": ").append(getMapperFile().getAbsolutePath());
      }
      msg.append(".");
      throw new IOException(msg.toString());
    }

    try {

      is = new FileInputStream(getMapperFile());
      bis = new BufferedInputStream(is);

      JAXBContext jc =
        JAXBContext.newInstance(getMapperPackageName(), this.getClass()
          .getClassLoader());
      Unmarshaller u = jc.createUnmarshaller();
      mappingDefinitions = (SiebelAtgMappings) u.unmarshal(bis);

    } finally {
      if (bis != null) {
        bis.close();
      }
      if (is != null) {
        is.close();
      }
    }
    return mappingDefinitions;
  }

  /**
   * 
   * @param pFile
   * @param pMappingService
   * @return
   * @throws IOException
   * @throws SAXException
   */
  public List<ItemData> parseSiebelXml(String pFile,
    SiebelCatalogMappingService pMappingService) throws SAXException,
    IOException {

    XMLToolsFactory factory = DefaultXMLToolsFactory.getInstance();
    XMLReader reader = factory.createXMLReader();
    reader.setFeature("http://xml.org/sax/features/validation", true);
    SiebelXmlParser parser = new SiebelXmlParser();

    List<ItemData> items = new ArrayList<ItemData>();

    String filePath = transformExportFilePath(pFile);

    File exportContainer = new File(filePath);
    // Check that the directory is valid
    if (!exportContainer.exists() || !exportContainer.isDirectory()) {
      String[] messageArguments = { filePath };
      String message =
        ResourceUtils.getMsgResource(ImportConstants.INVALID_EXPORT_DIRECTORY,
          MY_RESOURCE_NAME, sResourceBundle, messageArguments);
      if (isLoggingError()) {
        logError(message);
      }
      throw new IOException(message);
    }

    File[] files = exportContainer.listFiles();

    // loop through all files in the directory
    for (File f : files) {

      // Assume that all files in the directory are Siebel export files
      if (f.isFile()) {
        FileInputStream is = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(is);
        // get List of ItemData for each file and add to a master list
        List<ItemData> obj = parser.parse(reader, bis, pMappingService);
        items.addAll(obj);
      }
    }

    return items;
  }

  /*
   * The Siebel Export Container passed to the ATG import web service may or may
   * not be addressable. For example the address could be UNC format which is
   * not accessible on Linux (without mounting), or the fileshare might need
   * credentials. For our sample solution we are assuming that the fileshare
   * where the Export Files are hosted has been mounted or mapped to a local
   * directory/drive prior. This file then defines what the fileshare has been
   * mapped/mounted to.
   * 
   * This method loads up the tranforms every call. This is not ideal but there
   * isn't likely to be many transform in the file and in the overall timescale
   * of the import this will be insignificant. Also means transforms can be
   * added on the fly without any intervention required.
   * 
   * Will return the passed export file path if no transforms exist or if the
   * tranform config file doesn't exist
   * 
   * The transform config file has one transform per line
   * \\<server>\<share>\=\local\path\
   * 
   * This solution is certainly not the only way to get around the issue but was
   * implemented like this to keep it reasonably simple and configurable. You
   * may need to change the way this class reads in export files depending on
   * your own circumstances.
   */
  private String transformExportFilePath(String pExportFilePath) {
    vlogDebug("Transforming Siebel Export File Path: {0}", pExportFilePath);

    if (!getPathTransformConfigFile().exists()) {
      return pExportFilePath;
    }
    String line;

    BufferedReader bufferedReader;
    try {
      bufferedReader =
        new BufferedReader(new FileReader(getPathTransformConfigFile()));

      while ((line = bufferedReader.readLine()) != null) {
        if (line.trim().isEmpty() || line.indexOf('#') == 0
          || line.indexOf('=') < 0) {
          continue;
        }

        String[] transform = line.split("=");

        if (transform.length != 2 || transform[0].isEmpty()) {
          continue;
        }

        if (pExportFilePath.indexOf(transform[0]) != -1) {
          String newPath = pExportFilePath.replace(transform[0], transform[1]);
          // replace windows path separators if we are on linux
          newPath = newPath.replace("\\", File.separator);
          vlogDebug("Siebel Export File Path after transformation = {0}",
            newPath);
          return newPath;
        }
      }

    } catch (IOException e) {
      // At this stage we are going to ignore this exception, if we encounter
      // it we just return the passed file path.
    }

    return pExportFilePath;
  }
}
