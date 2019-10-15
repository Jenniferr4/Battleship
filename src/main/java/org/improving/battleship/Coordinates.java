package org.improving.battleship;

import java.util.ArrayList;
import java.util.List;

    public class Coordinates {


        private int id;
        private String a = "";
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";
        private String g = "";

        private List<String> tags = new ArrayList<>();


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public String getA() {
            return a;
        }

        public void setA(String name) {
            this.a = name;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public List<String> getTags() {
            return tags;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }

        public String getD() {
            return d;
        }

        public void setD(String d) {
            this.d = d;
        }

        public String getE() {
            return e;
        }

        public void setE(String e) {
            this.e = e;
        }

        public String getF() {
            return f;
        }

        public void setF(String f) {
            this.f = f;
        }

        public String getG() {
            return g;
        }

        public void setG(String g) {
            this.g = g;
        }
    }
