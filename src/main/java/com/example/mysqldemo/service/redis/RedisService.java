package com.example.mysqldemo.service.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Redis通用服务
 *
 * <P>
 * THashKey HashKey 类型
 * </P>
 * <p>
 * TValue Value 类型
 * </p>
 *
 * @author risfeng
 * @date 2019/08/28
 */
@Service
public class RedisService<THashKey, TValue> {

  /**
   * redis key前缀
   */
  @Value("${redis.key-prefix}")
  private String keyPrefix;

  @Value("${redis.key-prefix-net}")
  private String netKeyPrefix;

  /**
   * 缓存过期时间分钟：60*5′=5小时
   */
  public final long DEFAULT_CACHE_TIMEOUT_MINUTE = 60 * 5;

  /**
   * 在构造器中获取redisTemplate实例, key(not hashKey) 默认使用String类型
   */
  private RedisTemplate<String, TValue> redisTemplate;
  /**
   * 在构造器中通过redisTemplate的工厂方法实例化操作对象
   * <p>
   * 可自己扩展
   * </p>
   */
  private HashOperations<String, THashKey, TValue> hashOperations;
  private ListOperations<String, TValue> listOperations;
  private ValueOperations<String, TValue> valueOperations;
  private ValueOperations<String, String> valueStingOperations;

  public RedisService(
      StringRedisTemplate stringRedisTemplate,
      RedisTemplate<String, TValue> redisTemplate) {
    this.redisTemplate = redisTemplate;
    this.hashOperations = redisTemplate.opsForHash();
    this.listOperations = redisTemplate.opsForList();
    this.valueOperations = redisTemplate.opsForValue();
    this.valueStingOperations = stringRedisTemplate.opsForValue();
  }

  /**
   * 设置哈希列表【自动拼接Key前缀】
   *
   * @param key redis key not  null
   * @param hashKey hash key not  null
   * @param value value
   */
  public void hashPutWithPrefix(String key, THashKey hashKey, TValue value) {
    key = getFullKey(key);
    hashOperations.put(key, hashKey, value);
  }

  /**
   * 设置哈希列表
   *
   * @param key redis key not  null
   * @param hashKey hash key not  null
   * @param value value
   */
  public void hashPut(String key, THashKey hashKey, TValue value) {
    hashOperations.put(key, hashKey, value);
  }

  /**
   * 通过key查找哈希列表【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@code Map<THashKey, TValue>} 列表
   */
  public Map<THashKey, TValue> hashFindAllWithPrefix(String key) {
    key = getFullKey(key);
    return hashOperations.entries(key);
  }

  /**
   * 通过key查找哈希列表
   *
   * @param key redis key
   * @return {@code Map<THashKey, TValue>} 列表
   */
  public Map<THashKey, TValue> hashFindAll(String key) {
    return hashOperations.entries(key);
  }

  /**
   * 通过 key 和 哈希key 获取值【自动拼接Key前缀】
   *
   * @param key redis key
   * @param hashKey 哈希key
   * @return {@code TValue} 值
   */
  public TValue hashGetWithPrefix(String key, THashKey hashKey) {
    key = getFullKey(key);
    return hashOperations.get(key, hashKey);
  }

  /**
   * 通过 key 和 哈希key 获取值
   *
   * @param key redis key
   * @param hashKey 哈希key
   * @return {@code TValue} 值
   */
  public TValue hashGet(String key, THashKey hashKey) {
    return hashOperations.get(key, hashKey);
  }

  /**
   * 删除哈希列表中某一个哈希key【自动拼接Key前缀】
   *
   * @param key redis key
   * @param hashKey 哈希key
   */
  public void hashRemoveWithPrefix(String key, THashKey hashKey) {
    key = getFullKey(key);
    hashOperations.delete(key, hashKey);
  }

  /**
   * 删除哈希列表中某一个哈希key
   *
   * @param key redis key
   * @param hashKey 哈希key
   */
  public Long hashRemove(String key, THashKey hashKey) {
    return hashOperations.delete(key, hashKey);
  }

  /**
   * 将所有指定的值插入存储在的列表的尾部key【自动拼接Key前缀】。
   * <p>
   * 如果key不存在，则在执行推送操作之前将其创建为空列表。如果key保存的值不是列表，则返回错误。
   * </p>
   *
   * @param key redis key
   * @param value 待插入的值
   * @return 操作后列表的长度
   */
  public Long listPushWithPrefix(String key, TValue value) {
    key = getFullKey(key);
    return listOperations.rightPush(key, value);
  }

  /**
   * 将所有指定的值插入存储在的列表的尾部key
   * <p>
   * 如果key不存在，则在执行推送操作之前将其创建为空列表。如果key保存的值不是列表，则返回错误。
   * </p>
   *
   * @param key redis key
   * @param value 待插入的值
   * @return 操作后列表的长度
   */
  public Long listPush(String key, TValue value) {
    return listOperations.rightPush(key, value);
  }

  /**
   * 将所有指定的值插入存储在的列表的头部key【自动拼接Key前缀】
   * <p>
   * 如果key不存在，则在执行推送操作之前将其创建为空列表。如果key保存的值不是列表，则返回错误。
   * </p>
   *
   * @param key redis key
   * @param value 待插入的值
   * @return 操作后列表的长度
   */
  public Long listUnshiftWithPrefix(String key, TValue value) {
    key = getFullKey(key);
    return listOperations.leftPush(key, value);
  }

  /**
   * 将所有指定的值插入存储在的列表的头部key。
   * <p>
   * 如果key不存在，则在执行推送操作之前将其创建为空列表。如果key保存的值不是列表，则返回错误。
   * </p>
   *
   * @param key redis key
   * @param value 待插入的值
   * @return 操作后列表的长度
   */
  public Long listUnshift(String key, TValue value) {
    return listOperations.leftPush(key, value);
  }

  /**
   * 返回key的所有元素列表【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@code List<TValue>} 所有元素列表
   */
  public List<TValue> listFindAllWithPrefix(String key) {
    key = getFullKey(key);
    Boolean hasKey = redisTemplate.hasKey(key);
    if (hasKey == null || !hasKey) {
      return null;
    }
    Long size = listOperations.size(key);
    return listOperations.range(key, 0, size == null ? 0 : size);
  }

  /**
   * 返回key的所有元素列表
   *
   * @param key redis key
   * @return {@code List<TValue>} 所有元素列表
   */
  public List<TValue> listFindAll(String key) {
    Boolean hasKey = redisTemplate.hasKey(key);
    if (hasKey == null || !hasKey) {
      return null;
    }
    Long size = listOperations.size(key);
    return listOperations.range(key, 0, size == null ? 0 : size);
  }

  /**
   * 删除并返回存储在列表中的第一个元素key【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@code TValue} 第一个元素的值，当key不存在时返回null
   */
  public TValue listLeftPopWithPrefix(String key) {
    key = getFullKey(key);
    return listOperations.leftPop(key);
  }

  /**
   * 删除并返回存储在列表中的第一个元素key。
   *
   * @param key redis key
   * @return {@code TValue} 第一个元素的值，当key不存在时返回null
   */
  public TValue listLeftPop(String key) {
    return listOperations.leftPop(key);
  }

  /**
   * 设置 {@link TValue} 类型的值【自动拼接Key前缀】
   *
   * @param key redis key
   * @param value 值
   */
  public void setValueWithPrefix(String key, TValue value) {
    key = getFullKey(key);
    valueOperations.set(key, value);
  }

  /**
   * 设置 {@link TValue} 类型的值
   *
   * @param key redis key
   * @param value 值
   */
  public void setValue(String key, TValue value) {
    valueOperations.set(key, value);
  }

  /**
   * 设置 {@link TValue} 类型的值【自动拼接Key前缀】
   *
   * @param key redis key
   * @param value 值
   * @param timeout key过期时间,单位：毫秒
   */
  public void setValueWithPrefix(String key, TValue value, long timeout) {
    key = getFullKey(key);
    valueOperations.set(key, value, timeout, TimeUnit.MILLISECONDS);
  }

  /**
   * 设置 {@link TValue} 类型的值
   *
   * @param key redis key
   * @param value 值
   * @param timeout key过期时间,单位：毫秒
   */
  public void setValue(String key, TValue value, long timeout) {
    valueOperations.set(key, value, timeout, TimeUnit.MILLISECONDS);
  }

  /**
   * 设置 {@link TValue} 类型的值【自动拼接Key前缀】
   *
   * @param key redis key
   * @param value 值
   * @param timeout key过期时间
   * @param timeUnit key过期时间单位
   */
  public void setValueWithPrefix(String key, TValue value, long timeout, TimeUnit timeUnit) {
    key = getFullKey(key);
    valueOperations.set(key, value, timeout, timeUnit);
  }

  /**
   * 设置 {@link TValue} 类型的值
   *
   * @param key redis key
   * @param value 值
   * @param timeout key过期时间
   * @param timeUnit key过期时间单位
   */
  public void setValue(String key, TValue value, long timeout, TimeUnit timeUnit) {
    valueOperations.set(key, value, timeout, timeUnit);
  }

  /**
   * 设置 {@link String} 类型的值【自动拼接Key前缀】
   *
   * @param key redis key
   * @param value 值
   */
  public void setStringValueWithPrefix(String key, String value) {
    key = getFullKey(key);
    valueStingOperations.set(key, value);
  }

  /**
   * 设置 {@link String} 类型的值
   *
   * @param key redis key
   * @param value 值
   */
  public void setStringValue(String key, String value) {
    valueStingOperations.set(key, value);
  }

  /**
   * 设置 {@link String} 类型的值【自动拼接Key前缀】
   *
   * @param key redis key
   * @param value 值
   * @param timeout key过期时间,单位：毫秒
   */
  public void setStringValueWithPrefix(String key, String value, long timeout) {
    key = getFullKey(key);
    valueStingOperations.set(key, value, timeout, TimeUnit.MILLISECONDS);
  }

  /**
   * 设置 {@link String} 类型的值
   *
   * @param key redis key
   * @param value 值
   * @param timeout key过期时间,单位：毫秒
   */
  public void setStringValue(String key, String value, long timeout) {
    valueStingOperations.set(key, value, timeout, TimeUnit.MILLISECONDS);
  }

  /**
   * 设置 {@link String} 类型的值【自动拼接Key前缀】
   *
   * @param key redis key
   * @param value 值
   * @param timeout key过期时间
   * @param timeUnit key过期时间单位
   */
  public void setStringValueWithPrefix(String key, String value, long timeout, TimeUnit timeUnit) {
    key = getFullKey(key);
    valueStingOperations.set(key, value, timeout, timeUnit);
  }

  /**
   * 设置 {@link String} 类型的值
   *
   * @param key redis key
   * @param value 值
   * @param timeout key过期时间
   * @param timeUnit key过期时间单位
   */
  public void setStringValue(String key, String value, long timeout, TimeUnit timeUnit) {
    valueStingOperations.set(key, value, timeout, timeUnit);
  }

  /**
   * 获取 {@link TValue} 类型的值【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@link TValue} 值
   */
  public TValue getValueWithPrefix(String key) {
    key = getFullKey(key);
    return valueOperations.get(key);
  }

  /**
   * 获取 {@link TValue} 类型的值
   *
   * @param key redis key
   * @return {@link TValue} 值
   */
  public TValue getValue(String key) {
    return valueOperations.get(key);
  }

  /**
   * 获取 {@link String} 类型的值【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@link String} 值
   */
  public String getStringValueWithPrefix(String key) {
    key = getFullKey(key);
    return valueStingOperations.get(key);
  }

  /**
   * 获取 {@link String} 类型的值
   *
   * @param key redis key
   * @return {@link String} 值
   */
  public String getStringValue(String key) {
    return valueStingOperations.get(key);
  }

  /**
   * 删除Key【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@link boolean} 是否成功
   */
  public boolean removeWithPrefix(String key) {
    key = getFullKey(key);
    Boolean result = redisTemplate.delete(key);
    return result != null && result;
  }

  /**
   * 跨服务删除Key，不自动拼接项目名称前缀
   *
   * @param key redis key
   * @return {@link boolean} 是否成功
   */
  public boolean remove(String key) {
    Boolean result = redisTemplate.delete(key);
    return result != null && result;
  }

  /**
   * 删除Keys【自动拼接Key前缀】
   *
   * @param keys redis keys
   * @return {@link long} 已删除的键数
   */
  public long removeWithPrefix(Collection<String> keys) {
    keys = getFullKey(keys);
    Long result = redisTemplate.delete(keys);
    return result == null ? 0 : result;
  }

  /**
   * 删除Keys
   *
   * @param keys redis keys
   * @return {@link long} 已删除的键数
   */
  public long remove(Collection<String> keys) {
    Long result = redisTemplate.delete(keys);
    return result == null ? 0 : result;
  }

  /**
   * 设置Key过期时间【自动拼接Key前缀】
   *
   * @param key redis key
   * @param timeout 过期时间
   * @param timeUnit 过期时间单位
   * @return {@link boolean} 是否成功
   */
  public boolean expireWithPrefix(String key, long timeout, TimeUnit timeUnit) {
    key = getFullKey(key);
    Boolean expire = redisTemplate.expire(key, timeout, timeUnit);
    return expire != null && expire;
  }

  /**
   * 设置Key过期时间
   *
   * @param key redis key
   * @param timeout 过期时间
   * @param timeUnit 过期时间单位
   * @return {@link boolean} 是否成功
   */
  public boolean expire(String key, long timeout, TimeUnit timeUnit) {
    Boolean expire = redisTemplate.expire(key, timeout, timeUnit);
    return expire != null && expire;
  }

  /**
   * 设置Key过期时间【自动拼接Key前缀】
   *
   * @param key redis key
   * @param expireAt 具体过期日期
   * @return {@link boolean} 是否成功
   */
  public boolean expireAtWithPrefix(String key, Date expireAt) {
    key = getFullKey(key);
    Boolean expire = redisTemplate.expireAt(key, expireAt);
    return expire != null && expire;
  }

  /**
   * 设置Key过期时间
   *
   * @param key redis key
   * @param expireAt 具体过期日期
   * @return {@link boolean} 是否成功
   */
  public boolean expireAt(String key, Date expireAt) {
    Boolean expire = redisTemplate.expireAt(key, expireAt);
    return expire != null && expire;
  }

  /**
   * Key是否存在【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@link boolean} 是否存在
   */
  public boolean hasKeyWithPrefix(String key) {
    key = getFullKey(key);
    Boolean hasKey = redisTemplate.hasKey(key);
    return hasKey != null && hasKey;
  }

  /**
   * Key是否存在
   *
   * @param key redis key
   * @return {@link boolean} 是否存在
   */
  public boolean hasKey(String key) {
    Boolean hasKey = redisTemplate.hasKey(key);
    return hasKey != null && hasKey;
  }

  /**
   * 设置Key为永不过期【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@link boolean} 是否成功
   */
  public boolean persistWithPrefix(String key) {
    key = getFullKey(key);
    Boolean persist = redisTemplate.persist(key);
    return persist != null && persist;
  }

  /**
   * 设置Key为永不过期
   *
   * @param key redis key
   * @return {@link boolean} 是否成功
   */
  public boolean persist(String key) {
    Boolean persist = redisTemplate.persist(key);
    return persist != null && persist;
  }

  /**
   * 返回Key的剩余生存时间,单位：秒【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@link boolean} 剩余生存时间，以秒为单位，错误返回为负值
   */
  public long getExpireWithPrefix(String key) {
    key = getFullKey(key);
    Long getExpire = redisTemplate.getExpire(key);
    return getExpire == null ? -1 : getExpire;
  }

  /**
   * 返回Key的剩余生存时间,单位：秒
   *
   * @param key redis key
   * @return {@link boolean} 剩余生存时间，以秒为单位，错误返回为负值
   */
  public long getExpire(String key) {
    Long getExpire = redisTemplate.getExpire(key);
    return getExpire == null ? -1 : getExpire;
  }

  /**
   * 返回Key的剩余生存时间【自动拼接Key前缀】
   *
   * @param key redis key
   * @param timeUnit 时间单位
   * @return {@link boolean} 剩余生存时间，错误返回为负值
   */
  public long getExpireWithPrefix(String key, final TimeUnit timeUnit) {
    key = getFullKey(key);
    Long getExpire = redisTemplate.getExpire(key, timeUnit);
    return getExpire == null ? -1 : getExpire;
  }

  /**
   * 返回Key的剩余生存时间
   *
   * @param key redis key
   * @param timeUnit 时间单位
   * @return {@link boolean} 剩余生存时间，错误返回为负值
   */
  public long getExpire(String key, final TimeUnit timeUnit) {
    Long getExpire = redisTemplate.getExpire(key, timeUnit);
    return getExpire == null ? -1 : getExpire;
  }

  /**
   * 获取统一格式的key
   * <p>
   * 每个字符串之间使用:分隔，在Redis管理器中查看时是以目录层级显示，增强可读性。
   * </p>
   *
   * @param keys key列表
   * @return 格式后key
   */
  public String getKey(String... keys) {
    return String.join(":", keys);
  }

  /**
   * 获取完整key，在头上加上key前缀。之间用：分隔
   *
   * @param key key
   * @return 在头部追加keyPrefix的key
   */
  private String getFullKey(String key) {
    return String.format("%s:%s", keyPrefix, key);
  }

  /**
   * 获取完整key，在头上加上key前缀。之间用：分隔
   *
   * @param keys keys
   * @return 在头部追加keyPrefix的keys
   */
  private Collection<String> getFullKey(Collection<String> keys) {
    keys = keys.stream()
        .map(this::getFullKey)
        .collect(Collectors.toList());
    return keys;
  }

  /**
   * 获取完整net key，在头上加上key前缀。之间用_分隔
   *
   * @param key key
   * @return 在头部追加netKeyPrefix的key
   */
  private String getNetFullKey(String key) {
    return String.format("%s_%s", netKeyPrefix, key);
  }

  /**
   * 删除Key【自动拼接Key前缀】
   *
   * @param key redis key
   * @return {@link boolean} 是否成功
   */
  public boolean removeWithNetPrefix(String key) {
    key = getNetFullKey(key);
    Boolean result = redisTemplate.delete(key);
    return result != null && result;
  }

  public boolean setIfAbsent(String key, String value, long timeout){
    key = getFullKey(key);
    return valueStingOperations.setIfAbsent(key,value,timeout,TimeUnit.SECONDS);
  }
}
