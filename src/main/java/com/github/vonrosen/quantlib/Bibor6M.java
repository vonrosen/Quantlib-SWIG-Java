/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Bibor6M extends Bibor {
  private transient long swigCPtr;

  protected Bibor6M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Bibor6M_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bibor6M obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Bibor6M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Bibor6M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Bibor6M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Bibor6M() {
    this(QuantLibJNI.new_Bibor6M__SWIG_1(), true);
  }

}
