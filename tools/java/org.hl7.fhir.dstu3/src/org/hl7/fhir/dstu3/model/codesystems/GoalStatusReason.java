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


import org.hl7.fhir.dstu3.exceptions.FHIRException;

public enum GoalStatusReason {

        /**
         * Goal suspended or ended because of a surgical procedure.
         */
        SURGERY, 
        /**
         * Goal suspended or ended because of a significant life event (marital change, bereavement, etc.).
         */
        LIFEEVENT, 
        /**
         * Goal has been superseded by a new goal.
         */
        REPLACED, 
        /**
         * Patient wishes the goal to be set aside, at least temporarily.
         */
        PATIENTREQUEST, 
        /**
         * added to help the parsers
         */
        NULL;
        public static GoalStatusReason fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("surgery".equals(codeString))
          return SURGERY;
        if ("life-event".equals(codeString))
          return LIFEEVENT;
        if ("replaced".equals(codeString))
          return REPLACED;
        if ("patient-request".equals(codeString))
          return PATIENTREQUEST;
        throw new FHIRException("Unknown GoalStatusReason code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case SURGERY: return "surgery";
            case LIFEEVENT: return "life-event";
            case REPLACED: return "replaced";
            case PATIENTREQUEST: return "patient-request";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/goal-status-reason";
        }
        public String getDefinition() {
          switch (this) {
            case SURGERY: return "Goal suspended or ended because of a surgical procedure.";
            case LIFEEVENT: return "Goal suspended or ended because of a significant life event (marital change, bereavement, etc.).";
            case REPLACED: return "Goal has been superseded by a new goal.";
            case PATIENTREQUEST: return "Patient wishes the goal to be set aside, at least temporarily.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case SURGERY: return "surgery";
            case LIFEEVENT: return "life event";
            case REPLACED: return "replaced";
            case PATIENTREQUEST: return "patient request";
            default: return "?";
          }
    }


}

