package org.improving.battleship.DataBaseSql;

import org.improving.battleship.Coordinates;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Map {

    private final JdbcTemplate jdbcTemplate;

    public Map(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Coordinates> findAll() {
        try {
            List<Coordinates> coordinates = jdbcTemplate.query("SELECT * FROM battlefieldgame.gamemap Id as CoorId;",
                    (result, rowNum) -> {
                        Coordinates coordinates1 = new Coordinates();
                        coordinates1.setId(result.getInt("Id"));
                        coordinates1.setA(result.getString("A"));
                        coordinates1.setB(result.getString("B"));
                        coordinates1.setC(result.getString("C"));
                        coordinates1.setD(result.getString("D"));
                        coordinates1.setE(result.getString("E"));
                        coordinates1.setF(result.getString("F"));
                        coordinates1.setG(result.getString("G"));

//                        if (result.getInt("CoorId") != null) {
//                            CoorId coorId = new Coordinates();
//                            coorId.setInt(result.getInt("1"));
//                            coorId.setInt(result.getInt("2"));
//                            coorId.setInt(result.getInt("3"));
//                            coorId.setInt(result.getInt("4"));
//                            coorId.setInt(result.getInt("5"));
//                            coorId.setInt(result.getInt("6"));
//                            coorId.setInt(result.getInt("7"));


                            //fix the Int


//                            if (null != dropItem) {
//                                adversary.setItem(Arrays
//                                        .stream(UniqueItems.values())
//                                        .filter(item -> item.getName().equals(dropItem))
//                                        .findFirst()
//                                        .orElse(null)
//                                );
//                            }
//                            coordinates1.setA(coordinates2);
                        }
                        return coordinates1;
                    });
            return coordinates;

        } catch (DataAccessException e) {
            System.out.println("Exception in JDBC: " + e.getMessage());
            return null;
        }
    }
}
