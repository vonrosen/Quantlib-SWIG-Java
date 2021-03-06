/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class SampleRealVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SampleRealVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SampleRealVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SampleRealVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoubleVector value() {
    return new DoubleVector(QuantLibJNI.SampleRealVector_value(swigCPtr, this), true);
  }

  public double weight() {
    return QuantLibJNI.SampleRealVector_weight(swigCPtr, this);
  }

}
