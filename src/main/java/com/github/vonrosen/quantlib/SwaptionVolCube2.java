/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class SwaptionVolCube2 extends SwaptionVolatilityStructure {
  private transient long swigCPtr;

  protected SwaptionVolCube2(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SwaptionVolCube2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SwaptionVolCube2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SwaptionVolCube2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SwaptionVolCube2(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndexBase, SwapIndex shortSwapIndexBase, boolean vegaWeightedSmileFit) {
    this(QuantLibJNI.new_SwaptionVolCube2(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndexBase), swapIndexBase, SwapIndex.getCPtr(shortSwapIndexBase), shortSwapIndexBase, vegaWeightedSmileFit), true);
  }

}
