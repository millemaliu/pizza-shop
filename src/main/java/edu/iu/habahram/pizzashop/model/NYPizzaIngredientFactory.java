package edu.iu.habahram.pizzashop.model;

public class NYPizzaIngredientFactory
        implements PizzaIngredientFactory
{

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new Reggiano();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Mushrooms(), new Onions_v(), new RedPeppers() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
