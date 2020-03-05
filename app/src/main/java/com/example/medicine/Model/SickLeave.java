package com.example.medicine.Model;

import java.util.ArrayList;

public class SickLeave{

    private String Diagnosis;
    private String StartSickLeave;
    private String EndSickLeave;
    private Integer AmountRecipes;
    private Boolean GoToWork;
    private ArrayList<Recipe> Recipes;

    public SickLeave Init()
    {
        return new SickLeave();
    }
    public void SetDiagnosis(String Diagnosis)
    {
        this.Diagnosis = Diagnosis;
    }
    public void SetStartEndSickLeave(String Start, String End)
    {
        this.StartSickLeave = Start;
        this.EndSickLeave = End;
    }
    private void SetAmountRecipe(ArrayList<Recipe> Recipes)
    {
        this.AmountRecipes = Recipes.size();
    }
    public void SetGoToWork(Boolean YON)
    {
        this.GoToWork = YON;
    }
    public void SetRecipes(ArrayList<Recipe> Recipes)
    {
        this.Recipes = Recipes;
        this.SetAmountRecipe(Recipes);
    }
    public void AddRecipe(Recipe recipe)
    {
        this.Recipes.add(recipe);
    }
    public String GetDiagnosis()
    {
        return this.Diagnosis;
    }
    public String GetStartSickLeave()
    {
        return this.StartSickLeave;
    }
    public String GetEndSickLeave()
    {
        return this.EndSickLeave;
    }
    public Integer GetAmountRecipe()
    {
        return this.AmountRecipes;
    }
    public Boolean GetGoToWork()
    {
        return this.GoToWork;
    }

    public ArrayList<Recipe> GetRecipes()
    {
        return this.Recipes;
    }
}
