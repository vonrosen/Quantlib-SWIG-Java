/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class BondHelper extends RateHelper {
  private transient long swigCPtr;

  protected BondHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BondHelper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BondHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BondHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BondHelper(QuoteHandle cleanPrice, Bond bond, boolean useCleanPrice) {
    this(QuantLibJNI.new_BondHelper__SWIG_0(QuoteHandle.getCPtr(cleanPrice), cleanPrice, Bond.getCPtr(bond), bond, useCleanPrice), true);
  }

  public BondHelper(QuoteHandle cleanPrice, Bond bond) {
    this(QuantLibJNI.new_BondHelper__SWIG_1(QuoteHandle.getCPtr(cleanPrice), cleanPrice, Bond.getCPtr(bond), bond), true);
  }

  public Bond bond() {
    return new Bond(QuantLibJNI.BondHelper_bond(swigCPtr, this), true);
  }

}
