package com.butcheer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Butcheer on 2019-04-02 13:40
 */
@Entity
public class UnitOfMeasure {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String decription;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getDecription() {
      return decription;
   }

   public void setDecription(String decription) {
      this.decription = decription;
   }
}
