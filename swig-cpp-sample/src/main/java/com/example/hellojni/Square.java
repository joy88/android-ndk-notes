/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.example.hellojni;

public class Square extends Shape {
  private transient long swigCPtr;

  protected Square(long cPtr, boolean cMemoryOwn) {
    super(NativeJNI.Square_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Square obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeJNI.delete_Square(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String info() {
    return NativeJNI.Square_info(swigCPtr, this);
  }

  public double area() {
    return NativeJNI.Square_area(swigCPtr, this);
  }

  public double perimeter() {
    return NativeJNI.Square_perimeter(swigCPtr, this);
  }

}