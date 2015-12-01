/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class CheckinController {
    
    public boolean updateStatus(int tID)
    {
        DbMgr.updateTools(tID);
        return true;
    }
    
}
