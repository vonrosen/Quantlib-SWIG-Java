/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Bbsw4M extends Bbsw {
  private transient long swigCPtr;

  protected Bbsw4M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Bbsw4M_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bbsw4M obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Bbsw4M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Bbsw4M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Bbsw4M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Bbsw4M() {
    this(QuantLibJNI.new_Bbsw4M__SWIG_1(), true);
  }

}