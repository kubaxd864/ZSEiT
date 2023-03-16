package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CargoRepository {

    List<Cargo> cargoList;

    CargoRepository() {
        this.cargoList = new ArrayList<>();
    }

    void addCargo(Cargo cargo) {
        cargoList.add(cargo);
    }

    void removeCargo(Cargo cargo) {
        cargoList.remove(cargo);
    }

    Optional<Cargo> findCargoByName(String name) {
        return cargoList.stream().filter(cargo -> cargo.getName().equals(name)).findFirst();
    }

}
