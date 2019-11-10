package cn.choleece.orm.mybatis.session;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author choleece
 * @Description: TODO
 * @Date 2019-11-10 23:04
 **/
public interface CityMapper {

  @Select("select * from city")
  List<City> selectList();
}
