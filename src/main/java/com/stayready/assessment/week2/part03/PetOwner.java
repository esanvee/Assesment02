package com.stayready.assessment.week2.part03;


public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

     String name;
     Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        
        this.pets = pets;
        if(pets == null)
            this.pets = new Pet[0];
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        //Make a new array for the pet?? Not very efficent
        
        Pet[] newPets = new Pet[pets.length+1];

        
        for (int i = 0; i <= pets.length; i++) {
    
                newPets[i] = pets[i];
                
        }
        newPets[newPets.length] = pet;

        this.pets = newPets;
        
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        //Find and nullify pet
        for (int i = 0; i <= pets.length; i++) {
            if (pets[i] == pet){

                pets[i] = null;
                break;
            }


        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        String ownerName = pet.getOwner().getName();

        if (ownerName == name){
            return true;
        }

        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        int temp = pets[0].getAge(); //getFirstAge
        int newNum = 0;

        for (int i = 0; i < pets.length; i++){

            newNum = pets[i].getAge();
            
            if (newNum < temp){
                temp = newNum;
            }
        }
        return temp;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int temp = pets[0].getAge(); //getFirstAge
        int newNum = 0;

        for (int i = 0; i < pets.length; i++){

            newNum = pets[i].getAge();
            
            if (newNum > temp){
                temp = newNum;
            }
        }
        return temp;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int newNum = 0;

        for (int i = 0; i < pets.length; i++){

            newNum = pets[i].getAge();
    
        }
        newNum = newNum/pets.length;
        
        return (float)newNum;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
