package cn.choleece.orm.mybatis.session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.Reader;
import java.util.List;

class SqlSessionTest {

  private static SqlSessionFactory sqlSessionFactory;

  @BeforeAll
  static void setUp() throws Exception {
    // create a SqlSessionFactory
    try (Reader reader = Resources.getResourceAsReader("cn/choleece/orm/mybatis/session/mybatis-config.xml")) {
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }
  }

  @Test
  void sql() {
    SqlSession session = sqlSessionFactory.openSession();

    int count = session.update("update");
    System.out.println(count);

    CityMapper cityMapper = session.getMapper(CityMapper.class);

    List<City> cities = cityMapper.selectList();

    cityMapper.update();
    System.out.println(cities);
  }
}
