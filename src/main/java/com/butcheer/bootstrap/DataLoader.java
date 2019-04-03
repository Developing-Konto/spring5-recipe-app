package com.butcheer.bootstrap;

import com.butcheer.domain.Difficulty;
import com.butcheer.domain.Ingredient;
import com.butcheer.domain.Notes;
import com.butcheer.domain.Recipe;
import com.butcheer.repositories.CategoryRepository;
import com.butcheer.repositories.RecipeRepository;
import com.butcheer.repositories.UnitOfMeasureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by Butcheer on 2019-04-03 11:44
 */
@Component
public class DataLoader implements CommandLineRunner {

   private CategoryRepository categoryRepository;
   private RecipeRepository recipeRepository;
   private UnitOfMeasureRepository unitOfMeasureRepository;


   public DataLoader(CategoryRepository categoryRepository,
                     RecipeRepository recipeRepository,
                     UnitOfMeasureRepository unitOfMeasureRepository) {
      this.categoryRepository = categoryRepository;
      this.recipeRepository = recipeRepository;
      this.unitOfMeasureRepository = unitOfMeasureRepository;
   }

   @Override
   public void run(String... args) throws Exception {
      loadData();
   }

   private void loadData() {

      Recipe tacoRecipe = new Recipe();

      tacoRecipe.setDescription("Spicy Grilled Chicken Taco");
      tacoRecipe.setCookTime(9);
      tacoRecipe.setPrepTime(20);
      tacoRecipe.setDifficulty(Difficulty.MODERATE);
      tacoRecipe
         .setDirections("1 Prepare a gas or charcoal grill for medium-high, direct heat" +
                           ".\n" +
                           "2 Make the marinade and coat the chicken: In a large bowl, " +
                           "stir together the chili powder, oregano, cumin, sugar, " +
                           "salt, garlic and orange zest. Stir in the orange juice and " +
                           "olive oil to make a loose paste. Add the chicken to the " +
                           "bowl and toss to coat all over. Set aside to marinate while" +
                           " the grill heats and you prepare the rest of the toppings" +
                           ".\n" +
                           "3 Grill the chicken: Grill the chicken for 3 to 4 minutes " +
                           "per side, or until a thermometer inserted into the thickest" +
                           " part of the meat registers 165F. Transfer to a plate and " +
                           "rest for 5 minutes.\n" +
                           "4 Warm the tortillas: Place each tortilla on the grill or " +
                           "on a hot, dry skillet over medium-high heat. As soon as you" +
                           " see pockets of the air start to puff up in the tortilla, " +
                           "turn it with tongs and heat for a few seconds on the other " +
                           "side. Wrap warmed tortillas in a tea towel to keep them " +
                           "warm until serving.\n" +
                           "5 Assemble the tacos: Slice the chicken into strips. On " +
                           "each tortilla, place a small handful of arugula. Top with " +
                           "chicken slices, sliced avocado, radishes, tomatoes, and " +
                           "onion slices. Drizzle with the thinned sour cream. Serve " +
                           "with lime wedges.\n");


      tacoRecipe.setServings(4);

      tacoRecipe.setSource("www.simplyrecipes.com");
      tacoRecipe
         .setUrl("https://www.simplyrecipes.com/recipes/spicy_grilled_chicken_tacos/");

      tacoRecipe.setImage(null);


      Notes tacoNotes = new Notes();
      tacoNotes
         .setRecipeNotes("We have a family motto and it is this: Everything goes better in a " +
                            "tortilla.\n" +
                            "Any and every kind of leftover can go inside a warm tortilla, " +
                            "usually with a healthy dose of pickled jalapenos. I can always sniff" +
                            " out a late-night snacker when the aroma of tortillas heating in a " +
                            "hot pan on the stove comes wafting through the house.\n" +
                            "Today’s tacos are more purposeful – a deliberate meal instead of a " +
                            "secretive midnight snack!\n" +
                            "First, I marinate the chicken briefly in a spicy paste of ancho " +
                            "chile powder, oregano, cumin, and sweet orange juice while the grill" +
                            " is heating. You can also use this time to prepare the taco toppings" +
                            ".\n" +
                            "Grill the chicken, then let it rest while you warm the tortillas. " +
                            "Now you are ready to assemble the tacos and dig in. The whole meal " +
                            "comes together in about 30 minutes!");

      tacoNotes.setRecipe(tacoRecipe);

      tacoNotes.setRecipe(tacoRecipe);
      tacoRecipe.setNotes(tacoNotes);

      tacoRecipe
         .getIngredients()
         .add(new Ingredient("ancho chili powder",
                             new BigDecimal(2),
                             unitOfMeasureRepository
                                .findByDescription("Tablespoon")
                                .get(),
                             tacoRecipe));

      tacoRecipe
         .getIngredients()
         .add(new Ingredient("dried oregano",
                             new BigDecimal(1),
                             unitOfMeasureRepository
                                .findByDescription("Teaspoon")
                                .get(),
                             tacoRecipe));

      tacoRecipe
         .getIngredients()
         .add(new Ingredient("garlic, finely chopped",
                             new BigDecimal(1),
                             unitOfMeasureRepository
                                .findByDescription("Clove")
                                .get(),
                             tacoRecipe));

      tacoRecipe
         .getIngredients()
         .add(new Ingredient("skinless, boneless chicken thighs (1 1/4 pounds)",
                             new BigDecimal(5),
                             unitOfMeasureRepository
                                .findByDescription("Item")
                                .get(),
                             tacoRecipe));


      tacoRecipe.getCategories().add(categoryRepository.findByDescription("Dinner").get());
      tacoRecipe.getCategories().add(categoryRepository.findByDescription("Chicken").get());

      recipeRepository.save(tacoRecipe);


      Recipe guacamoleRecipe = new Recipe();
      guacamoleRecipe.setDescription(" Perfect Guacamole");
      guacamoleRecipe.setDifficulty(Difficulty.EASY);
      guacamoleRecipe.setCookTime(0);
      guacamoleRecipe.setPrepTime(10);
      guacamoleRecipe.setServings(2);
      guacamoleRecipe.setSource("www.simplyrecipes.com");
      guacamoleRecipe.setUrl("https://www.simplyrecipes.com/recipes/perfect_guacamole/");
      guacamoleRecipe.setImage(null);
      guacamoleRecipe
         .setDirections(
            "1 Cut avocado, remove flesh: Cut the avocados in half. Remove seed. " +
               "Score the inside of the avocado with a blunt knife and scoop out the" +
               " flesh with a spoon. (See How to Cut and Peel an Avocado.) Place in " +
               "a bowl.\n" +
               "2 Mash with a fork: Using a fork, roughly mash the avocado. (Don't " +
               "overdo it! The guacamole should be a little chunky.)\n" +
               "3 Add salt, lime juice, and the rest: Sprinkle with salt and lime " +
               "(or lemon) juice. The acid in the lime juice will provide some " +
               "balance to the richness of the avocado and will help delay the " +
               "avocados from turning brown. Add the chopped onion, cilantro, black " +
               "pepper, and chiles. Chili peppers vary individually in their hotness" +
               ". So, start with a half of one chili pepper and add to the guacamole" +
               " to your desired degree of hotness. Remember that much of this is " +
               "done to taste because of the variability in the fresh ingredients. " +
               "Start with this recipe and adjust to your taste.\n" +
               "4 Cover with plastic and chill to store: Place plastic wrap on the " +
               "surface of the guacamole cover it and to prevent air reaching it. " +
               "(The oxygen in the air causes oxidation which will turn the " +
               "guacamole brown.) Refrigerate until ready to serve. Chilling " +
               "tomatoes hurts their flavor, so if you want to add chopped tomato to" +
               " your guacamole, add it just before serving.");
      Notes guacamoleNotes = new Notes();
      guacamoleNotes.setRecipeNotes("For a very quick guacamole just take a 1/4 cup of salsa " +
                                       "and mix it in with your mashed avocados.\n" +
                                       "Feel free to experiment! One classic Mexican guacamole " +
                                       "has pomegranate seeds and chunks of peaches in it (a " +
                                       "Diana Kennedy favorite). Try guacamole with added " +
                                       "pineapple, mango, or strawberries.\n" +
                                       "The simplest version of guacamole is just mashed avocados" +
                                       " with salt. Don't let the lack of availability of other " +
                                       "ingredients stop you from making guacamole.\n" +
                                       "To extend a limited supply of avocados, add either sour " +
                                       "cream or cottage cheese to your guacamole dip. Purists " +
                                       "may be horrified, but so what? It tastes great.\n" +
                                       "\n");
      guacamoleNotes.setRecipe(guacamoleRecipe);
      guacamoleRecipe.setNotes(guacamoleNotes);


      guacamoleRecipe.getIngredients()
                     .add(new Ingredient("ripe avocados",
                                         new BigDecimal(2),
                                         unitOfMeasureRepository
                                            .findByDescription("Item")
                                            .get(),
                                         guacamoleRecipe));
      guacamoleRecipe.getIngredients()
                     .add(new Ingredient("Kosher salt",
                                         new BigDecimal(1),
                                         unitOfMeasureRepository
                                            .findByDescription("Teaspoon")
                                            .get(),
                                         guacamoleRecipe));
      guacamoleRecipe.getIngredients()
                     .add(new Ingredient("reshly grated black pepper",
                                         new BigDecimal(1),
                                         unitOfMeasureRepository
                                            .findByDescription("Dash")
                                            .get(),
                                         guacamoleRecipe));
      guacamoleRecipe.getIngredients()
                     .add(new Ingredient("minced red onion or thinly sliced green onion",
                                         new BigDecimal(2),
                                         unitOfMeasureRepository
                                            .findByDescription("Tablespoon")
                                            .get(),
                                         guacamoleRecipe));

      guacamoleRecipe.getCategories().add(categoryRepository.findByDescription("Mexican").get());
      guacamoleRecipe.getCategories().add(categoryRepository.findByDescription("Vegetarian").get());


      recipeRepository.save(guacamoleRecipe);


   }

}
