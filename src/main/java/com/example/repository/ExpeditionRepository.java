package com.example.repository;
import com.example.model.Expedition;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpeditionRepository {

    private final List<Expedition> expeditions;

    public ExpeditionRepository() {
        expeditions = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        Expedition expedition1 = new Expedition();
        expedition1.setId(1);
        expedition1.setName("Expedition 1");
        expedition1.setCode("Exped1");
        expedition1.setRegion("Valle");
        expedition1.setBaseCamp("Cali");
        expedition1.setLeader("Juan");
        expeditions.add(expedition1);

        Expedition expedition2 = new Expedition();
        expedition2.setId(2);
        expedition2.setName("Expedition 2");
        expedition2.setCode("Exped2");
        expedition2.setRegion("Narino");
        expedition2.setBaseCamp("Pasto");
        expedition2.setLeader("Valentina");
        expeditions.add(expedition2);
    }
}