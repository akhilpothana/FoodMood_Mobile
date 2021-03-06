/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorrelationModel;

import CorrelationController.CorrelationController;
import CrudUserModel.User;
//import userprofilemodel.User;
/**
 * This class correspond to the Model within the MVC structure. This is where the data of this use case
 * Functionality will be stored and reused.
 * @author edgardoreinoso
 */
public class CorrelationModel {
// FIELD
    private CorrelationController foodMoodCo_controller;
    private String [] mood;
    private String recordFood;
    private User usernameID;
    
    /**
     * This is the default constructor for the ModelFoodMoodCorrelation class
     */
    public CorrelationModel(){
    
    }

// METHOD
    /**
     * This class is supposed to return the mood that the user has had based on the food that they have
     * eaten
     * @return the mood
     */
    public String[] getMood() {
        System.out.println("Test get mood");
        return mood;
    }

    /**
     * This class is supposed to set the mood that the user has had based on the food that they have
     * eaten
     * @param mood the mood to set
     */
    public void setMood(String[] mood) {
        this.mood = mood;
    }

    /**
     * This class is supposed to return the user from the User Class that matches the person who is using
     * the system
     * @return the usernameID
     */
    public User getUsernameID() {
        System.out.println("Test get username id");
        return usernameID;
    }
    
    /**
     * This class is supposed to return the a string which is going to be the food that users record in 
     * the view
     * @return the recordFood
     */
    public String getRecordFood() {
        System.out.println("Test get record food");
        return recordFood;
    }

    /**
     * This class is supposed to record the food that user input after a certain meal
     * @param recordFood the recordFood to set
     */
    public void setRecordFood(String recordFood) {
        this.recordFood = recordFood;
    }
}
