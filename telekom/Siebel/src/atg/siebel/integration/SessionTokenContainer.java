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
package atg.siebel.integration;

import atg.nucleus.GenericService;

/**
 * This class manages the use of Siebel Session Tokens. If isQueuingTokens is set to true, a FIFO queue of tokens is
 * maintained by the TokenQueue singleton class, and Web Service requests get their tokens from here. If isQueuingTokens
 * is false, a global token is stored, which is stored from one response to the next request.
 *
 * Created by gamcdowe on 23/01/2015.
 */
public class SessionTokenContainer extends GenericService{

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/integration/SessionTokenContainer.java#2 $$Change: 1194813 $";

  protected boolean mQueuingTokens = false;

  public boolean isQueuingTokens() {
    return mQueuingTokens;
  }

  public void setQueuingTokens(boolean isQueuingTokens) {
    mQueuingTokens = isQueuingTokens;
  }

  protected SiebelSessionToken mTokenInUse = null;

  /**
   * gets a session token. Returns null if none are available
   *
   * @return
   */
  public String getSessionToken()
  {

    SiebelSessionToken token = null;

    if(isQueuingTokens())
    {
      boolean tokenValid = false;

      while (!tokenValid) {
        token = TokenQueue.getToken();

        //no tokens are available
        if (token == null)
          break;

        if (!token.isTimedOut()) {
          tokenValid = true;
        }
      }
    }
    else
    {
      token = mTokenInUse;
    }

    if(isLoggingDebug())
    {
      logDebug("getSessionToken: token to use is " + token);
    }

    if (token != null)
      return token.getToken();
    else
      return null;
  }

  /**
   * Adds a new token to the queue
   *
   * @param pToken
   */
  public void addSessionToken(String pToken)
  {
    if(isQueuingTokens())
    {
      TokenQueue.getInstance().add(new SiebelSessionToken(pToken));
    }
    else
    {
      mTokenInUse = new SiebelSessionToken(pToken);
    }
  }

}
