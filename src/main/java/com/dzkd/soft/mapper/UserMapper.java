package com.dzkd.soft.mapper;
import com.dzkd.soft.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectById(Integer id);

    User selectByIdAndName(@Param("id") Integer id,@Param("name") String name);
    User selectByNameAndPass(@Param("name") String name,@Param("pass") String pass);

}
