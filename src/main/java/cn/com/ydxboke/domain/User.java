package cn.com.ydxboke.domain;

import lombok.Data;

import javax.persistence.*;

@Data
public class User {
    /**
     * ID
     */
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * salt密钥
     */
    private String salt;

    /**
     * 头像
     */
    @Column(name = "head_url")
    private String headUrl;

    /**
     * 角色
     */
    private String role;
}