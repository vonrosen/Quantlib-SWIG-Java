/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class BachelierCapFloorEngine extends PricingEngine {
  private transient long swigCPtr;

  protected BachelierCapFloorEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BachelierCapFloorEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BachelierCapFloorEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BachelierCapFloorEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BachelierCapFloorEngine(YieldTermStructureHandle termStructure, QuoteHandle vol) {
    this(QuantLibJNI.new_BachelierCapFloorEngine__SWIG_0(YieldTermStructureHandle.getCPtr(termStructure), termStructure, QuoteHandle.getCPtr(vol), vol), true);
  }

  public BachelierCapFloorEngine(YieldTermStructureHandle termStructure, OptionletVolatilityStructureHandle vol) {
    this(QuantLibJNI.new_BachelierCapFloorEngine__SWIG_1(YieldTermStructureHandle.getCPtr(termStructure), termStructure, OptionletVolatilityStructureHandle.getCPtr(vol), vol), true);
  }

}
