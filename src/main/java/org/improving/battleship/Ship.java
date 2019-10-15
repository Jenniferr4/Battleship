package org.improving.battleship;

    public class Ship {
        private String name;
        private Coordinates coordinates;


        public Ship(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public void setLocation(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


}
