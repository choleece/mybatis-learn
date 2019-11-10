package cn.choleece.orm.mybatis.session;

/**
 * @author choleece
 * @Description: TODO
 * @Date 2019-11-10 23:06
 **/
public class City {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "City{" +
      ", name='" + name + '\'' +
      '}';
  }
}
