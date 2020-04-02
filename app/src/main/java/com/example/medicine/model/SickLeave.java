package com.example.medicine.model;

import java.io.Serializable;
import java.util.List;

public class SickLeave implements Serializable {

    private int id;
    private String diagnosis;
    private String startSickleave;
    private String endSickleave;
    private Integer recipesAmount;
    private Boolean workPermission;
    private List<Recipe> recipes;

    public SickLeave(int id,
                     String diagnosis,
                     String startSickleave,
                     String endSickleave,
                     Integer recipesAmount,
                     Boolean workPermission,
                     List<Recipe> recipes) {
        this.diagnosis = diagnosis;
        this.startSickleave = startSickleave;
        this.endSickleave = endSickleave;
        this.recipesAmount = recipesAmount;
        this.workPermission = workPermission;
        this.recipes = recipes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setStartEndSickLeave(String start, String end) {
        startSickleave = start;
        endSickleave = end;
    }

    private void setAmountRecipe(List<Recipe> recipes) {
        recipesAmount = recipes.size();
    }

    public void setWorkPermission(Boolean isWorkPermission) {
        workPermission = isWorkPermission;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
        setAmountRecipe(recipes);
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getStartSickleave() {
        return startSickleave;
    }

    public String getEndSickleave() {
        return endSickleave;
    }

    public Integer getAmountRecipe() {
        return recipesAmount;
    }

    public Boolean getWorkPermission() {
        return workPermission;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
