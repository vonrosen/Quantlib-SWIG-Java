/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Aonia extends OvernightIndex {
  private transient long swigCPtr;

  protected Aonia(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Aonia_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Aonia obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Aonia(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Aonia(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Aonia__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Aonia() {
    this(QuantLibJNI.new_Aonia__SWIG_1(), true);
  }

}
