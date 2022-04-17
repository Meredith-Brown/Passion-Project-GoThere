package mer.zipcoder.passionproject.repository;

import mer.zipcoder.passionproject.domain.TripLocation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TripLocation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TripLocationRepository extends JpaRepository<TripLocation, Long> {}
