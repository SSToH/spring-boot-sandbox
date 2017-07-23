package com.app.bootstrap.form;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class UserRegistrationForm {

    @NotBlank
    @Length(max = 255)
    /**
     * user name.
     */
    private String userName;

    @NotBlank
    @Length(max = 255)
    @Email
    /**
     * user email.
     */
    private String email;

    @NotBlank
    @Length(max = 256)
    /**
     * user password.
     */
    private String password;

    /**
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName セットする userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email セットする email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password セットする password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
