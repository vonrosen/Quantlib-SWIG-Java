/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class ConjugateGradient extends OptimizationMethod {
  private transient long swigCPtr;

  protected ConjugateGradient(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ConjugateGradient_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConjugateGradient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ConjugateGradient(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ConjugateGradient() {
    this(QuantLibJNI.new_ConjugateGradient(), true);
  }

}
