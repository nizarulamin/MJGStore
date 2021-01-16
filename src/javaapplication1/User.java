/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.StringTokenizer;

/**
 *
 * @author acer
 */
public class User {
        String name;
        String staffID;
        String phoneNum;
        String user;
        String pass;

        public User(String name, String staffID, String phoneNum, String user, String pass) {
            this.name = name;
            this.staffID = staffID;
            this.phoneNum = phoneNum;
            this.user = user;
            this.pass = pass;
        }
        
        public User(String line) {
            StringTokenizer st = new StringTokenizer(line,";");
            this.name = st.nextToken();
            this.staffID = st.nextToken();
            this.phoneNum = st.nextToken();
            this.user  = st.nextToken();
            this.pass = st.nextToken();
        }

        public String getName() {
            return name;
        }

        public String getStaffID() {
            return staffID;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public String getUser() {
            return user;
        }

        public String getPass() {
            return pass;
        }
    }
