
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Persona {
    
    /*******************************************************************************
     * Solution for step 4
     *******************************************************************************/
    
    private int id;
    private String name;
    private boolean hasTie, isArmUp, hasClothes,  isEating, hasHorn, hasBelt, walks, isAnimal;
    
    public Persona(int initId,String initName, boolean initHasTie, boolean initIsArmUp, boolean initHasClothes,  boolean initIsEating, boolean initHasHorn, boolean initHasBelt, boolean initWalks, boolean initIsAnimal){
        id = initId;
        name = initName;
        hasTie = initHasTie;
        isArmUp = initIsArmUp;
        hasClothes = initHasClothes;
        isEating = initIsEating;
        hasHorn = initHasHorn;
        hasBelt = initHasBelt;
        walks = initWalks;
        isAnimal = initIsAnimal;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean getHasTie(){
        return hasTie;
    }
    
    public boolean getIsArmUp(){
        return isArmUp;
    }
    
    public boolean getHasClothes(){
        return hasClothes;
    }
    
    public boolean getIsEating(){
        return isEating;
    }
    
    public boolean getHasHorn(){
        return hasHorn;
    }

    public boolean getHasBelt(){
        return hasBelt;
    }
    
    public boolean getWalks(){
        return walks;
    }
    
    public boolean getIsAnimal(){
        return isAnimal;
    }

    
    /*******************************************************************************
     * End of solution for step 4
     *******************************************************************************/
     
    /*******************************************************************************
     * Given code
     *******************************************************************************/
    
    public boolean getValue(String attr) {
        if (attr.equals("tie"))
            return hasTie;
        else if (attr.equals("armup"))
            return isArmUp;
        else if (attr.equals("clothes"))
            return hasClothes;
        else if (attr.equals("eating"))
            return isEating;
        else if (attr.equals("horn"))
            return hasHorn;
        else if (attr.equals("belt"))
            return hasBelt;
        else if (attr.equals("walks"))
            return walks;
        else if (attr.equals("animal"))
            return isAnimal;
        else {
            JOptionPane.showMessageDialog(new JFrame(), "Unknown attribute value: " + attr);
            System.exit(-1);
            return false;
        }
    }
   
    /*******************************************************************************
     * End of given code
     *******************************************************************************/
        
}
