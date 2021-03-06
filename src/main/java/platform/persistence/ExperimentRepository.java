package platform.persistence;

import platform.model.Experiment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.ArrayList;

@RepositoryRestController
public interface ExperimentRepository extends CrudRepository<Experiment, Long> {
    ArrayList<Experiment> findByExperimentDefinitionId(long experimentDefinitionId);
}
