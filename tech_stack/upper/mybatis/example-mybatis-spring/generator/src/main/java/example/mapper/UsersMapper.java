package example.mapper;

import example.model.Users;
import java.util.List;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated Fri Mar 19 17:52:41 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated Fri Mar 19 17:52:41 CST 2021
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated Fri Mar 19 17:52:41 CST 2021
     */
    Users selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated Fri Mar 19 17:52:41 CST 2021
     */
    List<Users> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated Fri Mar 19 17:52:41 CST 2021
     */
    int updateByPrimaryKey(Users record);
}