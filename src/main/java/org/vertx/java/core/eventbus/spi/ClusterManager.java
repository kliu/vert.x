package org.vertx.java.core.eventbus.spi;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public interface ClusterManager {
  AsyncMultiMap getMultiMap(String name);

  void close();
}