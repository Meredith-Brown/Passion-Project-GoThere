package mer.zipcoder.passionproject.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TripLocation.class)
public abstract class TripLocation_ {

	public static volatile SingularAttribute<TripLocation, Trip> trip;
	public static volatile SingularAttribute<TripLocation, Location> location;
	public static volatile SingularAttribute<TripLocation, Long> id;

	public static final String TRIP = "trip";
	public static final String LOCATION = "location";
	public static final String ID = "id";

}

