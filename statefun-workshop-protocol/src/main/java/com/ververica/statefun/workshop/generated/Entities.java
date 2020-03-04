// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: statefun-workshop-protocol/src/main/protobuf/entities.proto

package com.ververica.statefun.workshop.generated;

public final class Entities {
  private Entities() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_flink_statefun_examples_kafka_ConfirmFraud_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_flink_statefun_examples_kafka_ConfirmFraud_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_flink_statefun_examples_kafka_Transaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_flink_statefun_examples_kafka_Transaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_flink_statefun_examples_kafka_FeatureVector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_flink_statefun_examples_kafka_FeatureVector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_flink_statefun_examples_kafka_FraudScore_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_flink_statefun_examples_kafka_FraudScore_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;statefun-workshop-protocol/src/main/pr" +
      "otobuf/entities.proto\022(org.apache.flink." +
      "statefun.examples.kafka\032\037google/protobuf" +
      "/timestamp.proto\"\037\n\014ConfirmFraud\022\017\n\007acco" +
      "unt\030\001 \001(\t\"o\n\013Transaction\022\017\n\007account\030\001 \001(" +
      "\t\022-\n\ttimestamp\030\002 \001(\0132\032.google.protobuf.T" +
      "imestamp\022\020\n\010merchant\030\003 \001(\t\022\016\n\006amount\030\004 \001" +
      "(\005\":\n\rFeatureVector\022\022\n\nfraudCount\030\001 \001(\005\022" +
      "\025\n\rmerchantScore\030\002 \001(\005\"\033\n\nFraudScore\022\r\n\005" +
      "score\030\001 \001(\005B-\n)com.ververica.statefun.wo" +
      "rkshop.generatedP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_org_apache_flink_statefun_examples_kafka_ConfirmFraud_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_flink_statefun_examples_kafka_ConfirmFraud_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_flink_statefun_examples_kafka_ConfirmFraud_descriptor,
        new java.lang.String[] { "Account", });
    internal_static_org_apache_flink_statefun_examples_kafka_Transaction_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_apache_flink_statefun_examples_kafka_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_flink_statefun_examples_kafka_Transaction_descriptor,
        new java.lang.String[] { "Account", "Timestamp", "Merchant", "Amount", });
    internal_static_org_apache_flink_statefun_examples_kafka_FeatureVector_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_apache_flink_statefun_examples_kafka_FeatureVector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_flink_statefun_examples_kafka_FeatureVector_descriptor,
        new java.lang.String[] { "FraudCount", "MerchantScore", });
    internal_static_org_apache_flink_statefun_examples_kafka_FraudScore_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_apache_flink_statefun_examples_kafka_FraudScore_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_flink_statefun_examples_kafka_FraudScore_descriptor,
        new java.lang.String[] { "Score", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}