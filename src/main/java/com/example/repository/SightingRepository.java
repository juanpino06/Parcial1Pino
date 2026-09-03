package com.example.repository;
import com.example.model.Sighting;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SightingRepository {

    private final List<Sighting> sightings;

    public SightingRepository() {
        sightings = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        Sighting sighting1 = new Sighting();
        sighting1.setId(1);
        sighting1.setName("ardilla");
        sighting1.setSightingCode("123");
        sighting1.setDescription("brown animal");
        sighting1.setScientificName("Ardillita");
        sighting1.setSightedAt("Icesi");
        sighting1.setLocation("Pance");
        sighting1.setQuantity("1");
        sighting1.setConfidenceLevel(5);
        sighting1.setExpeditionId(1);
        sightings.add(sighting1);

        Sighting sighting2 = new Sighting();
        sighting2.setId(2);
        sighting2.setName("dog");
        sighting2.setSightingCode("456");
        sighting2.setDescription("small animal");
        sighting2.setScientificName("Dog");
        sighting2.setSightedAt("Icesi");
        sighting2.setLocation("Pance");
        sighting2.setQuantity("2");
        sighting2.setConfidenceLevel(5);
        sighting2.setExpeditionId(2);
        sightings.add(sighting2);
    }

}
