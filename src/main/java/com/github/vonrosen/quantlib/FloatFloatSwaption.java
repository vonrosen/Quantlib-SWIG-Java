/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class FloatFloatSwaption extends Instrument {
  private transient long swigCPtr;

  protected FloatFloatSwaption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FloatFloatSwaption_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FloatFloatSwaption obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FloatFloatSwaption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FloatFloatSwaption(FloatFloatSwap simpleSwap, Exercise exercise) {
    this(QuantLibJNI.new_FloatFloatSwaption(FloatFloatSwap.getCPtr(simpleSwap), simpleSwap, Exercise.getCPtr(exercise), exercise), true);
  }

  public CalibrationHelperVector calibrationBasket(Index standardSwapBase, SwaptionVolatilityStructure swaptionVolatility, String typeStr) {
    return new CalibrationHelperVector(QuantLibJNI.FloatFloatSwaption_calibrationBasket(swigCPtr, this, Index.getCPtr(standardSwapBase), standardSwapBase, SwaptionVolatilityStructure.getCPtr(swaptionVolatility), swaptionVolatility, typeStr), true);
  }

  public double underlyingValue() {
    return QuantLibJNI.FloatFloatSwaption_underlyingValue(swigCPtr, this);
  }

  public FloatFloatSwap underlyingSwap() {
    return new FloatFloatSwap(QuantLibJNI.FloatFloatSwaption_underlyingSwap(swigCPtr, this), true);
  }

  public DoubleVector probabilities() {
    return new DoubleVector(QuantLibJNI.FloatFloatSwaption_probabilities(swigCPtr, this), true);
  }

}
