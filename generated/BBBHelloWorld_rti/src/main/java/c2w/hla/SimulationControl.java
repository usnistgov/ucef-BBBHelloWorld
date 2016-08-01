
// This code has been generated by the C2W code generator.
// Do not edit manually!

package c2w.hla;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

/**
* The SimulationControl class implements the SimulationControl interaction in the
* c2w.hla simulation.
*/
public class SimulationControl extends C2WInteractionRoot {

	/**
	* Default constructor -- creates an instance of the SimulationControl interaction
	* class with default parameter values.
	*/
	public SimulationControl() { }

	
	
	
	
	
	
private static boolean _isInitialized = false;

private static int _handle;

/**
* Returns the handle (RTI assigned) of the SimulationControl interaction class.
* Note: As this is a static method, it is NOT polymorphic, and so, if called on
* a reference will return the handle of the class pertaining to the reference,\
* rather than the handle of the class for the instance referred to by the reference.
* For the polymorphic version of this method, use {@link #getClassHandle()}.
*/
public static int get_handle() { return _handle; }

/**
* Returns the fully-qualified (dot-delimited) name of the SimulationControl
* interaction class.
* Note: As this is a static method, it is NOT polymorphic, and so, if called on
* a reference will return the name of the class pertaining to the reference,\
* rather than the name of the class for the instance referred to by the reference.
* For the polymorphic version of this method, use {@link #getClassName()}.
*/
public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.SimulationControl"; }

/**
* Returns the simple name (the last name in the dot-delimited fully-qualified
* class name) of the SimulationControl interaction class.
*/
public static String get_simple_class_name() { return "SimulationControl"; }

private static Set< String > _datamemberNames = new HashSet< String >();
private static Set< String > _allDatamemberNames = new HashSet< String >();

/**
* Returns a set containing the names of all of the non-hidden parameters in the
* SimulationControl interaction class.
* Note: As this is a static method, it is NOT polymorphic, and so, if called on
* a reference will return a set of parameter names pertaining to the reference,\
* rather than the parameter names of the class for the instance referred to by
* the reference.  For the polymorphic version of this method, use
* {@link #getParameterNames()}.
*/
public static Set< String > get_parameter_names() {
	return new HashSet< String >( _datamemberNames );
}


/**
* Returns a set containing the names of all of the parameters in the
* SimulationControl interaction class.
* Note: As this is a static method, it is NOT polymorphic, and so, if called on
* a reference will return a set of parameter names pertaining to the reference,\
* rather than the parameter names of the class for the instance referred to by
* the reference.  For the polymorphic version of this method, use
* {@link #getParameterNames()}.
*/
public static Set< String > get_all_parameter_names() {
	return new HashSet< String >( _allDatamemberNames );
}




static {
	_classNameSet.add( "InteractionRoot.C2WInteractionRoot.SimulationControl" );
	_classNameClassMap.put( "InteractionRoot.C2WInteractionRoot.SimulationControl", SimulationControl.class );
	
	_datamemberClassNameSetMap.put( "InteractionRoot.C2WInteractionRoot.SimulationControl", _datamemberNames );
	_allDatamemberClassNameSetMap.put( "InteractionRoot.C2WInteractionRoot.SimulationControl", _allDatamemberNames );

	
	
	
	
	
	



}


private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimulationControl:  could not initialize:  ";
protected static void init( RTIambassador rti ) {
	if ( _isInitialized ) return;
	_isInitialized = true;
	
	C2WInteractionRoot.init( rti );
	
	boolean isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			_handle = rti.getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.SimulationControl" );
			isNotInitialized = false;
		} catch ( FederateNotExecutionMember f ) {
			System.err.println( initErrorMessage + "Federate Not Execution Member" );
			f.printStackTrace();
			return;				
		} catch ( NameNotFound n ) {
			System.err.println( initErrorMessage + "Name Not Found" );
			n.printStackTrace();
			return;				
		} catch ( Exception e ) {
			e.printStackTrace();
			try { Thread.sleep( 50 ); } catch( Exception e1 ) { }					
		}
	}

	_classNameHandleMap.put( "InteractionRoot.C2WInteractionRoot.SimulationControl", get_handle() );
	_classHandleNameMap.put( get_handle(), "InteractionRoot.C2WInteractionRoot.SimulationControl" );
	_classHandleSimpleNameMap.put( get_handle(), "SimulationControl" );

	
}


private static boolean _isPublished = false;
private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimulationControl:  could not publish:  ";

/**
* Publishes the SimulationControl interaction class for a federate.
*
* @param rti handle to the RTI, usu. obtained through the
* {@link SynchronizedFederate#getRTI()} call
*/
public static void publish( RTIambassador rti ) {
	if ( _isPublished ) return;
	
	init( rti );



	synchronized( rti ) {
		boolean isNotPublished = true;
		while( isNotPublished ) {
			try {
				rti.publishInteractionClass( get_handle() );
				isNotPublished = false;
			} catch ( FederateNotExecutionMember f ) {
				System.err.println( publishErrorMessage + "Federate Not Execution Member" );
				f.printStackTrace();
				return;
			} catch ( InteractionClassNotDefined i ) {
				System.err.println( publishErrorMessage + "Interaction Class Not Defined" );
				i.printStackTrace();
				return;
			} catch ( Exception e ) {
				e.printStackTrace();
				try { Thread.sleep( 50 ); } catch( Exception e1 ) { }
			}
		}
	}
	
	_isPublished = true;
}

private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimulationControl:  could not unpublish:  ";
/**
* Unpublishes the SimulationControl interaction class for a federate.
*
* @param rti handle to the RTI, usu. obtained through the
* {@link SynchronizedFederate#getRTI()} call
*/
public static void unpublish( RTIambassador rti ) {
	if ( !_isPublished ) return;
	
	init( rti );
	synchronized( rti ) {
		boolean isNotUnpublished = true;
		while( isNotUnpublished ) {
			try {
				rti.unpublishInteractionClass( get_handle() );
				isNotUnpublished = false;
			} catch ( FederateNotExecutionMember f ) {
				System.err.println( unpublishErrorMessage + "Federate Not Execution Member" );
				f.printStackTrace();
				return;
			} catch ( InteractionClassNotDefined i ) {
				System.err.println( unpublishErrorMessage + "Interaction Class Not Defined" );
				i.printStackTrace();
				return;
			} catch ( InteractionClassNotPublished i ) {
				System.err.println( unpublishErrorMessage + "Interaction Class Not Published" );
				i.printStackTrace();
				return;
			} catch ( Exception e ) {
				e.printStackTrace();
				try { Thread.sleep( 50 ); } catch( Exception e1 ) { }
			}
		}
	}
	
	_isPublished = false;
}

private static boolean _isSubscribed = false;
private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimulationControl:  could not subscribe:  ";
/**
* Subscribes a federate to the SimulationControl interaction class.
*
* @param rti handle to the RTI, usu. obtained through the
* {@link SynchronizedFederate#getRTI()} call
*/
public static void subscribe( RTIambassador rti ) {
	if ( _isSubscribed ) return;
	
	init( rti );

	
	synchronized( rti ) {
		boolean isNotSubscribed = true;
		while( isNotSubscribed ) {
			try {
				rti.subscribeInteractionClass( get_handle() );
				isNotSubscribed = false;
			} catch ( FederateNotExecutionMember f ) {
				System.err.println( subscribeErrorMessage + "Federate Not Execution Member" );
				f.printStackTrace();
				return;
			} catch ( InteractionClassNotDefined i ) {
				System.err.println( subscribeErrorMessage + "Interaction Class Not Defined" );
				i.printStackTrace();
				return;
			} catch ( Exception e ) {
				e.printStackTrace();
				try { Thread.sleep( 50 ); } catch( Exception e1 ) { }
			}
		}
	}
	
	_isSubscribed = true;
}

private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimulationControl:  could not unsubscribe:  ";
/**
* Unsubscribes a federate from the SimulationControl interaction class.
*
* @param rti handle to the RTI, usu. obtained through the
* {@link SynchronizedFederate#getRTI()} call
*/
public static void unsubscribe( RTIambassador rti ) {
	if ( !_isSubscribed ) return;

	init( rti );
	synchronized( rti ) {
		boolean isNotUnsubscribed = true;
		while( isNotUnsubscribed ) {
			try {
				rti.unsubscribeInteractionClass( get_handle() );
				isNotUnsubscribed = false;
			} catch ( FederateNotExecutionMember f ) {
				System.err.println( unsubscribeErrorMessage + "Federate Not Execution Member" );
				f.printStackTrace();
				return;
			} catch ( InteractionClassNotDefined i ) {
				System.err.println( unsubscribeErrorMessage + "Interaction Class Not Defined" );
				i.printStackTrace();
				return;
			} catch ( InteractionClassNotSubscribed i ) {
				System.err.println( unsubscribeErrorMessage + "Interaction Class Not Subscribed" );
				i.printStackTrace();
				return;
			} catch ( Exception e ) {
				e.printStackTrace();
				try { Thread.sleep( 50 ); } catch( Exception e1 ) { }
			}
		}
	}
	
	_isSubscribed = false;
}

/**
* Return true if "handle" is equal to the handle (RTI assigned) of this class
* (that is, the SimulationControl interaction class).
*
* @param handle handle to compare to the value of the handle (RTI assigned) of
* this class (the SimulationControl interaction class).
* @return "true" if "handle" matches the value of the handle of this class
* (that is, the SimulationControl interaction class).
*/
public static boolean match( int handle ) { return handle == get_handle(); }

/**
* Returns the handle (RTI assigned) of this instance's interaction class .
* 
* @return the handle (RTI assigned) if this instance's interaction class
*/
public int getClassHandle() { return get_handle(); }

/**
* Returns the fully-qualified (dot-delimited) name of this instance's interaction class.
* 
* @return the fully-qualified (dot-delimited) name of this instance's interaction class
*/
public String getClassName() { return get_class_name(); }

/**
* Returns the simple name (last name in its fully-qualified dot-delimited name)
* of this instance's interaction class.
* 
* @return the simple name of this instance's interaction class 
*/
public String getSimpleClassName() { return get_simple_class_name(); }

/**
* Returns a set containing the names of all of the non-hiddenparameters of an
* interaction class instance.
*
* @return set containing the names of all of the parameters of an
* interaction class instance
*/
public Set< String > getParameterNames() { return get_parameter_names(); }

/**
* Returns a set containing the names of all of the parameters of an
* interaction class instance.
*
* @return set containing the names of all of the parameters of an
* interaction class instance
*/
public Set< String > getAllParameterNames() { return get_all_parameter_names(); }

/**
* Publishes the interaction class of this instance of the class for a federate.
*
* @param rti handle to the RTI, usu. obtained through the
* {@link SynchronizedFederate#getRTI()} call
*/
public void publishInteraction( RTIambassador rti ) { publish( rti ); }

/**
* Unpublishes the interaction class of this instance of this class for a federate.
*
* @param rti handle to the RTI, usu. obtained through the
* {@link SynchronizedFederate#getRTI()} call
*/
public void unpublishInteraction( RTIambassador rti ) { unpublish( rti ); }

/**
* Subscribes a federate to the interaction class of this instance of this class.
*
* @param rti handle to the RTI, usu. obtained through the
* {@link SynchronizedFederate#getRTI()} call
*/
public void subscribeInteraction( RTIambassador rti ) { subscribe( rti ); }

/**
* Unsubscribes a federate from the interaction class of this instance of this class.
*
* @param rti handle to the RTI, usu. obtained through the
* {@link SynchronizedFederate#getRTI()} call
*/
public void unsubscribeInteraction( RTIambassador rti ) { unsubscribe( rti ); }



public String toString() {
	return "SimulationControl("
		
		
		+ ")";
}
	



	

	


	protected SimulationControl( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected SimulationControl( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the SimulationControl interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new SimulationControl interaction class instance
	*/
	public SimulationControl( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #SimulationControl( ReceivedInteraction datamemberMap )}, except this
	* new SimulationControl interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new SimulationControl interaction class instance
	* @param logicalTime timestamp for this new SimulationControl interaction class
	* instance
	*/
	public SimulationControl( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new SimulationControl interaction class instance that is a duplicate
	* of the instance referred to by SimulationControl_var.
	*
	* @param SimulationControl_var SimulationControl interaction class instance of which
	* this newly created SimulationControl interaction class instance will be a
	* duplicate
	*/
	public SimulationControl( SimulationControl SimulationControl_var ) {
		super( SimulationControl_var );
		
		
	}


	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof SimulationControl ) {
			SimulationControl data = (SimulationControl)object;
			
			
			
		}
	}
}
