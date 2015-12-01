/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class CheckoutController {
    
    private Tool toCheckOut;
    
    //checks the status of the tool and returns if the tool is available to check out
    public Tool addToCart(int tID)
    {
        toCheckOut = DbMgr.getTool(tID);
        if(toCheckOut.getStatus() == 0)
        {
            return toCheckOut;
        }
        else
        {
            return null;
        }
    }
    
    // checks out tools that are sent through an array
    // will return an array giving the success of the status change of each tool
    public boolean[] checkout(Tool[] checkingOut)
    {
        boolean[] success = new boolean[checkingOut.length];
        
        for (Tool checkingOut1 : checkingOut) 
        {
            int i = 0;
            if(DbMgr.updateTools(checkingOut1.getID())!= null)
                success[i] = true;
            else
                success[i] = false;
            i++;
        }
        return success;
    }
    
}
