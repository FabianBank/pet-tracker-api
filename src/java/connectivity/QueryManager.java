/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectivity;

import java.sql.ResultSet;
import java.sql.Statement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author Fabian
 */
@Controller
@RequestMapping(value = "/PetOwner")
public class QueryManager {

    String s_Template = "";

    public QueryManager() {
        this.db = new DbManager();
    }
    ResultSet rs;
    Statement st;
    DbManager db;

    //register query
    @RequestMapping(value = "/register", method = POST)
    public ResponseEntity register(@PathVariable("username") String username, @PathVariable("password") String password) {

        String register = "INSERT INTO PetOwner VALUES('"
                + username + "','"
                + password + "','"
                + "')";
        //open
        db.openConnection();
        //insert
        db.doInsert(register);
        //close
        db.closeConnection();
        return new ResponseEntity(HttpStatus.OK);

    }

}
