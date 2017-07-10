/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package schema;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-29")
public class SucursalProducto implements org.apache.thrift.TBase<SucursalProducto, SucursalProducto._Fields>, java.io.Serializable, Cloneable, Comparable<SucursalProducto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SucursalProducto");

  private static final org.apache.thrift.protocol.TField SUCURSAL_FIELD_DESC = new org.apache.thrift.protocol.TField("sucursal", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PRODUCTO_FIELD_DESC = new org.apache.thrift.protocol.TField("producto", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SucursalProductoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SucursalProductoTupleSchemeFactory();

  public SucursalID sucursal; // required
  public ProductoID producto; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUCURSAL((short)1, "sucursal"),
    PRODUCTO((short)2, "producto");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUCURSAL
          return SUCURSAL;
        case 2: // PRODUCTO
          return PRODUCTO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUCURSAL, new org.apache.thrift.meta_data.FieldMetaData("sucursal", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SucursalID.class)));
    tmpMap.put(_Fields.PRODUCTO, new org.apache.thrift.meta_data.FieldMetaData("producto", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ProductoID.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SucursalProducto.class, metaDataMap);
  }

  public SucursalProducto() {
  }

  public SucursalProducto(
    SucursalID sucursal,
    ProductoID producto)
  {
    this();
    this.sucursal = sucursal;
    this.producto = producto;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SucursalProducto(SucursalProducto other) {
    if (other.isSetSucursal()) {
      this.sucursal = new SucursalID(other.sucursal);
    }
    if (other.isSetProducto()) {
      this.producto = new ProductoID(other.producto);
    }
  }

  public SucursalProducto deepCopy() {
    return new SucursalProducto(this);
  }

  @Override
  public void clear() {
    this.sucursal = null;
    this.producto = null;
  }

  public SucursalID getSucursal() {
    return this.sucursal;
  }

  public SucursalProducto setSucursal(SucursalID sucursal) {
    this.sucursal = sucursal;
    return this;
  }

  public void unsetSucursal() {
    this.sucursal = null;
  }

  /** Returns true if field sucursal is set (has been assigned a value) and false otherwise */
  public boolean isSetSucursal() {
    return this.sucursal != null;
  }

  public void setSucursalIsSet(boolean value) {
    if (!value) {
      this.sucursal = null;
    }
  }

  public ProductoID getProducto() {
    return this.producto;
  }

  public SucursalProducto setProducto(ProductoID producto) {
    this.producto = producto;
    return this;
  }

  public void unsetProducto() {
    this.producto = null;
  }

  /** Returns true if field producto is set (has been assigned a value) and false otherwise */
  public boolean isSetProducto() {
    return this.producto != null;
  }

  public void setProductoIsSet(boolean value) {
    if (!value) {
      this.producto = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SUCURSAL:
      if (value == null) {
        unsetSucursal();
      } else {
        setSucursal((SucursalID)value);
      }
      break;

    case PRODUCTO:
      if (value == null) {
        unsetProducto();
      } else {
        setProducto((ProductoID)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCURSAL:
      return getSucursal();

    case PRODUCTO:
      return getProducto();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUCURSAL:
      return isSetSucursal();
    case PRODUCTO:
      return isSetProducto();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SucursalProducto)
      return this.equals((SucursalProducto)that);
    return false;
  }

  public boolean equals(SucursalProducto that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sucursal = true && this.isSetSucursal();
    boolean that_present_sucursal = true && that.isSetSucursal();
    if (this_present_sucursal || that_present_sucursal) {
      if (!(this_present_sucursal && that_present_sucursal))
        return false;
      if (!this.sucursal.equals(that.sucursal))
        return false;
    }

    boolean this_present_producto = true && this.isSetProducto();
    boolean that_present_producto = true && that.isSetProducto();
    if (this_present_producto || that_present_producto) {
      if (!(this_present_producto && that_present_producto))
        return false;
      if (!this.producto.equals(that.producto))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSucursal()) ? 131071 : 524287);
    if (isSetSucursal())
      hashCode = hashCode * 8191 + sucursal.hashCode();

    hashCode = hashCode * 8191 + ((isSetProducto()) ? 131071 : 524287);
    if (isSetProducto())
      hashCode = hashCode * 8191 + producto.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SucursalProducto other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSucursal()).compareTo(other.isSetSucursal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSucursal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sucursal, other.sucursal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProducto()).compareTo(other.isSetProducto());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProducto()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.producto, other.producto);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SucursalProducto(");
    boolean first = true;

    sb.append("sucursal:");
    if (this.sucursal == null) {
      sb.append("null");
    } else {
      sb.append(this.sucursal);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("producto:");
    if (this.producto == null) {
      sb.append("null");
    } else {
      sb.append(this.producto);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (sucursal == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sucursal' was not present! Struct: " + toString());
    }
    if (producto == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'producto' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SucursalProductoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SucursalProductoStandardScheme getScheme() {
      return new SucursalProductoStandardScheme();
    }
  }

  private static class SucursalProductoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SucursalProducto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SucursalProducto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCURSAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sucursal = new SucursalID();
              struct.sucursal.read(iprot);
              struct.setSucursalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRODUCTO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.producto = new ProductoID();
              struct.producto.read(iprot);
              struct.setProductoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SucursalProducto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sucursal != null) {
        oprot.writeFieldBegin(SUCURSAL_FIELD_DESC);
        struct.sucursal.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.producto != null) {
        oprot.writeFieldBegin(PRODUCTO_FIELD_DESC);
        struct.producto.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SucursalProductoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SucursalProductoTupleScheme getScheme() {
      return new SucursalProductoTupleScheme();
    }
  }

  private static class SucursalProductoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SucursalProducto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SucursalProducto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sucursal.write(oprot);
      struct.producto.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SucursalProducto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sucursal = new SucursalID();
      struct.sucursal.read(iprot);
      struct.setSucursalIsSet(true);
      struct.producto = new ProductoID();
      struct.producto.read(iprot);
      struct.setProductoIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
