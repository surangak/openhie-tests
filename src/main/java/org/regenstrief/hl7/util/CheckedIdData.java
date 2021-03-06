/**
 * The contents of this file are subject to the Regenstrief Public License
 * Version 1.0 (the "License"); you may not use this file except in compliance with the License.
 * Please contact Regenstrief Institute if you would like to obtain a copy of the license.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) Regenstrief Institute.  All Rights Reserved.
 */
package org.regenstrief.hl7.util;

/**
 * <p>
 * Title: CheckedIdData
 * </p>
 * <p>
 * Description: Interface for HL7 check digit data
 * </p>
 * <p>
 * Copyright: Copyright (c) 2008
 * </p>
 * <p>
 * Company: Regenstrief Institute
 * </p>
 * 
 * @author Andrew Martin
 * @version 1.0
 */
public interface CheckedIdData extends IdData {
    
    /**
     * Retrieves the check digit
     * 
     * @return the check digit
     **/
    public String getCheckDigit();
    
    /**
     * Retrieves the check digit scheme
     * 
     * @return the check digit scheme
     **/
    public String getCheckDigitScheme();
    
    /**
     * Modifies the check digit
     * 
     * @param checkDigit the new check digit
     **/
    public void setCheckDigit(String checkDigit);
    
    /**
     * Modifies the the new check digit scheme
     * 
     * @param checkDigitScheme the new check digit scheme
     **/
    public void setCheckDigitScheme(String checkDigitScheme);
}
