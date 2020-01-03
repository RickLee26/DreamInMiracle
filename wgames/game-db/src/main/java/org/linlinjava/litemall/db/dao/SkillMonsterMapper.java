package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.SkillMonster;
import org.linlinjava.litemall.db.domain.example.SkillMonsterExample;

public interface SkillMonsterMapper {
    long countByExample(SkillMonsterExample example);

    int deleteByExample(SkillMonsterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkillMonster record);

    int insertSelective(SkillMonster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill_monster
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SkillMonster selectOneByExample(SkillMonsterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill_monster
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SkillMonster selectOneByExampleSelective(@Param("example") SkillMonsterExample example, @Param("selective") SkillMonster.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill_monster
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SkillMonster> selectByExampleSelective(@Param("example") SkillMonsterExample example, @Param("selective") SkillMonster.Column ... selective);

    List<SkillMonster> selectByExample(SkillMonsterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill_monster
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SkillMonster selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SkillMonster.Column ... selective);

    SkillMonster selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill_monster
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SkillMonster selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") SkillMonster record, @Param("example") SkillMonsterExample example);

    int updateByExample(@Param("record") SkillMonster record, @Param("example") SkillMonsterExample example);

    int updateByPrimaryKeySelective(SkillMonster record);

    int updateByPrimaryKey(SkillMonster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill_monster
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SkillMonsterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill_monster
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}