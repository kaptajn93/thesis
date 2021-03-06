package platform.persistence;

import platform.model.DataPoints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.ArrayList;

@RepositoryRestController
public interface DataPointsRepository extends CrudRepository<DataPoints, Long> {
    ArrayList<DataPoints> findByExperimentId(long experimentId);
}
