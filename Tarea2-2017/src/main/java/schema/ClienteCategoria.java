/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package schema;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-29")
public class ClienteCategoria implements org.apache.thrift.TBase<ClienteCategoria, ClienteCategoria._Fields>, java.io.Serializable, Cloneable, Comparable<ClienteCategoria> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClienteCategoria");

  private static final org.apache.thrift.protocol.TField CLIENTE_FIELD_DESC = new org.apache.thrift.protocol.TField("cliente", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CATEGORIA_FIELD_DESC = new org.apache.thrift.protocol.TField("categoria", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField NONCE_FIELD_DESC = new org.apache.thrift.protocol.TField("nonce", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClienteCategoriaStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClienteCategoriaTupleSchemeFactory();

  public ClienteID cliente; // required
  public CategoriaID categoria; // required
  public long nonce; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLIENTE((short)1, "cliente"),
    CATEGORIA((short)2, "categoria"),
    NONCE((short)3, "nonce");

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
        case 1: // CLIENTE
          return CLIENTE;
        case 2: // CATEGORIA
          return CATEGORIA;
        case 3: // NONCE
          return NONCE;
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
  private static final int __NONCE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLIENTE, new org.apache.thrift.meta_data.FieldMetaData("cliente", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ClienteID.class)));
    tmpMap.put(_Fields.CATEGORIA, new org.apache.thrift.meta_data.FieldMetaData("categoria", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CategoriaID.class)));
    tmpMap.put(_Fields.NONCE, new org.apache.thrift.meta_data.FieldMetaData("nonce", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClienteCategoria.class, metaDataMap);
  }

  public ClienteCategoria() {
  }

  public ClienteCategoria(
    ClienteID cliente,
    CategoriaID categoria,
    long nonce)
  {
    this();
    this.cliente = cliente;
    this.categoria = categoria;
    this.nonce = nonce;
    setNonceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClienteCategoria(ClienteCategoria other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCliente()) {
      this.cliente = new ClienteID(other.cliente);
    }
    if (other.isSetCategoria()) {
      this.categoria = new CategoriaID(other.categoria);
    }
    this.nonce = other.nonce;
  }

  public ClienteCategoria deepCopy() {
    return new ClienteCategoria(this);
  }

  @Override
  public void clear() {
    this.cliente = null;
    this.categoria = null;
    setNonceIsSet(false);
    this.nonce = 0;
  }

  public ClienteID getCliente() {
    return this.cliente;
  }

  public ClienteCategoria setCliente(ClienteID cliente) {
    this.cliente = cliente;
    return this;
  }

  public void unsetCliente() {
    this.cliente = null;
  }

  /** Returns true if field cliente is set (has been assigned a value) and false otherwise */
  public boolean isSetCliente() {
    return this.cliente != null;
  }

  public void setClienteIsSet(boolean value) {
    if (!value) {
      this.cliente = null;
    }
  }

  public CategoriaID getCategoria() {
    return this.categoria;
  }

  public ClienteCategoria setCategoria(CategoriaID categoria) {
    this.categoria = categoria;
    return this;
  }

  public void unsetCategoria() {
    this.categoria = null;
  }

  /** Returns true if field categoria is set (has been assigned a value) and false otherwise */
  public boolean isSetCategoria() {
    return this.categoria != null;
  }

  public void setCategoriaIsSet(boolean value) {
    if (!value) {
      this.categoria = null;
    }
  }

  public long getNonce() {
    return this.nonce;
  }

  public ClienteCategoria setNonce(long nonce) {
    this.nonce = nonce;
    setNonceIsSet(true);
    return this;
  }

  public void unsetNonce() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NONCE_ISSET_ID);
  }

  /** Returns true if field nonce is set (has been assigned a value) and false otherwise */
  public boolean isSetNonce() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NONCE_ISSET_ID);
  }

  public void setNonceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NONCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CLIENTE:
      if (value == null) {
        unsetCliente();
      } else {
        setCliente((ClienteID)value);
      }
      break;

    case CATEGORIA:
      if (value == null) {
        unsetCategoria();
      } else {
        setCategoria((CategoriaID)value);
      }
      break;

    case NONCE:
      if (value == null) {
        unsetNonce();
      } else {
        setNonce((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CLIENTE:
      return getCliente();

    case CATEGORIA:
      return getCategoria();

    case NONCE:
      return getNonce();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CLIENTE:
      return isSetCliente();
    case CATEGORIA:
      return isSetCategoria();
    case NONCE:
      return isSetNonce();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ClienteCategoria)
      return this.equals((ClienteCategoria)that);
    return false;
  }

  public boolean equals(ClienteCategoria that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cliente = true && this.isSetCliente();
    boolean that_present_cliente = true && that.isSetCliente();
    if (this_present_cliente || that_present_cliente) {
      if (!(this_present_cliente && that_present_cliente))
        return false;
      if (!this.cliente.equals(that.cliente))
        return false;
    }

    boolean this_present_categoria = true && this.isSetCategoria();
    boolean that_present_categoria = true && that.isSetCategoria();
    if (this_present_categoria || that_present_categoria) {
      if (!(this_present_categoria && that_present_categoria))
        return false;
      if (!this.categoria.equals(that.categoria))
        return false;
    }

    boolean this_present_nonce = true;
    boolean that_present_nonce = true;
    if (this_present_nonce || that_present_nonce) {
      if (!(this_present_nonce && that_present_nonce))
        return false;
      if (this.nonce != that.nonce)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCliente()) ? 131071 : 524287);
    if (isSetCliente())
      hashCode = hashCode * 8191 + cliente.hashCode();

    hashCode = hashCode * 8191 + ((isSetCategoria()) ? 131071 : 524287);
    if (isSetCategoria())
      hashCode = hashCode * 8191 + categoria.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(nonce);

    return hashCode;
  }

  @Override
  public int compareTo(ClienteCategoria other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCliente()).compareTo(other.isSetCliente());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCliente()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cliente, other.cliente);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCategoria()).compareTo(other.isSetCategoria());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategoria()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.categoria, other.categoria);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNonce()).compareTo(other.isSetNonce());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNonce()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nonce, other.nonce);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClienteCategoria(");
    boolean first = true;

    sb.append("cliente:");
    if (this.cliente == null) {
      sb.append("null");
    } else {
      sb.append(this.cliente);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("categoria:");
    if (this.categoria == null) {
      sb.append("null");
    } else {
      sb.append(this.categoria);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nonce:");
    sb.append(this.nonce);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (cliente == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'cliente' was not present! Struct: " + toString());
    }
    if (categoria == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'categoria' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'nonce' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClienteCategoriaStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClienteCategoriaStandardScheme getScheme() {
      return new ClienteCategoriaStandardScheme();
    }
  }

  private static class ClienteCategoriaStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClienteCategoria> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClienteCategoria struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLIENTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cliente = new ClienteID();
              struct.cliente.read(iprot);
              struct.setClienteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CATEGORIA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.categoria = new CategoriaID();
              struct.categoria.read(iprot);
              struct.setCategoriaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NONCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.nonce = iprot.readI64();
              struct.setNonceIsSet(true);
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
      if (!struct.isSetNonce()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'nonce' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClienteCategoria struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cliente != null) {
        oprot.writeFieldBegin(CLIENTE_FIELD_DESC);
        struct.cliente.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.categoria != null) {
        oprot.writeFieldBegin(CATEGORIA_FIELD_DESC);
        struct.categoria.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NONCE_FIELD_DESC);
      oprot.writeI64(struct.nonce);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClienteCategoriaTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClienteCategoriaTupleScheme getScheme() {
      return new ClienteCategoriaTupleScheme();
    }
  }

  private static class ClienteCategoriaTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClienteCategoria> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClienteCategoria struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.cliente.write(oprot);
      struct.categoria.write(oprot);
      oprot.writeI64(struct.nonce);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClienteCategoria struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.cliente = new ClienteID();
      struct.cliente.read(iprot);
      struct.setClienteIsSet(true);
      struct.categoria = new CategoriaID();
      struct.categoria.read(iprot);
      struct.setCategoriaIsSet(true);
      struct.nonce = iprot.readI64();
      struct.setNonceIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

