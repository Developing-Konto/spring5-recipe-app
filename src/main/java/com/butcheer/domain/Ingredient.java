package com.butcheer.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Butcheer on 2019-04-02 13:17
 */
@Entity
public class Ingredient {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String description;
   private BigDecimal amount;
   //todo
//   private UnitOfMeasure uom;

   @ManyToOne
   private Recipe recipe;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public BigDecimal getAmount() {
      return amount;
   }

   public void setAmount(BigDecimal amount) {
      this.amount = amount;
   }

   public Recipe getRecipe() {
      return recipe;
   }

   public void setRecipe(Recipe recipe) {
      this.recipe = recipe;
   }
   

}