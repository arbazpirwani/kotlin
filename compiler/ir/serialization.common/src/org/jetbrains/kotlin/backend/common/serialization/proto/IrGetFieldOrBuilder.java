// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrGetFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrGetField)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.FieldAccessCommon field_access = 1;</code>
   */
  boolean hasFieldAccess();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.FieldAccessCommon field_access = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.FieldAccessCommon getFieldAccess();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
   */
  boolean hasOrigin();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin getOrigin();
}