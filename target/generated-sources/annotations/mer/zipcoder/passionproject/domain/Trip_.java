package mer.zipcoder.passionproject.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trip.class)
public abstract class Trip_ {

	public static volatile SetAttribute<Trip, TripLocation> triplocations;
	public static volatile SingularAttribute<Trip, LocalDate> endDate;
	public static volatile SingularAttribute<Trip, Long> id;
	public static volatile SingularAttribute<Trip, LocalDate> startDate;

	public static final String TRIPLOCATIONS = "triplocations";
	public static final String END_DATE = "endDate";
	public static final String ID = "id";
	public static final String START_DATE = "startDate";

}

