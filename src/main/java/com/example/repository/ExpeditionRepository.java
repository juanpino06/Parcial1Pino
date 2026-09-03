package com.example.repository;
import com.example.model.Expedition;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
//starship
@Repository
public class ExpeditionRepository {

    private List<Expedition> expeditions = new ArrayList<>() ;

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
        expedition2.setRegion("Valle");
        expedition2.setBaseCamp("Cali");
        expedition2.setLeader("Juan");
        expeditions.add(expedition2);

    }
}
