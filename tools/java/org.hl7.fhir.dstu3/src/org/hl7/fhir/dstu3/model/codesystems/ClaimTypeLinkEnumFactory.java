package org.hl7.fhir.dstu3.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Mon, Mar 28, 2016 15:19-0600 for FHIR v1.3.0


import org.hl7.fhir.dstu3.model.EnumFactory;

public class ClaimTypeLinkEnumFactory implements EnumFactory<ClaimTypeLink> {

  public ClaimTypeLink fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("institutional".equals(codeString))
      return ClaimTypeLink.INSTITUTIONAL;
    if ("oral".equals(codeString))
      return ClaimTypeLink.ORAL;
    if ("pharmacy".equals(codeString))
      return ClaimTypeLink.PHARMACY;
    if ("professional".equals(codeString))
      return ClaimTypeLink.PROFESSIONAL;
    if ("vision".equals(codeString))
      return ClaimTypeLink.VISION;
    throw new IllegalArgumentException("Unknown ClaimTypeLink code '"+codeString+"'");
  }

  public String toCode(ClaimTypeLink code) {
    if (code == ClaimTypeLink.INSTITUTIONAL)
      return "institutional";
    if (code == ClaimTypeLink.ORAL)
      return "oral";
    if (code == ClaimTypeLink.PHARMACY)
      return "pharmacy";
    if (code == ClaimTypeLink.PROFESSIONAL)
      return "professional";
    if (code == ClaimTypeLink.VISION)
      return "vision";
    return "?";
  }

    public String toSystem(ClaimTypeLink code) {
      return code.getSystem();
      }

}

