package com.example.medicine.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SickLeave implements Serializable {

    private String diagnosis;
    private String startSickLeave;
    private String endSickLeave;
    private Integer amountRecipes;
    private Boolean goToWork;
    private List<Recipe> recipes;

    public SickLeave init()
    {
        return new SickLeave();
    }
    public void setDiagnosis(String Diagnosis)
    {
        this.diagnosis = Diagnosis;
    }
    public void setStartEndSickLeave(String Start, String End)
    {
        this.startSickLeave = Start;
        this.endSickLeave = End;
    }
    private void setAmountRecipe(List<Recipe> Recipes)
    {
        this.amountRecipes = Recipes.size();
    }
    public void setGoToWork(Boolean YON)
    {
        this.goToWork = YON;
    }
    public void setRecipes(List<Recipe> Recipes)
    {
        this.recipes = Recipes;
        this.setAmountRecipe(Recipes);
    }
    public void addRecipe(Recipe recipe)
    {
        this.recipes.add(recipe);
    }
    public String getDiagnosis()
    {
        return this.diagnosis;
    }
    public String getStartSickLeave()
    {
        return this.startSickLeave;
    }
    public String getEndSickLeave()
    {
        return this.endSickLeave;
    }
    public Integer getAmountRecipe()
    {
        return this.amountRecipes;
    }
    public Boolean getGoToWork()
    {
        return this.goToWork;
    }

    public List<Recipe> getRecipes()
    {
        return this.recipes;
    }
}
