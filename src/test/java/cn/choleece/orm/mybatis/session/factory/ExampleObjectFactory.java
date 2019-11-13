package cn.choleece.orm.mybatis.session.factory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.Collection;
import java.util.Properties;

/**
 * @author choleece
 * @Description: TODO
 * @Date 2019-11-13 22:13
 **/
public class ExampleObjectFactory extends DefaultObjectFactory {

  @Override
  public Object create(Class type) {
    return super.create(type);
  }

  @Override
  public void setProperties(Properties properties) {
    super.setProperties(properties);
  }

  @Override
  public <T> boolean isCollection(Class<T> type) {
    return Collection.class.isAssignableFrom(type);
  }
}
