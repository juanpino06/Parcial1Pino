package com.example.service;
import com.example.model.Sighting;
import com.example.model.Expedition;
import com.example.repository.ExpeditionRepository;
import com.example.repository.SightingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SightingService {
    private SightingRepository sightingRepository;
    private ExpeditionRepository expeditionRepository;

    @Autowired
    public SightingService(
            SightingRepository sightingRepository,
            ExpeditionRepository expeditionRepository
    ) {
        this.sightingRepository = new SightingRepository();
        this.expeditionRepository = new ExpeditionRepository();
    }

    public Sighting save(Sighting sighting) {
        if (sighting == null) {
            throw new IllegalArgumentException(
                    "Sighting cannot be null"
            );
        }
        String sightingCode = sighting.getSightingCode();

        if (sightingCode == null || sightingCode.isBlank()) {
            throw new IllegalArgumentException(
                    "Sighting code cannot be empty"
            );
        }
        Sighting existingSighting=
                sightingRepository.findBySightingCode(sighting);

        if (existingSighting != null) {
            throw new IllegalArgumentException(
                    "A mission log with this log code already exists"
            );
        }

        Integer threatLevel = missionLog.getThreatLevel();

        if (threatLevel == null
                || threatLevel < 1
                || threatLevel > 10) {
            throw new IllegalArgumentException(
                    "Threat level must be between 1 and 10"
            );
        }

        Integer starshipId = missionLog.getStarshipId();

        if (starshipId == null) {
            throw new IllegalArgumentException(
                    "Starship ID cannot be null"
            );
        }

        Starship starship =
                starshipRepository.findById(starshipId);

        if (starship == null) {
            throw new IllegalArgumentException(
                    "The specified starship does not exist"
            );
        }

        if ("Decommissioned".equalsIgnoreCase(
                starship.getStatus()
        )) {
            throw new IllegalStateException(
                    "Mission logs cannot be registered "
                            + "for a decommissioned starship"
            );
        }

        return missionLogRepository.save(missionLog);
    }

}



