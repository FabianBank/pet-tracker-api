/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import connectivity.DbManager;
import connectivity.QueryManager;

/**
 *
 * @author Fabian
 */

public class PetOwner {
    private String username;
    private String password;
    private QueryManager Qm;
    private DbManager db;
    
    public PetOwner(String username, String password){
        db = new DbManager();
        Qm = new QueryManager();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
