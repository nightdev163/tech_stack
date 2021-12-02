// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Aug 16 13:54:25 CST 2021
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public QueryResult with_id(Long id) {
    this.id = id;
    return this;
  }
  private Long uid;
  public Long get_uid() {
    return uid;
  }
  public void set_uid(Long uid) {
    this.uid = uid;
  }
  public QueryResult with_uid(Long uid) {
    this.uid = uid;
    return this;
  }
  private Long repo_id;
  public Long get_repo_id() {
    return repo_id;
  }
  public void set_repo_id(Long repo_id) {
    this.repo_id = repo_id;
  }
  public QueryResult with_repo_id(Long repo_id) {
    this.repo_id = repo_id;
    return this;
  }
  private String picker_name;
  public String get_picker_name() {
    return picker_name;
  }
  public void set_picker_name(String picker_name) {
    this.picker_name = picker_name;
  }
  public QueryResult with_picker_name(String picker_name) {
    this.picker_name = picker_name;
    return this;
  }
  private String picker_phone;
  public String get_picker_phone() {
    return picker_phone;
  }
  public void set_picker_phone(String picker_phone) {
    this.picker_phone = picker_phone;
  }
  public QueryResult with_picker_phone(String picker_phone) {
    this.picker_phone = picker_phone;
    return this;
  }
  private String picker_addr;
  public String get_picker_addr() {
    return picker_addr;
  }
  public void set_picker_addr(String picker_addr) {
    this.picker_addr = picker_addr;
  }
  public QueryResult with_picker_addr(String picker_addr) {
    this.picker_addr = picker_addr;
    return this;
  }
  private String picker_detail_addr;
  public String get_picker_detail_addr() {
    return picker_detail_addr;
  }
  public void set_picker_detail_addr(String picker_detail_addr) {
    this.picker_detail_addr = picker_detail_addr;
  }
  public QueryResult with_picker_detail_addr(String picker_detail_addr) {
    this.picker_detail_addr = picker_detail_addr;
    return this;
  }
  private Double picker_longitude;
  public Double get_picker_longitude() {
    return picker_longitude;
  }
  public void set_picker_longitude(Double picker_longitude) {
    this.picker_longitude = picker_longitude;
  }
  public QueryResult with_picker_longitude(Double picker_longitude) {
    this.picker_longitude = picker_longitude;
    return this;
  }
  private Double picker_latitude;
  public Double get_picker_latitude() {
    return picker_latitude;
  }
  public void set_picker_latitude(Double picker_latitude) {
    this.picker_latitude = picker_latitude;
  }
  public QueryResult with_picker_latitude(Double picker_latitude) {
    this.picker_latitude = picker_latitude;
    return this;
  }
  private String cp_order_id;
  public String get_cp_order_id() {
    return cp_order_id;
  }
  public void set_cp_order_id(String cp_order_id) {
    this.cp_order_id = cp_order_id;
  }
  public QueryResult with_cp_order_id(String cp_order_id) {
    this.cp_order_id = cp_order_id;
    return this;
  }
  private String unify_order_id;
  public String get_unify_order_id() {
    return unify_order_id;
  }
  public void set_unify_order_id(String unify_order_id) {
    this.unify_order_id = unify_order_id;
  }
  public QueryResult with_unify_order_id(String unify_order_id) {
    this.unify_order_id = unify_order_id;
    return this;
  }
  private Integer pay_type;
  public Integer get_pay_type() {
    return pay_type;
  }
  public void set_pay_type(Integer pay_type) {
    this.pay_type = pay_type;
  }
  public QueryResult with_pay_type(Integer pay_type) {
    this.pay_type = pay_type;
    return this;
  }
  private Integer mode;
  public Integer get_mode() {
    return mode;
  }
  public void set_mode(Integer mode) {
    this.mode = mode;
  }
  public QueryResult with_mode(Integer mode) {
    this.mode = mode;
    return this;
  }
  private java.math.BigDecimal original_price;
  public java.math.BigDecimal get_original_price() {
    return original_price;
  }
  public void set_original_price(java.math.BigDecimal original_price) {
    this.original_price = original_price;
  }
  public QueryResult with_original_price(java.math.BigDecimal original_price) {
    this.original_price = original_price;
    return this;
  }
  private java.math.BigDecimal total_offer;
  public java.math.BigDecimal get_total_offer() {
    return total_offer;
  }
  public void set_total_offer(java.math.BigDecimal total_offer) {
    this.total_offer = total_offer;
  }
  public QueryResult with_total_offer(java.math.BigDecimal total_offer) {
    this.total_offer = total_offer;
    return this;
  }
  private java.math.BigDecimal payable_money;
  public java.math.BigDecimal get_payable_money() {
    return payable_money;
  }
  public void set_payable_money(java.math.BigDecimal payable_money) {
    this.payable_money = payable_money;
  }
  public QueryResult with_payable_money(java.math.BigDecimal payable_money) {
    this.payable_money = payable_money;
    return this;
  }
  private java.math.BigDecimal real_money;
  public java.math.BigDecimal get_real_money() {
    return real_money;
  }
  public void set_real_money(java.math.BigDecimal real_money) {
    this.real_money = real_money;
  }
  public QueryResult with_real_money(java.math.BigDecimal real_money) {
    this.real_money = real_money;
    return this;
  }
  private java.math.BigDecimal delivery_fee;
  public java.math.BigDecimal get_delivery_fee() {
    return delivery_fee;
  }
  public void set_delivery_fee(java.math.BigDecimal delivery_fee) {
    this.delivery_fee = delivery_fee;
  }
  public QueryResult with_delivery_fee(java.math.BigDecimal delivery_fee) {
    this.delivery_fee = delivery_fee;
    return this;
  }
  private Integer status1;
  public Integer get_status1() {
    return status1;
  }
  public void set_status1(Integer status1) {
    this.status1 = status1;
  }
  public QueryResult with_status1(Integer status1) {
    this.status1 = status1;
    return this;
  }
  private Integer evaluate_status;
  public Integer get_evaluate_status() {
    return evaluate_status;
  }
  public void set_evaluate_status(Integer evaluate_status) {
    this.evaluate_status = evaluate_status;
  }
  public QueryResult with_evaluate_status(Integer evaluate_status) {
    this.evaluate_status = evaluate_status;
    return this;
  }
  private java.sql.Timestamp time;
  public java.sql.Timestamp get_time() {
    return time;
  }
  public void set_time(java.sql.Timestamp time) {
    this.time = time;
  }
  public QueryResult with_time(java.sql.Timestamp time) {
    this.time = time;
    return this;
  }
  private java.sql.Timestamp pay_time;
  public java.sql.Timestamp get_pay_time() {
    return pay_time;
  }
  public void set_pay_time(java.sql.Timestamp pay_time) {
    this.pay_time = pay_time;
  }
  public QueryResult with_pay_time(java.sql.Timestamp pay_time) {
    this.pay_time = pay_time;
    return this;
  }
  private java.sql.Timestamp estimated_arrival_time;
  public java.sql.Timestamp get_estimated_arrival_time() {
    return estimated_arrival_time;
  }
  public void set_estimated_arrival_time(java.sql.Timestamp estimated_arrival_time) {
    this.estimated_arrival_time = estimated_arrival_time;
  }
  public QueryResult with_estimated_arrival_time(java.sql.Timestamp estimated_arrival_time) {
    this.estimated_arrival_time = estimated_arrival_time;
    return this;
  }
  private String expected_receive_time;
  public String get_expected_receive_time() {
    return expected_receive_time;
  }
  public void set_expected_receive_time(String expected_receive_time) {
    this.expected_receive_time = expected_receive_time;
  }
  public QueryResult with_expected_receive_time(String expected_receive_time) {
    this.expected_receive_time = expected_receive_time;
    return this;
  }
  private java.sql.Timestamp early_receive_time;
  public java.sql.Timestamp get_early_receive_time() {
    return early_receive_time;
  }
  public void set_early_receive_time(java.sql.Timestamp early_receive_time) {
    this.early_receive_time = early_receive_time;
  }
  public QueryResult with_early_receive_time(java.sql.Timestamp early_receive_time) {
    this.early_receive_time = early_receive_time;
    return this;
  }
  private java.sql.Timestamp latest_receive_time;
  public java.sql.Timestamp get_latest_receive_time() {
    return latest_receive_time;
  }
  public void set_latest_receive_time(java.sql.Timestamp latest_receive_time) {
    this.latest_receive_time = latest_receive_time;
  }
  public QueryResult with_latest_receive_time(java.sql.Timestamp latest_receive_time) {
    this.latest_receive_time = latest_receive_time;
    return this;
  }
  private Integer immediate;
  public Integer get_immediate() {
    return immediate;
  }
  public void set_immediate(Integer immediate) {
    this.immediate = immediate;
  }
  public QueryResult with_immediate(Integer immediate) {
    this.immediate = immediate;
    return this;
  }
  private java.sql.Timestamp packed_time;
  public java.sql.Timestamp get_packed_time() {
    return packed_time;
  }
  public void set_packed_time(java.sql.Timestamp packed_time) {
    this.packed_time = packed_time;
  }
  public QueryResult with_packed_time(java.sql.Timestamp packed_time) {
    this.packed_time = packed_time;
    return this;
  }
  private java.sql.Timestamp allocate_rider_time;
  public java.sql.Timestamp get_allocate_rider_time() {
    return allocate_rider_time;
  }
  public void set_allocate_rider_time(java.sql.Timestamp allocate_rider_time) {
    this.allocate_rider_time = allocate_rider_time;
  }
  public QueryResult with_allocate_rider_time(java.sql.Timestamp allocate_rider_time) {
    this.allocate_rider_time = allocate_rider_time;
    return this;
  }
  private java.sql.Timestamp delivery_time;
  public java.sql.Timestamp get_delivery_time() {
    return delivery_time;
  }
  public void set_delivery_time(java.sql.Timestamp delivery_time) {
    this.delivery_time = delivery_time;
  }
  public QueryResult with_delivery_time(java.sql.Timestamp delivery_time) {
    this.delivery_time = delivery_time;
    return this;
  }
  private java.sql.Timestamp arrival_time;
  public java.sql.Timestamp get_arrival_time() {
    return arrival_time;
  }
  public void set_arrival_time(java.sql.Timestamp arrival_time) {
    this.arrival_time = arrival_time;
  }
  public QueryResult with_arrival_time(java.sql.Timestamp arrival_time) {
    this.arrival_time = arrival_time;
    return this;
  }
  private java.sql.Timestamp close_time;
  public java.sql.Timestamp get_close_time() {
    return close_time;
  }
  public void set_close_time(java.sql.Timestamp close_time) {
    this.close_time = close_time;
  }
  public QueryResult with_close_time(java.sql.Timestamp close_time) {
    this.close_time = close_time;
    return this;
  }
  private Long user_ticket_id;
  public Long get_user_ticket_id() {
    return user_ticket_id;
  }
  public void set_user_ticket_id(Long user_ticket_id) {
    this.user_ticket_id = user_ticket_id;
  }
  public QueryResult with_user_ticket_id(Long user_ticket_id) {
    this.user_ticket_id = user_ticket_id;
    return this;
  }
  private String client_ip;
  public String get_client_ip() {
    return client_ip;
  }
  public void set_client_ip(String client_ip) {
    this.client_ip = client_ip;
  }
  public QueryResult with_client_ip(String client_ip) {
    this.client_ip = client_ip;
    return this;
  }
  private Long delivery_third_id;
  public Long get_delivery_third_id() {
    return delivery_third_id;
  }
  public void set_delivery_third_id(Long delivery_third_id) {
    this.delivery_third_id = delivery_third_id;
  }
  public QueryResult with_delivery_third_id(Long delivery_third_id) {
    this.delivery_third_id = delivery_third_id;
    return this;
  }
  private Integer delivery_staff_id;
  public Integer get_delivery_staff_id() {
    return delivery_staff_id;
  }
  public void set_delivery_staff_id(Integer delivery_staff_id) {
    this.delivery_staff_id = delivery_staff_id;
  }
  public QueryResult with_delivery_staff_id(Integer delivery_staff_id) {
    this.delivery_staff_id = delivery_staff_id;
    return this;
  }
  private Long rider_uid;
  public Long get_rider_uid() {
    return rider_uid;
  }
  public void set_rider_uid(Long rider_uid) {
    this.rider_uid = rider_uid;
  }
  public QueryResult with_rider_uid(Long rider_uid) {
    this.rider_uid = rider_uid;
    return this;
  }
  private String platform;
  public String get_platform() {
    return platform;
  }
  public void set_platform(String platform) {
    this.platform = platform;
  }
  public QueryResult with_platform(String platform) {
    this.platform = platform;
    return this;
  }
  private Integer distance;
  public Integer get_distance() {
    return distance;
  }
  public void set_distance(Integer distance) {
    this.distance = distance;
  }
  public QueryResult with_distance(Integer distance) {
    this.distance = distance;
    return this;
  }
  private Integer ride_distance;
  public Integer get_ride_distance() {
    return ride_distance;
  }
  public void set_ride_distance(Integer ride_distance) {
    this.ride_distance = ride_distance;
  }
  public QueryResult with_ride_distance(Integer ride_distance) {
    this.ride_distance = ride_distance;
    return this;
  }
  private Integer balance_enable;
  public Integer get_balance_enable() {
    return balance_enable;
  }
  public void set_balance_enable(Integer balance_enable) {
    this.balance_enable = balance_enable;
  }
  public QueryResult with_balance_enable(Integer balance_enable) {
    this.balance_enable = balance_enable;
    return this;
  }
  private Long balance_uid;
  public Long get_balance_uid() {
    return balance_uid;
  }
  public void set_balance_uid(Long balance_uid) {
    this.balance_uid = balance_uid;
  }
  public QueryResult with_balance_uid(Long balance_uid) {
    this.balance_uid = balance_uid;
    return this;
  }
  private java.math.BigDecimal balance_payable;
  public java.math.BigDecimal get_balance_payable() {
    return balance_payable;
  }
  public void set_balance_payable(java.math.BigDecimal balance_payable) {
    this.balance_payable = balance_payable;
  }
  public QueryResult with_balance_payable(java.math.BigDecimal balance_payable) {
    this.balance_payable = balance_payable;
    return this;
  }
  private java.math.BigDecimal balance_real;
  public java.math.BigDecimal get_balance_real() {
    return balance_real;
  }
  public void set_balance_real(java.math.BigDecimal balance_real) {
    this.balance_real = balance_real;
  }
  public QueryResult with_balance_real(java.math.BigDecimal balance_real) {
    this.balance_real = balance_real;
    return this;
  }
  private java.math.BigDecimal personal_balance_real;
  public java.math.BigDecimal get_personal_balance_real() {
    return personal_balance_real;
  }
  public void set_personal_balance_real(java.math.BigDecimal personal_balance_real) {
    this.personal_balance_real = personal_balance_real;
  }
  public QueryResult with_personal_balance_real(java.math.BigDecimal personal_balance_real) {
    this.personal_balance_real = personal_balance_real;
    return this;
  }
  private java.math.BigDecimal company_balance_real;
  public java.math.BigDecimal get_company_balance_real() {
    return company_balance_real;
  }
  public void set_company_balance_real(java.math.BigDecimal company_balance_real) {
    this.company_balance_real = company_balance_real;
  }
  public QueryResult with_company_balance_real(java.math.BigDecimal company_balance_real) {
    this.company_balance_real = company_balance_real;
    return this;
  }
  private java.math.BigDecimal quota_balance_real;
  public java.math.BigDecimal get_quota_balance_real() {
    return quota_balance_real;
  }
  public void set_quota_balance_real(java.math.BigDecimal quota_balance_real) {
    this.quota_balance_real = quota_balance_real;
  }
  public QueryResult with_quota_balance_real(java.math.BigDecimal quota_balance_real) {
    this.quota_balance_real = quota_balance_real;
    return this;
  }
  private java.math.BigDecimal third_payable;
  public java.math.BigDecimal get_third_payable() {
    return third_payable;
  }
  public void set_third_payable(java.math.BigDecimal third_payable) {
    this.third_payable = third_payable;
  }
  public QueryResult with_third_payable(java.math.BigDecimal third_payable) {
    this.third_payable = third_payable;
    return this;
  }
  private java.math.BigDecimal third_real;
  public java.math.BigDecimal get_third_real() {
    return third_real;
  }
  public void set_third_real(java.math.BigDecimal third_real) {
    this.third_real = third_real;
  }
  public QueryResult with_third_real(java.math.BigDecimal third_real) {
    this.third_real = third_real;
    return this;
  }
  private Double start_longitude;
  public Double get_start_longitude() {
    return start_longitude;
  }
  public void set_start_longitude(Double start_longitude) {
    this.start_longitude = start_longitude;
  }
  public QueryResult with_start_longitude(Double start_longitude) {
    this.start_longitude = start_longitude;
    return this;
  }
  private Double start_latitude;
  public Double get_start_latitude() {
    return start_latitude;
  }
  public void set_start_latitude(Double start_latitude) {
    this.start_latitude = start_latitude;
  }
  public QueryResult with_start_latitude(Double start_latitude) {
    this.start_latitude = start_latitude;
    return this;
  }
  private Double arrival_longitude;
  public Double get_arrival_longitude() {
    return arrival_longitude;
  }
  public void set_arrival_longitude(Double arrival_longitude) {
    this.arrival_longitude = arrival_longitude;
  }
  public QueryResult with_arrival_longitude(Double arrival_longitude) {
    this.arrival_longitude = arrival_longitude;
    return this;
  }
  private Double arrival_latitude;
  public Double get_arrival_latitude() {
    return arrival_latitude;
  }
  public void set_arrival_latitude(Double arrival_latitude) {
    this.arrival_latitude = arrival_latitude;
  }
  public QueryResult with_arrival_latitude(Double arrival_latitude) {
    this.arrival_latitude = arrival_latitude;
    return this;
  }
  private Long family_id;
  public Long get_family_id() {
    return family_id;
  }
  public void set_family_id(Long family_id) {
    this.family_id = family_id;
  }
  public QueryResult with_family_id(Long family_id) {
    this.family_id = family_id;
    return this;
  }
  private String buyer_id;
  public String get_buyer_id() {
    return buyer_id;
  }
  public void set_buyer_id(String buyer_id) {
    this.buyer_id = buyer_id;
  }
  public QueryResult with_buyer_id(String buyer_id) {
    this.buyer_id = buyer_id;
    return this;
  }
  private Integer presale;
  public Integer get_presale() {
    return presale;
  }
  public void set_presale(Integer presale) {
    this.presale = presale;
  }
  public QueryResult with_presale(Integer presale) {
    this.presale = presale;
    return this;
  }
  private Integer login_type;
  public Integer get_login_type() {
    return login_type;
  }
  public void set_login_type(Integer login_type) {
    this.login_type = login_type;
  }
  public QueryResult with_login_type(Integer login_type) {
    this.login_type = login_type;
    return this;
  }
  private java.sql.Timestamp update_time;
  public java.sql.Timestamp get_update_time() {
    return update_time;
  }
  public void set_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }
  public QueryResult with_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.uid == null ? that.uid == null : this.uid.equals(that.uid));
    equal = equal && (this.repo_id == null ? that.repo_id == null : this.repo_id.equals(that.repo_id));
    equal = equal && (this.picker_name == null ? that.picker_name == null : this.picker_name.equals(that.picker_name));
    equal = equal && (this.picker_phone == null ? that.picker_phone == null : this.picker_phone.equals(that.picker_phone));
    equal = equal && (this.picker_addr == null ? that.picker_addr == null : this.picker_addr.equals(that.picker_addr));
    equal = equal && (this.picker_detail_addr == null ? that.picker_detail_addr == null : this.picker_detail_addr.equals(that.picker_detail_addr));
    equal = equal && (this.picker_longitude == null ? that.picker_longitude == null : this.picker_longitude.equals(that.picker_longitude));
    equal = equal && (this.picker_latitude == null ? that.picker_latitude == null : this.picker_latitude.equals(that.picker_latitude));
    equal = equal && (this.cp_order_id == null ? that.cp_order_id == null : this.cp_order_id.equals(that.cp_order_id));
    equal = equal && (this.unify_order_id == null ? that.unify_order_id == null : this.unify_order_id.equals(that.unify_order_id));
    equal = equal && (this.pay_type == null ? that.pay_type == null : this.pay_type.equals(that.pay_type));
    equal = equal && (this.mode == null ? that.mode == null : this.mode.equals(that.mode));
    equal = equal && (this.original_price == null ? that.original_price == null : this.original_price.equals(that.original_price));
    equal = equal && (this.total_offer == null ? that.total_offer == null : this.total_offer.equals(that.total_offer));
    equal = equal && (this.payable_money == null ? that.payable_money == null : this.payable_money.equals(that.payable_money));
    equal = equal && (this.real_money == null ? that.real_money == null : this.real_money.equals(that.real_money));
    equal = equal && (this.delivery_fee == null ? that.delivery_fee == null : this.delivery_fee.equals(that.delivery_fee));
    equal = equal && (this.status1 == null ? that.status1 == null : this.status1.equals(that.status1));
    equal = equal && (this.evaluate_status == null ? that.evaluate_status == null : this.evaluate_status.equals(that.evaluate_status));
    equal = equal && (this.time == null ? that.time == null : this.time.equals(that.time));
    equal = equal && (this.pay_time == null ? that.pay_time == null : this.pay_time.equals(that.pay_time));
    equal = equal && (this.estimated_arrival_time == null ? that.estimated_arrival_time == null : this.estimated_arrival_time.equals(that.estimated_arrival_time));
    equal = equal && (this.expected_receive_time == null ? that.expected_receive_time == null : this.expected_receive_time.equals(that.expected_receive_time));
    equal = equal && (this.early_receive_time == null ? that.early_receive_time == null : this.early_receive_time.equals(that.early_receive_time));
    equal = equal && (this.latest_receive_time == null ? that.latest_receive_time == null : this.latest_receive_time.equals(that.latest_receive_time));
    equal = equal && (this.immediate == null ? that.immediate == null : this.immediate.equals(that.immediate));
    equal = equal && (this.packed_time == null ? that.packed_time == null : this.packed_time.equals(that.packed_time));
    equal = equal && (this.allocate_rider_time == null ? that.allocate_rider_time == null : this.allocate_rider_time.equals(that.allocate_rider_time));
    equal = equal && (this.delivery_time == null ? that.delivery_time == null : this.delivery_time.equals(that.delivery_time));
    equal = equal && (this.arrival_time == null ? that.arrival_time == null : this.arrival_time.equals(that.arrival_time));
    equal = equal && (this.close_time == null ? that.close_time == null : this.close_time.equals(that.close_time));
    equal = equal && (this.user_ticket_id == null ? that.user_ticket_id == null : this.user_ticket_id.equals(that.user_ticket_id));
    equal = equal && (this.client_ip == null ? that.client_ip == null : this.client_ip.equals(that.client_ip));
    equal = equal && (this.delivery_third_id == null ? that.delivery_third_id == null : this.delivery_third_id.equals(that.delivery_third_id));
    equal = equal && (this.delivery_staff_id == null ? that.delivery_staff_id == null : this.delivery_staff_id.equals(that.delivery_staff_id));
    equal = equal && (this.rider_uid == null ? that.rider_uid == null : this.rider_uid.equals(that.rider_uid));
    equal = equal && (this.platform == null ? that.platform == null : this.platform.equals(that.platform));
    equal = equal && (this.distance == null ? that.distance == null : this.distance.equals(that.distance));
    equal = equal && (this.ride_distance == null ? that.ride_distance == null : this.ride_distance.equals(that.ride_distance));
    equal = equal && (this.balance_enable == null ? that.balance_enable == null : this.balance_enable.equals(that.balance_enable));
    equal = equal && (this.balance_uid == null ? that.balance_uid == null : this.balance_uid.equals(that.balance_uid));
    equal = equal && (this.balance_payable == null ? that.balance_payable == null : this.balance_payable.equals(that.balance_payable));
    equal = equal && (this.balance_real == null ? that.balance_real == null : this.balance_real.equals(that.balance_real));
    equal = equal && (this.personal_balance_real == null ? that.personal_balance_real == null : this.personal_balance_real.equals(that.personal_balance_real));
    equal = equal && (this.company_balance_real == null ? that.company_balance_real == null : this.company_balance_real.equals(that.company_balance_real));
    equal = equal && (this.quota_balance_real == null ? that.quota_balance_real == null : this.quota_balance_real.equals(that.quota_balance_real));
    equal = equal && (this.third_payable == null ? that.third_payable == null : this.third_payable.equals(that.third_payable));
    equal = equal && (this.third_real == null ? that.third_real == null : this.third_real.equals(that.third_real));
    equal = equal && (this.start_longitude == null ? that.start_longitude == null : this.start_longitude.equals(that.start_longitude));
    equal = equal && (this.start_latitude == null ? that.start_latitude == null : this.start_latitude.equals(that.start_latitude));
    equal = equal && (this.arrival_longitude == null ? that.arrival_longitude == null : this.arrival_longitude.equals(that.arrival_longitude));
    equal = equal && (this.arrival_latitude == null ? that.arrival_latitude == null : this.arrival_latitude.equals(that.arrival_latitude));
    equal = equal && (this.family_id == null ? that.family_id == null : this.family_id.equals(that.family_id));
    equal = equal && (this.buyer_id == null ? that.buyer_id == null : this.buyer_id.equals(that.buyer_id));
    equal = equal && (this.presale == null ? that.presale == null : this.presale.equals(that.presale));
    equal = equal && (this.login_type == null ? that.login_type == null : this.login_type.equals(that.login_type));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.uid == null ? that.uid == null : this.uid.equals(that.uid));
    equal = equal && (this.repo_id == null ? that.repo_id == null : this.repo_id.equals(that.repo_id));
    equal = equal && (this.picker_name == null ? that.picker_name == null : this.picker_name.equals(that.picker_name));
    equal = equal && (this.picker_phone == null ? that.picker_phone == null : this.picker_phone.equals(that.picker_phone));
    equal = equal && (this.picker_addr == null ? that.picker_addr == null : this.picker_addr.equals(that.picker_addr));
    equal = equal && (this.picker_detail_addr == null ? that.picker_detail_addr == null : this.picker_detail_addr.equals(that.picker_detail_addr));
    equal = equal && (this.picker_longitude == null ? that.picker_longitude == null : this.picker_longitude.equals(that.picker_longitude));
    equal = equal && (this.picker_latitude == null ? that.picker_latitude == null : this.picker_latitude.equals(that.picker_latitude));
    equal = equal && (this.cp_order_id == null ? that.cp_order_id == null : this.cp_order_id.equals(that.cp_order_id));
    equal = equal && (this.unify_order_id == null ? that.unify_order_id == null : this.unify_order_id.equals(that.unify_order_id));
    equal = equal && (this.pay_type == null ? that.pay_type == null : this.pay_type.equals(that.pay_type));
    equal = equal && (this.mode == null ? that.mode == null : this.mode.equals(that.mode));
    equal = equal && (this.original_price == null ? that.original_price == null : this.original_price.equals(that.original_price));
    equal = equal && (this.total_offer == null ? that.total_offer == null : this.total_offer.equals(that.total_offer));
    equal = equal && (this.payable_money == null ? that.payable_money == null : this.payable_money.equals(that.payable_money));
    equal = equal && (this.real_money == null ? that.real_money == null : this.real_money.equals(that.real_money));
    equal = equal && (this.delivery_fee == null ? that.delivery_fee == null : this.delivery_fee.equals(that.delivery_fee));
    equal = equal && (this.status1 == null ? that.status1 == null : this.status1.equals(that.status1));
    equal = equal && (this.evaluate_status == null ? that.evaluate_status == null : this.evaluate_status.equals(that.evaluate_status));
    equal = equal && (this.time == null ? that.time == null : this.time.equals(that.time));
    equal = equal && (this.pay_time == null ? that.pay_time == null : this.pay_time.equals(that.pay_time));
    equal = equal && (this.estimated_arrival_time == null ? that.estimated_arrival_time == null : this.estimated_arrival_time.equals(that.estimated_arrival_time));
    equal = equal && (this.expected_receive_time == null ? that.expected_receive_time == null : this.expected_receive_time.equals(that.expected_receive_time));
    equal = equal && (this.early_receive_time == null ? that.early_receive_time == null : this.early_receive_time.equals(that.early_receive_time));
    equal = equal && (this.latest_receive_time == null ? that.latest_receive_time == null : this.latest_receive_time.equals(that.latest_receive_time));
    equal = equal && (this.immediate == null ? that.immediate == null : this.immediate.equals(that.immediate));
    equal = equal && (this.packed_time == null ? that.packed_time == null : this.packed_time.equals(that.packed_time));
    equal = equal && (this.allocate_rider_time == null ? that.allocate_rider_time == null : this.allocate_rider_time.equals(that.allocate_rider_time));
    equal = equal && (this.delivery_time == null ? that.delivery_time == null : this.delivery_time.equals(that.delivery_time));
    equal = equal && (this.arrival_time == null ? that.arrival_time == null : this.arrival_time.equals(that.arrival_time));
    equal = equal && (this.close_time == null ? that.close_time == null : this.close_time.equals(that.close_time));
    equal = equal && (this.user_ticket_id == null ? that.user_ticket_id == null : this.user_ticket_id.equals(that.user_ticket_id));
    equal = equal && (this.client_ip == null ? that.client_ip == null : this.client_ip.equals(that.client_ip));
    equal = equal && (this.delivery_third_id == null ? that.delivery_third_id == null : this.delivery_third_id.equals(that.delivery_third_id));
    equal = equal && (this.delivery_staff_id == null ? that.delivery_staff_id == null : this.delivery_staff_id.equals(that.delivery_staff_id));
    equal = equal && (this.rider_uid == null ? that.rider_uid == null : this.rider_uid.equals(that.rider_uid));
    equal = equal && (this.platform == null ? that.platform == null : this.platform.equals(that.platform));
    equal = equal && (this.distance == null ? that.distance == null : this.distance.equals(that.distance));
    equal = equal && (this.ride_distance == null ? that.ride_distance == null : this.ride_distance.equals(that.ride_distance));
    equal = equal && (this.balance_enable == null ? that.balance_enable == null : this.balance_enable.equals(that.balance_enable));
    equal = equal && (this.balance_uid == null ? that.balance_uid == null : this.balance_uid.equals(that.balance_uid));
    equal = equal && (this.balance_payable == null ? that.balance_payable == null : this.balance_payable.equals(that.balance_payable));
    equal = equal && (this.balance_real == null ? that.balance_real == null : this.balance_real.equals(that.balance_real));
    equal = equal && (this.personal_balance_real == null ? that.personal_balance_real == null : this.personal_balance_real.equals(that.personal_balance_real));
    equal = equal && (this.company_balance_real == null ? that.company_balance_real == null : this.company_balance_real.equals(that.company_balance_real));
    equal = equal && (this.quota_balance_real == null ? that.quota_balance_real == null : this.quota_balance_real.equals(that.quota_balance_real));
    equal = equal && (this.third_payable == null ? that.third_payable == null : this.third_payable.equals(that.third_payable));
    equal = equal && (this.third_real == null ? that.third_real == null : this.third_real.equals(that.third_real));
    equal = equal && (this.start_longitude == null ? that.start_longitude == null : this.start_longitude.equals(that.start_longitude));
    equal = equal && (this.start_latitude == null ? that.start_latitude == null : this.start_latitude.equals(that.start_latitude));
    equal = equal && (this.arrival_longitude == null ? that.arrival_longitude == null : this.arrival_longitude.equals(that.arrival_longitude));
    equal = equal && (this.arrival_latitude == null ? that.arrival_latitude == null : this.arrival_latitude.equals(that.arrival_latitude));
    equal = equal && (this.family_id == null ? that.family_id == null : this.family_id.equals(that.family_id));
    equal = equal && (this.buyer_id == null ? that.buyer_id == null : this.buyer_id.equals(that.buyer_id));
    equal = equal && (this.presale == null ? that.presale == null : this.presale.equals(that.presale));
    equal = equal && (this.login_type == null ? that.login_type == null : this.login_type.equals(that.login_type));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.uid = JdbcWritableBridge.readLong(2, __dbResults);
    this.repo_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.picker_name = JdbcWritableBridge.readString(4, __dbResults);
    this.picker_phone = JdbcWritableBridge.readString(5, __dbResults);
    this.picker_addr = JdbcWritableBridge.readString(6, __dbResults);
    this.picker_detail_addr = JdbcWritableBridge.readString(7, __dbResults);
    this.picker_longitude = JdbcWritableBridge.readDouble(8, __dbResults);
    this.picker_latitude = JdbcWritableBridge.readDouble(9, __dbResults);
    this.cp_order_id = JdbcWritableBridge.readString(10, __dbResults);
    this.unify_order_id = JdbcWritableBridge.readString(11, __dbResults);
    this.pay_type = JdbcWritableBridge.readInteger(12, __dbResults);
    this.mode = JdbcWritableBridge.readInteger(13, __dbResults);
    this.original_price = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.total_offer = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.payable_money = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.real_money = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.delivery_fee = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.status1 = JdbcWritableBridge.readInteger(19, __dbResults);
    this.evaluate_status = JdbcWritableBridge.readInteger(20, __dbResults);
    this.time = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.pay_time = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.estimated_arrival_time = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.expected_receive_time = JdbcWritableBridge.readString(24, __dbResults);
    this.early_receive_time = JdbcWritableBridge.readTimestamp(25, __dbResults);
    this.latest_receive_time = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.immediate = JdbcWritableBridge.readInteger(27, __dbResults);
    this.packed_time = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.allocate_rider_time = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.delivery_time = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.arrival_time = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.close_time = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.user_ticket_id = JdbcWritableBridge.readLong(33, __dbResults);
    this.client_ip = JdbcWritableBridge.readString(34, __dbResults);
    this.delivery_third_id = JdbcWritableBridge.readLong(35, __dbResults);
    this.delivery_staff_id = JdbcWritableBridge.readInteger(36, __dbResults);
    this.rider_uid = JdbcWritableBridge.readLong(37, __dbResults);
    this.platform = JdbcWritableBridge.readString(38, __dbResults);
    this.distance = JdbcWritableBridge.readInteger(39, __dbResults);
    this.ride_distance = JdbcWritableBridge.readInteger(40, __dbResults);
    this.balance_enable = JdbcWritableBridge.readInteger(41, __dbResults);
    this.balance_uid = JdbcWritableBridge.readLong(42, __dbResults);
    this.balance_payable = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.balance_real = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.personal_balance_real = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.company_balance_real = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.quota_balance_real = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.third_payable = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.third_real = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.start_longitude = JdbcWritableBridge.readDouble(50, __dbResults);
    this.start_latitude = JdbcWritableBridge.readDouble(51, __dbResults);
    this.arrival_longitude = JdbcWritableBridge.readDouble(52, __dbResults);
    this.arrival_latitude = JdbcWritableBridge.readDouble(53, __dbResults);
    this.family_id = JdbcWritableBridge.readLong(54, __dbResults);
    this.buyer_id = JdbcWritableBridge.readString(55, __dbResults);
    this.presale = JdbcWritableBridge.readInteger(56, __dbResults);
    this.login_type = JdbcWritableBridge.readInteger(57, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(58, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.uid = JdbcWritableBridge.readLong(2, __dbResults);
    this.repo_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.picker_name = JdbcWritableBridge.readString(4, __dbResults);
    this.picker_phone = JdbcWritableBridge.readString(5, __dbResults);
    this.picker_addr = JdbcWritableBridge.readString(6, __dbResults);
    this.picker_detail_addr = JdbcWritableBridge.readString(7, __dbResults);
    this.picker_longitude = JdbcWritableBridge.readDouble(8, __dbResults);
    this.picker_latitude = JdbcWritableBridge.readDouble(9, __dbResults);
    this.cp_order_id = JdbcWritableBridge.readString(10, __dbResults);
    this.unify_order_id = JdbcWritableBridge.readString(11, __dbResults);
    this.pay_type = JdbcWritableBridge.readInteger(12, __dbResults);
    this.mode = JdbcWritableBridge.readInteger(13, __dbResults);
    this.original_price = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.total_offer = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.payable_money = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.real_money = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.delivery_fee = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.status1 = JdbcWritableBridge.readInteger(19, __dbResults);
    this.evaluate_status = JdbcWritableBridge.readInteger(20, __dbResults);
    this.time = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.pay_time = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.estimated_arrival_time = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.expected_receive_time = JdbcWritableBridge.readString(24, __dbResults);
    this.early_receive_time = JdbcWritableBridge.readTimestamp(25, __dbResults);
    this.latest_receive_time = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.immediate = JdbcWritableBridge.readInteger(27, __dbResults);
    this.packed_time = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.allocate_rider_time = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.delivery_time = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.arrival_time = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.close_time = JdbcWritableBridge.readTimestamp(32, __dbResults);
    this.user_ticket_id = JdbcWritableBridge.readLong(33, __dbResults);
    this.client_ip = JdbcWritableBridge.readString(34, __dbResults);
    this.delivery_third_id = JdbcWritableBridge.readLong(35, __dbResults);
    this.delivery_staff_id = JdbcWritableBridge.readInteger(36, __dbResults);
    this.rider_uid = JdbcWritableBridge.readLong(37, __dbResults);
    this.platform = JdbcWritableBridge.readString(38, __dbResults);
    this.distance = JdbcWritableBridge.readInteger(39, __dbResults);
    this.ride_distance = JdbcWritableBridge.readInteger(40, __dbResults);
    this.balance_enable = JdbcWritableBridge.readInteger(41, __dbResults);
    this.balance_uid = JdbcWritableBridge.readLong(42, __dbResults);
    this.balance_payable = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.balance_real = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.personal_balance_real = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.company_balance_real = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.quota_balance_real = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.third_payable = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.third_real = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.start_longitude = JdbcWritableBridge.readDouble(50, __dbResults);
    this.start_latitude = JdbcWritableBridge.readDouble(51, __dbResults);
    this.arrival_longitude = JdbcWritableBridge.readDouble(52, __dbResults);
    this.arrival_latitude = JdbcWritableBridge.readDouble(53, __dbResults);
    this.family_id = JdbcWritableBridge.readLong(54, __dbResults);
    this.buyer_id = JdbcWritableBridge.readString(55, __dbResults);
    this.presale = JdbcWritableBridge.readInteger(56, __dbResults);
    this.login_type = JdbcWritableBridge.readInteger(57, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(58, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(uid, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(repo_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(picker_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(picker_phone, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(picker_addr, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(picker_detail_addr, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(picker_longitude, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(picker_latitude, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(cp_order_id, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(unify_order_id, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(pay_type, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(mode, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(original_price, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(total_offer, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(payable_money, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(real_money, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(delivery_fee, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(status1, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(evaluate_status, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(time, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(pay_time, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(estimated_arrival_time, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(expected_receive_time, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(early_receive_time, 25 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(latest_receive_time, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(immediate, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(packed_time, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(allocate_rider_time, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(delivery_time, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(arrival_time, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(close_time, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(user_ticket_id, 33 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(client_ip, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(delivery_third_id, 35 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(delivery_staff_id, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(rider_uid, 37 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(platform, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(distance, 39 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ride_distance, 40 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(balance_enable, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(balance_uid, 42 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(balance_payable, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(balance_real, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(personal_balance_real, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(company_balance_real, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(quota_balance_real, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(third_payable, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(third_real, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(start_longitude, 50 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(start_latitude, 51 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(arrival_longitude, 52 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(arrival_latitude, 53 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(family_id, 54 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(buyer_id, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(presale, 56 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(login_type, 57 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 58 + __off, 93, __dbStmt);
    return 58;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(uid, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(repo_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(picker_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(picker_phone, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(picker_addr, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(picker_detail_addr, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(picker_longitude, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(picker_latitude, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(cp_order_id, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(unify_order_id, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(pay_type, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(mode, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(original_price, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(total_offer, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(payable_money, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(real_money, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(delivery_fee, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(status1, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(evaluate_status, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(time, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(pay_time, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(estimated_arrival_time, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(expected_receive_time, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(early_receive_time, 25 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(latest_receive_time, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(immediate, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(packed_time, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(allocate_rider_time, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(delivery_time, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(arrival_time, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(close_time, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(user_ticket_id, 33 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(client_ip, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(delivery_third_id, 35 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(delivery_staff_id, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(rider_uid, 37 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(platform, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(distance, 39 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ride_distance, 40 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(balance_enable, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(balance_uid, 42 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(balance_payable, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(balance_real, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(personal_balance_real, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(company_balance_real, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(quota_balance_real, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(third_payable, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(third_real, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(start_longitude, 50 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(start_latitude, 51 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(arrival_longitude, 52 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(arrival_latitude, 53 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(family_id, 54 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(buyer_id, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(presale, 56 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(login_type, 57 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 58 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.uid = null;
    } else {
    this.uid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.repo_id = null;
    } else {
    this.repo_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.picker_name = null;
    } else {
    this.picker_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.picker_phone = null;
    } else {
    this.picker_phone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.picker_addr = null;
    } else {
    this.picker_addr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.picker_detail_addr = null;
    } else {
    this.picker_detail_addr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.picker_longitude = null;
    } else {
    this.picker_longitude = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.picker_latitude = null;
    } else {
    this.picker_latitude = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.cp_order_id = null;
    } else {
    this.cp_order_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.unify_order_id = null;
    } else {
    this.unify_order_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pay_type = null;
    } else {
    this.pay_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.mode = null;
    } else {
    this.mode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.original_price = null;
    } else {
    this.original_price = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.total_offer = null;
    } else {
    this.total_offer = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.payable_money = null;
    } else {
    this.payable_money = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.real_money = null;
    } else {
    this.real_money = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.delivery_fee = null;
    } else {
    this.delivery_fee = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status1 = null;
    } else {
    this.status1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.evaluate_status = null;
    } else {
    this.evaluate_status = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.time = null;
    } else {
    this.time = new Timestamp(__dataIn.readLong());
    this.time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pay_time = null;
    } else {
    this.pay_time = new Timestamp(__dataIn.readLong());
    this.pay_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.estimated_arrival_time = null;
    } else {
    this.estimated_arrival_time = new Timestamp(__dataIn.readLong());
    this.estimated_arrival_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.expected_receive_time = null;
    } else {
    this.expected_receive_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.early_receive_time = null;
    } else {
    this.early_receive_time = new Timestamp(__dataIn.readLong());
    this.early_receive_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.latest_receive_time = null;
    } else {
    this.latest_receive_time = new Timestamp(__dataIn.readLong());
    this.latest_receive_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.immediate = null;
    } else {
    this.immediate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.packed_time = null;
    } else {
    this.packed_time = new Timestamp(__dataIn.readLong());
    this.packed_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.allocate_rider_time = null;
    } else {
    this.allocate_rider_time = new Timestamp(__dataIn.readLong());
    this.allocate_rider_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.delivery_time = null;
    } else {
    this.delivery_time = new Timestamp(__dataIn.readLong());
    this.delivery_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.arrival_time = null;
    } else {
    this.arrival_time = new Timestamp(__dataIn.readLong());
    this.arrival_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.close_time = null;
    } else {
    this.close_time = new Timestamp(__dataIn.readLong());
    this.close_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_ticket_id = null;
    } else {
    this.user_ticket_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.client_ip = null;
    } else {
    this.client_ip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.delivery_third_id = null;
    } else {
    this.delivery_third_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.delivery_staff_id = null;
    } else {
    this.delivery_staff_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.rider_uid = null;
    } else {
    this.rider_uid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.platform = null;
    } else {
    this.platform = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.distance = null;
    } else {
    this.distance = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ride_distance = null;
    } else {
    this.ride_distance = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.balance_enable = null;
    } else {
    this.balance_enable = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.balance_uid = null;
    } else {
    this.balance_uid = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.balance_payable = null;
    } else {
    this.balance_payable = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.balance_real = null;
    } else {
    this.balance_real = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.personal_balance_real = null;
    } else {
    this.personal_balance_real = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.company_balance_real = null;
    } else {
    this.company_balance_real = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.quota_balance_real = null;
    } else {
    this.quota_balance_real = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.third_payable = null;
    } else {
    this.third_payable = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.third_real = null;
    } else {
    this.third_real = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.start_longitude = null;
    } else {
    this.start_longitude = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.start_latitude = null;
    } else {
    this.start_latitude = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.arrival_longitude = null;
    } else {
    this.arrival_longitude = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.arrival_latitude = null;
    } else {
    this.arrival_latitude = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.family_id = null;
    } else {
    this.family_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.buyer_id = null;
    } else {
    this.buyer_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.presale = null;
    } else {
    this.presale = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.login_type = null;
    } else {
    this.login_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.update_time = null;
    } else {
    this.update_time = new Timestamp(__dataIn.readLong());
    this.update_time.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.uid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.uid);
    }
    if (null == this.repo_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.repo_id);
    }
    if (null == this.picker_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picker_name);
    }
    if (null == this.picker_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picker_phone);
    }
    if (null == this.picker_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picker_addr);
    }
    if (null == this.picker_detail_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picker_detail_addr);
    }
    if (null == this.picker_longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.picker_longitude);
    }
    if (null == this.picker_latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.picker_latitude);
    }
    if (null == this.cp_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cp_order_id);
    }
    if (null == this.unify_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, unify_order_id);
    }
    if (null == this.pay_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pay_type);
    }
    if (null == this.mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mode);
    }
    if (null == this.original_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.original_price, __dataOut);
    }
    if (null == this.total_offer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.total_offer, __dataOut);
    }
    if (null == this.payable_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.payable_money, __dataOut);
    }
    if (null == this.real_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.real_money, __dataOut);
    }
    if (null == this.delivery_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.delivery_fee, __dataOut);
    }
    if (null == this.status1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.status1);
    }
    if (null == this.evaluate_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.evaluate_status);
    }
    if (null == this.time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.time.getTime());
    __dataOut.writeInt(this.time.getNanos());
    }
    if (null == this.pay_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pay_time.getTime());
    __dataOut.writeInt(this.pay_time.getNanos());
    }
    if (null == this.estimated_arrival_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.estimated_arrival_time.getTime());
    __dataOut.writeInt(this.estimated_arrival_time.getNanos());
    }
    if (null == this.expected_receive_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, expected_receive_time);
    }
    if (null == this.early_receive_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.early_receive_time.getTime());
    __dataOut.writeInt(this.early_receive_time.getNanos());
    }
    if (null == this.latest_receive_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.latest_receive_time.getTime());
    __dataOut.writeInt(this.latest_receive_time.getNanos());
    }
    if (null == this.immediate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.immediate);
    }
    if (null == this.packed_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.packed_time.getTime());
    __dataOut.writeInt(this.packed_time.getNanos());
    }
    if (null == this.allocate_rider_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.allocate_rider_time.getTime());
    __dataOut.writeInt(this.allocate_rider_time.getNanos());
    }
    if (null == this.delivery_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.delivery_time.getTime());
    __dataOut.writeInt(this.delivery_time.getNanos());
    }
    if (null == this.arrival_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.arrival_time.getTime());
    __dataOut.writeInt(this.arrival_time.getNanos());
    }
    if (null == this.close_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.close_time.getTime());
    __dataOut.writeInt(this.close_time.getNanos());
    }
    if (null == this.user_ticket_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_ticket_id);
    }
    if (null == this.client_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, client_ip);
    }
    if (null == this.delivery_third_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.delivery_third_id);
    }
    if (null == this.delivery_staff_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.delivery_staff_id);
    }
    if (null == this.rider_uid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.rider_uid);
    }
    if (null == this.platform) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platform);
    }
    if (null == this.distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.distance);
    }
    if (null == this.ride_distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ride_distance);
    }
    if (null == this.balance_enable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.balance_enable);
    }
    if (null == this.balance_uid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.balance_uid);
    }
    if (null == this.balance_payable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.balance_payable, __dataOut);
    }
    if (null == this.balance_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.balance_real, __dataOut);
    }
    if (null == this.personal_balance_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.personal_balance_real, __dataOut);
    }
    if (null == this.company_balance_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.company_balance_real, __dataOut);
    }
    if (null == this.quota_balance_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.quota_balance_real, __dataOut);
    }
    if (null == this.third_payable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.third_payable, __dataOut);
    }
    if (null == this.third_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.third_real, __dataOut);
    }
    if (null == this.start_longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.start_longitude);
    }
    if (null == this.start_latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.start_latitude);
    }
    if (null == this.arrival_longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.arrival_longitude);
    }
    if (null == this.arrival_latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.arrival_latitude);
    }
    if (null == this.family_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.family_id);
    }
    if (null == this.buyer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buyer_id);
    }
    if (null == this.presale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.presale);
    }
    if (null == this.login_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.login_type);
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.uid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.uid);
    }
    if (null == this.repo_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.repo_id);
    }
    if (null == this.picker_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picker_name);
    }
    if (null == this.picker_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picker_phone);
    }
    if (null == this.picker_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picker_addr);
    }
    if (null == this.picker_detail_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, picker_detail_addr);
    }
    if (null == this.picker_longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.picker_longitude);
    }
    if (null == this.picker_latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.picker_latitude);
    }
    if (null == this.cp_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cp_order_id);
    }
    if (null == this.unify_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, unify_order_id);
    }
    if (null == this.pay_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.pay_type);
    }
    if (null == this.mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mode);
    }
    if (null == this.original_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.original_price, __dataOut);
    }
    if (null == this.total_offer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.total_offer, __dataOut);
    }
    if (null == this.payable_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.payable_money, __dataOut);
    }
    if (null == this.real_money) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.real_money, __dataOut);
    }
    if (null == this.delivery_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.delivery_fee, __dataOut);
    }
    if (null == this.status1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.status1);
    }
    if (null == this.evaluate_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.evaluate_status);
    }
    if (null == this.time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.time.getTime());
    __dataOut.writeInt(this.time.getNanos());
    }
    if (null == this.pay_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pay_time.getTime());
    __dataOut.writeInt(this.pay_time.getNanos());
    }
    if (null == this.estimated_arrival_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.estimated_arrival_time.getTime());
    __dataOut.writeInt(this.estimated_arrival_time.getNanos());
    }
    if (null == this.expected_receive_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, expected_receive_time);
    }
    if (null == this.early_receive_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.early_receive_time.getTime());
    __dataOut.writeInt(this.early_receive_time.getNanos());
    }
    if (null == this.latest_receive_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.latest_receive_time.getTime());
    __dataOut.writeInt(this.latest_receive_time.getNanos());
    }
    if (null == this.immediate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.immediate);
    }
    if (null == this.packed_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.packed_time.getTime());
    __dataOut.writeInt(this.packed_time.getNanos());
    }
    if (null == this.allocate_rider_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.allocate_rider_time.getTime());
    __dataOut.writeInt(this.allocate_rider_time.getNanos());
    }
    if (null == this.delivery_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.delivery_time.getTime());
    __dataOut.writeInt(this.delivery_time.getNanos());
    }
    if (null == this.arrival_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.arrival_time.getTime());
    __dataOut.writeInt(this.arrival_time.getNanos());
    }
    if (null == this.close_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.close_time.getTime());
    __dataOut.writeInt(this.close_time.getNanos());
    }
    if (null == this.user_ticket_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.user_ticket_id);
    }
    if (null == this.client_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, client_ip);
    }
    if (null == this.delivery_third_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.delivery_third_id);
    }
    if (null == this.delivery_staff_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.delivery_staff_id);
    }
    if (null == this.rider_uid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.rider_uid);
    }
    if (null == this.platform) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platform);
    }
    if (null == this.distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.distance);
    }
    if (null == this.ride_distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ride_distance);
    }
    if (null == this.balance_enable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.balance_enable);
    }
    if (null == this.balance_uid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.balance_uid);
    }
    if (null == this.balance_payable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.balance_payable, __dataOut);
    }
    if (null == this.balance_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.balance_real, __dataOut);
    }
    if (null == this.personal_balance_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.personal_balance_real, __dataOut);
    }
    if (null == this.company_balance_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.company_balance_real, __dataOut);
    }
    if (null == this.quota_balance_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.quota_balance_real, __dataOut);
    }
    if (null == this.third_payable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.third_payable, __dataOut);
    }
    if (null == this.third_real) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.third_real, __dataOut);
    }
    if (null == this.start_longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.start_longitude);
    }
    if (null == this.start_latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.start_latitude);
    }
    if (null == this.arrival_longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.arrival_longitude);
    }
    if (null == this.arrival_latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.arrival_latitude);
    }
    if (null == this.family_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.family_id);
    }
    if (null == this.buyer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, buyer_id);
    }
    if (null == this.presale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.presale);
    }
    if (null == this.login_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.login_type);
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"\\N":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(uid==null?"\\N":"" + uid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(repo_id==null?"\\N":"" + repo_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(picker_name==null?"\\N":picker_name, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(picker_phone==null?"\\N":picker_phone, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(picker_addr==null?"\\N":picker_addr, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(picker_detail_addr==null?"\\N":picker_detail_addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(picker_longitude==null?"\\N":"" + picker_longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(picker_latitude==null?"\\N":"" + picker_latitude, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(cp_order_id==null?"\\N":cp_order_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(unify_order_id==null?"\\N":unify_order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_type==null?"\\N":"" + pay_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mode==null?"\\N":"" + mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(original_price==null?"\\N":original_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_offer==null?"\\N":total_offer.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payable_money==null?"\\N":payable_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(real_money==null?"\\N":real_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery_fee==null?"\\N":delivery_fee.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status1==null?"\\N":"" + status1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(evaluate_status==null?"\\N":"" + evaluate_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time==null?"\\N":"" + time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_time==null?"\\N":"" + pay_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estimated_arrival_time==null?"\\N":"" + estimated_arrival_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(expected_receive_time==null?"\\N":expected_receive_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(early_receive_time==null?"\\N":"" + early_receive_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latest_receive_time==null?"\\N":"" + latest_receive_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(immediate==null?"\\N":"" + immediate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(packed_time==null?"\\N":"" + packed_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(allocate_rider_time==null?"\\N":"" + allocate_rider_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery_time==null?"\\N":"" + delivery_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_time==null?"\\N":"" + arrival_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(close_time==null?"\\N":"" + close_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ticket_id==null?"\\N":"" + user_ticket_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(client_ip==null?"\\N":client_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery_third_id==null?"\\N":"" + delivery_third_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery_staff_id==null?"\\N":"" + delivery_staff_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rider_uid==null?"\\N":"" + rider_uid, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(platform==null?"\\N":platform, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(distance==null?"\\N":"" + distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ride_distance==null?"\\N":"" + ride_distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_enable==null?"\\N":"" + balance_enable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_uid==null?"\\N":"" + balance_uid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_payable==null?"\\N":balance_payable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_real==null?"\\N":balance_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personal_balance_real==null?"\\N":personal_balance_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_balance_real==null?"\\N":company_balance_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quota_balance_real==null?"\\N":quota_balance_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(third_payable==null?"\\N":third_payable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(third_real==null?"\\N":third_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_longitude==null?"\\N":"" + start_longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_latitude==null?"\\N":"" + start_latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_longitude==null?"\\N":"" + arrival_longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_latitude==null?"\\N":"" + arrival_latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(family_id==null?"\\N":"" + family_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(buyer_id==null?"\\N":buyer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(presale==null?"\\N":"" + presale, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(login_type==null?"\\N":"" + login_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"\\N":"" + update_time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"\\N":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(uid==null?"\\N":"" + uid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(repo_id==null?"\\N":"" + repo_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(picker_name==null?"\\N":picker_name, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(picker_phone==null?"\\N":picker_phone, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(picker_addr==null?"\\N":picker_addr, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(picker_detail_addr==null?"\\N":picker_detail_addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(picker_longitude==null?"\\N":"" + picker_longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(picker_latitude==null?"\\N":"" + picker_latitude, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(cp_order_id==null?"\\N":cp_order_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(unify_order_id==null?"\\N":unify_order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_type==null?"\\N":"" + pay_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mode==null?"\\N":"" + mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(original_price==null?"\\N":original_price.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_offer==null?"\\N":total_offer.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payable_money==null?"\\N":payable_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(real_money==null?"\\N":real_money.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery_fee==null?"\\N":delivery_fee.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status1==null?"\\N":"" + status1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(evaluate_status==null?"\\N":"" + evaluate_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time==null?"\\N":"" + time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pay_time==null?"\\N":"" + pay_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estimated_arrival_time==null?"\\N":"" + estimated_arrival_time, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(expected_receive_time==null?"\\N":expected_receive_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(early_receive_time==null?"\\N":"" + early_receive_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latest_receive_time==null?"\\N":"" + latest_receive_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(immediate==null?"\\N":"" + immediate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(packed_time==null?"\\N":"" + packed_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(allocate_rider_time==null?"\\N":"" + allocate_rider_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery_time==null?"\\N":"" + delivery_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_time==null?"\\N":"" + arrival_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(close_time==null?"\\N":"" + close_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_ticket_id==null?"\\N":"" + user_ticket_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(client_ip==null?"\\N":client_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery_third_id==null?"\\N":"" + delivery_third_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery_staff_id==null?"\\N":"" + delivery_staff_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rider_uid==null?"\\N":"" + rider_uid, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(platform==null?"\\N":platform, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(distance==null?"\\N":"" + distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ride_distance==null?"\\N":"" + ride_distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_enable==null?"\\N":"" + balance_enable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_uid==null?"\\N":"" + balance_uid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_payable==null?"\\N":balance_payable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balance_real==null?"\\N":balance_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personal_balance_real==null?"\\N":personal_balance_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_balance_real==null?"\\N":company_balance_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quota_balance_real==null?"\\N":quota_balance_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(third_payable==null?"\\N":third_payable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(third_real==null?"\\N":third_real.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_longitude==null?"\\N":"" + start_longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_latitude==null?"\\N":"" + start_latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_longitude==null?"\\N":"" + arrival_longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_latitude==null?"\\N":"" + arrival_latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(family_id==null?"\\N":"" + family_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(buyer_id==null?"\\N":buyer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(presale==null?"\\N":"" + presale, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(login_type==null?"\\N":"" + login_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"\\N":"" + update_time, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.uid = null; } else {
      this.uid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.repo_id = null; } else {
      this.repo_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.picker_name = null; } else {
      this.picker_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.picker_phone = null; } else {
      this.picker_phone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.picker_addr = null; } else {
      this.picker_addr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.picker_detail_addr = null; } else {
      this.picker_detail_addr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.picker_longitude = null; } else {
      this.picker_longitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.picker_latitude = null; } else {
      this.picker_latitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cp_order_id = null; } else {
      this.cp_order_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.unify_order_id = null; } else {
      this.unify_order_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_type = null; } else {
      this.pay_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mode = null; } else {
      this.mode = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.original_price = null; } else {
      this.original_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_offer = null; } else {
      this.total_offer = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payable_money = null; } else {
      this.payable_money = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.real_money = null; } else {
      this.real_money = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery_fee = null; } else {
      this.delivery_fee = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.status1 = null; } else {
      this.status1 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.evaluate_status = null; } else {
      this.evaluate_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.time = null; } else {
      this.time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_time = null; } else {
      this.pay_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estimated_arrival_time = null; } else {
      this.estimated_arrival_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.expected_receive_time = null; } else {
      this.expected_receive_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.early_receive_time = null; } else {
      this.early_receive_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latest_receive_time = null; } else {
      this.latest_receive_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.immediate = null; } else {
      this.immediate = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.packed_time = null; } else {
      this.packed_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.allocate_rider_time = null; } else {
      this.allocate_rider_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery_time = null; } else {
      this.delivery_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arrival_time = null; } else {
      this.arrival_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.close_time = null; } else {
      this.close_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_ticket_id = null; } else {
      this.user_ticket_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.client_ip = null; } else {
      this.client_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery_third_id = null; } else {
      this.delivery_third_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery_staff_id = null; } else {
      this.delivery_staff_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rider_uid = null; } else {
      this.rider_uid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platform = null; } else {
      this.platform = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.distance = null; } else {
      this.distance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ride_distance = null; } else {
      this.ride_distance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balance_enable = null; } else {
      this.balance_enable = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balance_uid = null; } else {
      this.balance_uid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balance_payable = null; } else {
      this.balance_payable = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balance_real = null; } else {
      this.balance_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.personal_balance_real = null; } else {
      this.personal_balance_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.company_balance_real = null; } else {
      this.company_balance_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quota_balance_real = null; } else {
      this.quota_balance_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.third_payable = null; } else {
      this.third_payable = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.third_real = null; } else {
      this.third_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_longitude = null; } else {
      this.start_longitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_latitude = null; } else {
      this.start_latitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arrival_longitude = null; } else {
      this.arrival_longitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arrival_latitude = null; } else {
      this.arrival_latitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.family_id = null; } else {
      this.family_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.buyer_id = null; } else {
      this.buyer_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.presale = null; } else {
      this.presale = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.login_type = null; } else {
      this.login_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.uid = null; } else {
      this.uid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.repo_id = null; } else {
      this.repo_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.picker_name = null; } else {
      this.picker_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.picker_phone = null; } else {
      this.picker_phone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.picker_addr = null; } else {
      this.picker_addr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.picker_detail_addr = null; } else {
      this.picker_detail_addr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.picker_longitude = null; } else {
      this.picker_longitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.picker_latitude = null; } else {
      this.picker_latitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cp_order_id = null; } else {
      this.cp_order_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.unify_order_id = null; } else {
      this.unify_order_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_type = null; } else {
      this.pay_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mode = null; } else {
      this.mode = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.original_price = null; } else {
      this.original_price = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_offer = null; } else {
      this.total_offer = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payable_money = null; } else {
      this.payable_money = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.real_money = null; } else {
      this.real_money = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery_fee = null; } else {
      this.delivery_fee = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.status1 = null; } else {
      this.status1 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.evaluate_status = null; } else {
      this.evaluate_status = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.time = null; } else {
      this.time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pay_time = null; } else {
      this.pay_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estimated_arrival_time = null; } else {
      this.estimated_arrival_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.expected_receive_time = null; } else {
      this.expected_receive_time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.early_receive_time = null; } else {
      this.early_receive_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latest_receive_time = null; } else {
      this.latest_receive_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.immediate = null; } else {
      this.immediate = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.packed_time = null; } else {
      this.packed_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.allocate_rider_time = null; } else {
      this.allocate_rider_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery_time = null; } else {
      this.delivery_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arrival_time = null; } else {
      this.arrival_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.close_time = null; } else {
      this.close_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_ticket_id = null; } else {
      this.user_ticket_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.client_ip = null; } else {
      this.client_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery_third_id = null; } else {
      this.delivery_third_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery_staff_id = null; } else {
      this.delivery_staff_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rider_uid = null; } else {
      this.rider_uid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platform = null; } else {
      this.platform = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.distance = null; } else {
      this.distance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ride_distance = null; } else {
      this.ride_distance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balance_enable = null; } else {
      this.balance_enable = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balance_uid = null; } else {
      this.balance_uid = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balance_payable = null; } else {
      this.balance_payable = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.balance_real = null; } else {
      this.balance_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.personal_balance_real = null; } else {
      this.personal_balance_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.company_balance_real = null; } else {
      this.company_balance_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quota_balance_real = null; } else {
      this.quota_balance_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.third_payable = null; } else {
      this.third_payable = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.third_real = null; } else {
      this.third_real = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_longitude = null; } else {
      this.start_longitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_latitude = null; } else {
      this.start_latitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arrival_longitude = null; } else {
      this.arrival_longitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arrival_latitude = null; } else {
      this.arrival_latitude = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.family_id = null; } else {
      this.family_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.buyer_id = null; } else {
      this.buyer_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.presale = null; } else {
      this.presale = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.login_type = null; } else {
      this.login_type = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.time = (o.time != null) ? (java.sql.Timestamp) o.time.clone() : null;
    o.pay_time = (o.pay_time != null) ? (java.sql.Timestamp) o.pay_time.clone() : null;
    o.estimated_arrival_time = (o.estimated_arrival_time != null) ? (java.sql.Timestamp) o.estimated_arrival_time.clone() : null;
    o.early_receive_time = (o.early_receive_time != null) ? (java.sql.Timestamp) o.early_receive_time.clone() : null;
    o.latest_receive_time = (o.latest_receive_time != null) ? (java.sql.Timestamp) o.latest_receive_time.clone() : null;
    o.packed_time = (o.packed_time != null) ? (java.sql.Timestamp) o.packed_time.clone() : null;
    o.allocate_rider_time = (o.allocate_rider_time != null) ? (java.sql.Timestamp) o.allocate_rider_time.clone() : null;
    o.delivery_time = (o.delivery_time != null) ? (java.sql.Timestamp) o.delivery_time.clone() : null;
    o.arrival_time = (o.arrival_time != null) ? (java.sql.Timestamp) o.arrival_time.clone() : null;
    o.close_time = (o.close_time != null) ? (java.sql.Timestamp) o.close_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.time = (o.time != null) ? (java.sql.Timestamp) o.time.clone() : null;
    o.pay_time = (o.pay_time != null) ? (java.sql.Timestamp) o.pay_time.clone() : null;
    o.estimated_arrival_time = (o.estimated_arrival_time != null) ? (java.sql.Timestamp) o.estimated_arrival_time.clone() : null;
    o.early_receive_time = (o.early_receive_time != null) ? (java.sql.Timestamp) o.early_receive_time.clone() : null;
    o.latest_receive_time = (o.latest_receive_time != null) ? (java.sql.Timestamp) o.latest_receive_time.clone() : null;
    o.packed_time = (o.packed_time != null) ? (java.sql.Timestamp) o.packed_time.clone() : null;
    o.allocate_rider_time = (o.allocate_rider_time != null) ? (java.sql.Timestamp) o.allocate_rider_time.clone() : null;
    o.delivery_time = (o.delivery_time != null) ? (java.sql.Timestamp) o.delivery_time.clone() : null;
    o.arrival_time = (o.arrival_time != null) ? (java.sql.Timestamp) o.arrival_time.clone() : null;
    o.close_time = (o.close_time != null) ? (java.sql.Timestamp) o.close_time.clone() : null;
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("uid", this.uid);
    __sqoop$field_map.put("repo_id", this.repo_id);
    __sqoop$field_map.put("picker_name", this.picker_name);
    __sqoop$field_map.put("picker_phone", this.picker_phone);
    __sqoop$field_map.put("picker_addr", this.picker_addr);
    __sqoop$field_map.put("picker_detail_addr", this.picker_detail_addr);
    __sqoop$field_map.put("picker_longitude", this.picker_longitude);
    __sqoop$field_map.put("picker_latitude", this.picker_latitude);
    __sqoop$field_map.put("cp_order_id", this.cp_order_id);
    __sqoop$field_map.put("unify_order_id", this.unify_order_id);
    __sqoop$field_map.put("pay_type", this.pay_type);
    __sqoop$field_map.put("mode", this.mode);
    __sqoop$field_map.put("original_price", this.original_price);
    __sqoop$field_map.put("total_offer", this.total_offer);
    __sqoop$field_map.put("payable_money", this.payable_money);
    __sqoop$field_map.put("real_money", this.real_money);
    __sqoop$field_map.put("delivery_fee", this.delivery_fee);
    __sqoop$field_map.put("status1", this.status1);
    __sqoop$field_map.put("evaluate_status", this.evaluate_status);
    __sqoop$field_map.put("time", this.time);
    __sqoop$field_map.put("pay_time", this.pay_time);
    __sqoop$field_map.put("estimated_arrival_time", this.estimated_arrival_time);
    __sqoop$field_map.put("expected_receive_time", this.expected_receive_time);
    __sqoop$field_map.put("early_receive_time", this.early_receive_time);
    __sqoop$field_map.put("latest_receive_time", this.latest_receive_time);
    __sqoop$field_map.put("immediate", this.immediate);
    __sqoop$field_map.put("packed_time", this.packed_time);
    __sqoop$field_map.put("allocate_rider_time", this.allocate_rider_time);
    __sqoop$field_map.put("delivery_time", this.delivery_time);
    __sqoop$field_map.put("arrival_time", this.arrival_time);
    __sqoop$field_map.put("close_time", this.close_time);
    __sqoop$field_map.put("user_ticket_id", this.user_ticket_id);
    __sqoop$field_map.put("client_ip", this.client_ip);
    __sqoop$field_map.put("delivery_third_id", this.delivery_third_id);
    __sqoop$field_map.put("delivery_staff_id", this.delivery_staff_id);
    __sqoop$field_map.put("rider_uid", this.rider_uid);
    __sqoop$field_map.put("platform", this.platform);
    __sqoop$field_map.put("distance", this.distance);
    __sqoop$field_map.put("ride_distance", this.ride_distance);
    __sqoop$field_map.put("balance_enable", this.balance_enable);
    __sqoop$field_map.put("balance_uid", this.balance_uid);
    __sqoop$field_map.put("balance_payable", this.balance_payable);
    __sqoop$field_map.put("balance_real", this.balance_real);
    __sqoop$field_map.put("personal_balance_real", this.personal_balance_real);
    __sqoop$field_map.put("company_balance_real", this.company_balance_real);
    __sqoop$field_map.put("quota_balance_real", this.quota_balance_real);
    __sqoop$field_map.put("third_payable", this.third_payable);
    __sqoop$field_map.put("third_real", this.third_real);
    __sqoop$field_map.put("start_longitude", this.start_longitude);
    __sqoop$field_map.put("start_latitude", this.start_latitude);
    __sqoop$field_map.put("arrival_longitude", this.arrival_longitude);
    __sqoop$field_map.put("arrival_latitude", this.arrival_latitude);
    __sqoop$field_map.put("family_id", this.family_id);
    __sqoop$field_map.put("buyer_id", this.buyer_id);
    __sqoop$field_map.put("presale", this.presale);
    __sqoop$field_map.put("login_type", this.login_type);
    __sqoop$field_map.put("update_time", this.update_time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("uid", this.uid);
    __sqoop$field_map.put("repo_id", this.repo_id);
    __sqoop$field_map.put("picker_name", this.picker_name);
    __sqoop$field_map.put("picker_phone", this.picker_phone);
    __sqoop$field_map.put("picker_addr", this.picker_addr);
    __sqoop$field_map.put("picker_detail_addr", this.picker_detail_addr);
    __sqoop$field_map.put("picker_longitude", this.picker_longitude);
    __sqoop$field_map.put("picker_latitude", this.picker_latitude);
    __sqoop$field_map.put("cp_order_id", this.cp_order_id);
    __sqoop$field_map.put("unify_order_id", this.unify_order_id);
    __sqoop$field_map.put("pay_type", this.pay_type);
    __sqoop$field_map.put("mode", this.mode);
    __sqoop$field_map.put("original_price", this.original_price);
    __sqoop$field_map.put("total_offer", this.total_offer);
    __sqoop$field_map.put("payable_money", this.payable_money);
    __sqoop$field_map.put("real_money", this.real_money);
    __sqoop$field_map.put("delivery_fee", this.delivery_fee);
    __sqoop$field_map.put("status1", this.status1);
    __sqoop$field_map.put("evaluate_status", this.evaluate_status);
    __sqoop$field_map.put("time", this.time);
    __sqoop$field_map.put("pay_time", this.pay_time);
    __sqoop$field_map.put("estimated_arrival_time", this.estimated_arrival_time);
    __sqoop$field_map.put("expected_receive_time", this.expected_receive_time);
    __sqoop$field_map.put("early_receive_time", this.early_receive_time);
    __sqoop$field_map.put("latest_receive_time", this.latest_receive_time);
    __sqoop$field_map.put("immediate", this.immediate);
    __sqoop$field_map.put("packed_time", this.packed_time);
    __sqoop$field_map.put("allocate_rider_time", this.allocate_rider_time);
    __sqoop$field_map.put("delivery_time", this.delivery_time);
    __sqoop$field_map.put("arrival_time", this.arrival_time);
    __sqoop$field_map.put("close_time", this.close_time);
    __sqoop$field_map.put("user_ticket_id", this.user_ticket_id);
    __sqoop$field_map.put("client_ip", this.client_ip);
    __sqoop$field_map.put("delivery_third_id", this.delivery_third_id);
    __sqoop$field_map.put("delivery_staff_id", this.delivery_staff_id);
    __sqoop$field_map.put("rider_uid", this.rider_uid);
    __sqoop$field_map.put("platform", this.platform);
    __sqoop$field_map.put("distance", this.distance);
    __sqoop$field_map.put("ride_distance", this.ride_distance);
    __sqoop$field_map.put("balance_enable", this.balance_enable);
    __sqoop$field_map.put("balance_uid", this.balance_uid);
    __sqoop$field_map.put("balance_payable", this.balance_payable);
    __sqoop$field_map.put("balance_real", this.balance_real);
    __sqoop$field_map.put("personal_balance_real", this.personal_balance_real);
    __sqoop$field_map.put("company_balance_real", this.company_balance_real);
    __sqoop$field_map.put("quota_balance_real", this.quota_balance_real);
    __sqoop$field_map.put("third_payable", this.third_payable);
    __sqoop$field_map.put("third_real", this.third_real);
    __sqoop$field_map.put("start_longitude", this.start_longitude);
    __sqoop$field_map.put("start_latitude", this.start_latitude);
    __sqoop$field_map.put("arrival_longitude", this.arrival_longitude);
    __sqoop$field_map.put("arrival_latitude", this.arrival_latitude);
    __sqoop$field_map.put("family_id", this.family_id);
    __sqoop$field_map.put("buyer_id", this.buyer_id);
    __sqoop$field_map.put("presale", this.presale);
    __sqoop$field_map.put("login_type", this.login_type);
    __sqoop$field_map.put("update_time", this.update_time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("uid".equals(__fieldName)) {
      this.uid = (Long) __fieldVal;
    }
    else    if ("repo_id".equals(__fieldName)) {
      this.repo_id = (Long) __fieldVal;
    }
    else    if ("picker_name".equals(__fieldName)) {
      this.picker_name = (String) __fieldVal;
    }
    else    if ("picker_phone".equals(__fieldName)) {
      this.picker_phone = (String) __fieldVal;
    }
    else    if ("picker_addr".equals(__fieldName)) {
      this.picker_addr = (String) __fieldVal;
    }
    else    if ("picker_detail_addr".equals(__fieldName)) {
      this.picker_detail_addr = (String) __fieldVal;
    }
    else    if ("picker_longitude".equals(__fieldName)) {
      this.picker_longitude = (Double) __fieldVal;
    }
    else    if ("picker_latitude".equals(__fieldName)) {
      this.picker_latitude = (Double) __fieldVal;
    }
    else    if ("cp_order_id".equals(__fieldName)) {
      this.cp_order_id = (String) __fieldVal;
    }
    else    if ("unify_order_id".equals(__fieldName)) {
      this.unify_order_id = (String) __fieldVal;
    }
    else    if ("pay_type".equals(__fieldName)) {
      this.pay_type = (Integer) __fieldVal;
    }
    else    if ("mode".equals(__fieldName)) {
      this.mode = (Integer) __fieldVal;
    }
    else    if ("original_price".equals(__fieldName)) {
      this.original_price = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("total_offer".equals(__fieldName)) {
      this.total_offer = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("payable_money".equals(__fieldName)) {
      this.payable_money = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("real_money".equals(__fieldName)) {
      this.real_money = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("delivery_fee".equals(__fieldName)) {
      this.delivery_fee = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("status1".equals(__fieldName)) {
      this.status1 = (Integer) __fieldVal;
    }
    else    if ("evaluate_status".equals(__fieldName)) {
      this.evaluate_status = (Integer) __fieldVal;
    }
    else    if ("time".equals(__fieldName)) {
      this.time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("pay_time".equals(__fieldName)) {
      this.pay_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("estimated_arrival_time".equals(__fieldName)) {
      this.estimated_arrival_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("expected_receive_time".equals(__fieldName)) {
      this.expected_receive_time = (String) __fieldVal;
    }
    else    if ("early_receive_time".equals(__fieldName)) {
      this.early_receive_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("latest_receive_time".equals(__fieldName)) {
      this.latest_receive_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("immediate".equals(__fieldName)) {
      this.immediate = (Integer) __fieldVal;
    }
    else    if ("packed_time".equals(__fieldName)) {
      this.packed_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("allocate_rider_time".equals(__fieldName)) {
      this.allocate_rider_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("delivery_time".equals(__fieldName)) {
      this.delivery_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("arrival_time".equals(__fieldName)) {
      this.arrival_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("close_time".equals(__fieldName)) {
      this.close_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("user_ticket_id".equals(__fieldName)) {
      this.user_ticket_id = (Long) __fieldVal;
    }
    else    if ("client_ip".equals(__fieldName)) {
      this.client_ip = (String) __fieldVal;
    }
    else    if ("delivery_third_id".equals(__fieldName)) {
      this.delivery_third_id = (Long) __fieldVal;
    }
    else    if ("delivery_staff_id".equals(__fieldName)) {
      this.delivery_staff_id = (Integer) __fieldVal;
    }
    else    if ("rider_uid".equals(__fieldName)) {
      this.rider_uid = (Long) __fieldVal;
    }
    else    if ("platform".equals(__fieldName)) {
      this.platform = (String) __fieldVal;
    }
    else    if ("distance".equals(__fieldName)) {
      this.distance = (Integer) __fieldVal;
    }
    else    if ("ride_distance".equals(__fieldName)) {
      this.ride_distance = (Integer) __fieldVal;
    }
    else    if ("balance_enable".equals(__fieldName)) {
      this.balance_enable = (Integer) __fieldVal;
    }
    else    if ("balance_uid".equals(__fieldName)) {
      this.balance_uid = (Long) __fieldVal;
    }
    else    if ("balance_payable".equals(__fieldName)) {
      this.balance_payable = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("balance_real".equals(__fieldName)) {
      this.balance_real = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("personal_balance_real".equals(__fieldName)) {
      this.personal_balance_real = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("company_balance_real".equals(__fieldName)) {
      this.company_balance_real = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("quota_balance_real".equals(__fieldName)) {
      this.quota_balance_real = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("third_payable".equals(__fieldName)) {
      this.third_payable = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("third_real".equals(__fieldName)) {
      this.third_real = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("start_longitude".equals(__fieldName)) {
      this.start_longitude = (Double) __fieldVal;
    }
    else    if ("start_latitude".equals(__fieldName)) {
      this.start_latitude = (Double) __fieldVal;
    }
    else    if ("arrival_longitude".equals(__fieldName)) {
      this.arrival_longitude = (Double) __fieldVal;
    }
    else    if ("arrival_latitude".equals(__fieldName)) {
      this.arrival_latitude = (Double) __fieldVal;
    }
    else    if ("family_id".equals(__fieldName)) {
      this.family_id = (Long) __fieldVal;
    }
    else    if ("buyer_id".equals(__fieldName)) {
      this.buyer_id = (String) __fieldVal;
    }
    else    if ("presale".equals(__fieldName)) {
      this.presale = (Integer) __fieldVal;
    }
    else    if ("login_type".equals(__fieldName)) {
      this.login_type = (Integer) __fieldVal;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
      return true;
    }
    else    if ("uid".equals(__fieldName)) {
      this.uid = (Long) __fieldVal;
      return true;
    }
    else    if ("repo_id".equals(__fieldName)) {
      this.repo_id = (Long) __fieldVal;
      return true;
    }
    else    if ("picker_name".equals(__fieldName)) {
      this.picker_name = (String) __fieldVal;
      return true;
    }
    else    if ("picker_phone".equals(__fieldName)) {
      this.picker_phone = (String) __fieldVal;
      return true;
    }
    else    if ("picker_addr".equals(__fieldName)) {
      this.picker_addr = (String) __fieldVal;
      return true;
    }
    else    if ("picker_detail_addr".equals(__fieldName)) {
      this.picker_detail_addr = (String) __fieldVal;
      return true;
    }
    else    if ("picker_longitude".equals(__fieldName)) {
      this.picker_longitude = (Double) __fieldVal;
      return true;
    }
    else    if ("picker_latitude".equals(__fieldName)) {
      this.picker_latitude = (Double) __fieldVal;
      return true;
    }
    else    if ("cp_order_id".equals(__fieldName)) {
      this.cp_order_id = (String) __fieldVal;
      return true;
    }
    else    if ("unify_order_id".equals(__fieldName)) {
      this.unify_order_id = (String) __fieldVal;
      return true;
    }
    else    if ("pay_type".equals(__fieldName)) {
      this.pay_type = (Integer) __fieldVal;
      return true;
    }
    else    if ("mode".equals(__fieldName)) {
      this.mode = (Integer) __fieldVal;
      return true;
    }
    else    if ("original_price".equals(__fieldName)) {
      this.original_price = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("total_offer".equals(__fieldName)) {
      this.total_offer = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("payable_money".equals(__fieldName)) {
      this.payable_money = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("real_money".equals(__fieldName)) {
      this.real_money = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("delivery_fee".equals(__fieldName)) {
      this.delivery_fee = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("status1".equals(__fieldName)) {
      this.status1 = (Integer) __fieldVal;
      return true;
    }
    else    if ("evaluate_status".equals(__fieldName)) {
      this.evaluate_status = (Integer) __fieldVal;
      return true;
    }
    else    if ("time".equals(__fieldName)) {
      this.time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("pay_time".equals(__fieldName)) {
      this.pay_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("estimated_arrival_time".equals(__fieldName)) {
      this.estimated_arrival_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("expected_receive_time".equals(__fieldName)) {
      this.expected_receive_time = (String) __fieldVal;
      return true;
    }
    else    if ("early_receive_time".equals(__fieldName)) {
      this.early_receive_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("latest_receive_time".equals(__fieldName)) {
      this.latest_receive_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("immediate".equals(__fieldName)) {
      this.immediate = (Integer) __fieldVal;
      return true;
    }
    else    if ("packed_time".equals(__fieldName)) {
      this.packed_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("allocate_rider_time".equals(__fieldName)) {
      this.allocate_rider_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("delivery_time".equals(__fieldName)) {
      this.delivery_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("arrival_time".equals(__fieldName)) {
      this.arrival_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("close_time".equals(__fieldName)) {
      this.close_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("user_ticket_id".equals(__fieldName)) {
      this.user_ticket_id = (Long) __fieldVal;
      return true;
    }
    else    if ("client_ip".equals(__fieldName)) {
      this.client_ip = (String) __fieldVal;
      return true;
    }
    else    if ("delivery_third_id".equals(__fieldName)) {
      this.delivery_third_id = (Long) __fieldVal;
      return true;
    }
    else    if ("delivery_staff_id".equals(__fieldName)) {
      this.delivery_staff_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("rider_uid".equals(__fieldName)) {
      this.rider_uid = (Long) __fieldVal;
      return true;
    }
    else    if ("platform".equals(__fieldName)) {
      this.platform = (String) __fieldVal;
      return true;
    }
    else    if ("distance".equals(__fieldName)) {
      this.distance = (Integer) __fieldVal;
      return true;
    }
    else    if ("ride_distance".equals(__fieldName)) {
      this.ride_distance = (Integer) __fieldVal;
      return true;
    }
    else    if ("balance_enable".equals(__fieldName)) {
      this.balance_enable = (Integer) __fieldVal;
      return true;
    }
    else    if ("balance_uid".equals(__fieldName)) {
      this.balance_uid = (Long) __fieldVal;
      return true;
    }
    else    if ("balance_payable".equals(__fieldName)) {
      this.balance_payable = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("balance_real".equals(__fieldName)) {
      this.balance_real = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("personal_balance_real".equals(__fieldName)) {
      this.personal_balance_real = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("company_balance_real".equals(__fieldName)) {
      this.company_balance_real = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("quota_balance_real".equals(__fieldName)) {
      this.quota_balance_real = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("third_payable".equals(__fieldName)) {
      this.third_payable = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("third_real".equals(__fieldName)) {
      this.third_real = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("start_longitude".equals(__fieldName)) {
      this.start_longitude = (Double) __fieldVal;
      return true;
    }
    else    if ("start_latitude".equals(__fieldName)) {
      this.start_latitude = (Double) __fieldVal;
      return true;
    }
    else    if ("arrival_longitude".equals(__fieldName)) {
      this.arrival_longitude = (Double) __fieldVal;
      return true;
    }
    else    if ("arrival_latitude".equals(__fieldName)) {
      this.arrival_latitude = (Double) __fieldVal;
      return true;
    }
    else    if ("family_id".equals(__fieldName)) {
      this.family_id = (Long) __fieldVal;
      return true;
    }
    else    if ("buyer_id".equals(__fieldName)) {
      this.buyer_id = (String) __fieldVal;
      return true;
    }
    else    if ("presale".equals(__fieldName)) {
      this.presale = (Integer) __fieldVal;
      return true;
    }
    else    if ("login_type".equals(__fieldName)) {
      this.login_type = (Integer) __fieldVal;
      return true;
    }
    else    if ("update_time".equals(__fieldName)) {
      this.update_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
