package cn.choleece.orm.mybatis.session;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author choleece
 * @Description: TODO
 * @Date 2019-11-10 23:04
 **/
public interface CityMapper {

  @Select("select * from city")
  List<City> selectList();

  @Update("update city set name = '北京市' where name = '孝感市'")
  int update();
}
