/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class DefaultProbabilityHelper {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DefaultProbabilityHelper(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DefaultProbabilityHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DefaultProbabilityHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_DefaultProbabilityHelper __deref__() {
    long cPtr = QuantLibJNI.DefaultProbabilityHelper___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DefaultProbabilityHelper(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.DefaultProbabilityHelper_isNull(swigCPtr, this);
  }

  public DefaultProbabilityHelper() {
    this(QuantLibJNI.new_DefaultProbabilityHelper(), true);
  }

}