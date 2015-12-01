/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This controller checks with the database to see if the student exists
 * in the database.  It then returns a boolean value of the existence of the
 * student.
 * @author Jonathan
 */

//DBMgr reference might need to change if named differently
public class LoginController {
    
    public boolean login(int stID)
    {
        return DbMgr.stduentExists(stID);
    }
    
}
