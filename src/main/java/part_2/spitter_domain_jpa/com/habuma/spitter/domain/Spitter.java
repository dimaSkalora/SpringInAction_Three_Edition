package part_2.spitter_domain_jpa.com.habuma.spitter.domain;

import static java.util.Arrays.*;
import static javax.persistence.GenerationType.*;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="spitter")
@XmlRootElement
public class Spitter implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;

  //<start id="java_SpitterValidated" />
  private String username;

  private String password;


  private String fullName;
  

  private String email;  
  //<end id="java_SpitterValidated" /> 

  private boolean updateByEmail;
  
  @Id
  @GeneratedValue(strategy = AUTO)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name="username", unique=true)
  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Column(name="password")
  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Column(name="fullname")
  public String getFullName() {
    return fullName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name="email")
  public String getEmail() {
    return email;
  }

  public void setUpdateByEmail(boolean updateByEmail) {
    this.updateByEmail = updateByEmail;
  }

  @Column(name="update_by_email")
  public boolean isUpdateByEmail() {
    return updateByEmail;
  }

  @Transient
  public List<Spittle> getRecentSpittles() {
    Spittle spittle = new Spittle();
    spittle.setId(999L);
    spittle.setSpitter(this);
    spittle.setText("TEST SPITTLE #99");
    spittle.setWhen(new Date());
    return asList(spittle);
  }

}
