/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class BasketPayoff extends Payoff {
  private transient long swigCPtr;

  protected BasketPayoff(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BasketPayoff_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BasketPayoff obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BasketPayoff(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BasketPayoff() {
    this(QuantLibJNI.new_BasketPayoff(), true);
  }

}