package org.example;

public class Main {
    public static void main(String[] args) {

        Crud_sql newUser = new Crud_sql();
       // newUser.inserInto("Mael Koukougnon", "Mael@test.com");



        Crud_sql updateUser = new Crud_sql();
    //   updateUser.updateUserEmail(3, "IssacK@test.com");

        Crud_sql deleteUser = new Crud_sql();
      //  deleteUser.deleteUser(1);

        Crud_sql updateUserName = new Crud_sql();
     //   updateUserName.updateUserName(3, "Isaac Koukougnon");

        Crud_sql allUsers = new Crud_sql();
        allUsers.getAllUsers();


    }
}