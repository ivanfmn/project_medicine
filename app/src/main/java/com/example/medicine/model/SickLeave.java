package com.example.medicine.model;

import java.io.Serializable;
import java.util.List;

public class SickLeave implements Serializable {

    private String diagnosis;
    private String startSickLeave;
    private String endSickLeave;
    private Integer amountRecipes;
    private Boolean goToWork;
    private List<Recipe> recipes;

    public void setDiagnosis(String Diagnosis) {
        diagnosis = Diagnosis;
    }

    public void setStartEndSickLeave(String Start, String End) {
        startSickLeave = Start;
        endSickLeave = End;
    }

    private void setAmountRecipe(List<Recipe> Recipes) {
        amountRecipes = Recipes.size();
    }

    public void setGoToWork(Boolean YON) {
        goToWork = YON;
    }

    public void setRecipes(List<Recipe> Recipes) {
        recipes = Recipes;
        setAmountRecipe(Recipes);
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getStartSickLeave() {
        return startSickLeave;
    }

    public String getEndSickLeave() {
        return endSickLeave;
    }

    public Integer getAmountRecipe() {
        return amountRecipes;
    }

    public Boolean getGoToWork() {
        return goToWork;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
