
// This code has been generated by the C2W code generator.
// Do not edit manually!

package BBBHelloWorld;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import c2w.hla.*;

/**
* The ControlMessage class implements the ControlMessage interaction in the
* BBBHelloWorld simulation.
*/
public class ControlMessage extends C2WInteractionRoot {

	/**
	* Default constructor -- creates an instance of the ControlMessage interaction
	* class with default parameter values.
	*/
	public ControlMessage() { }

	
	
	private static int _heating_handle;
	private static int _fan2_handle;
	private static int _cooling_handle;
	private static int _fan1_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "heating" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "heating" parameter
	*/
	public static int get_heating_handle() { return _heating_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "fan2" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "fan2" parameter
	*/
	public static int get_fan2_handle() { return _fan2_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "cooling" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "cooling" parameter
	*/
	public static int get_cooling_handle() { return _cooling_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "fan1" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "fan1" parameter
	*/
	public static int get_fan1_handle() { return _fan1_handle; }
	
	
	
private static boolean _isInitialized = false;

private static int _handle;

/**
* Returns the handle (RTI assigned) of the ControlMessage interaction class.
* Note: As this is a static method, it is NOT polymorphic, and so, if called on
* a reference will return the handle of the class pertaining to the reference,\
* rather than the handle of the class for the instance referred to by the reference.
* For the polymorphic version of this method, use {@link #getClassHandle()}.
*/
public static int get_handle() { return _handle; }

/**
* Returns the fully-qualified (dot-delimited) name of the ControlMessage
* interaction class.
* Note: As this is a static method, it is NOT polymorphic, and so, if called on
* a reference will return the name of the class pertaining to the reference,\
* rather than the name of the class for the instance referred to by the reference.
* For the polymorphic version of this method, use {@link #getClassName()}.
*/
public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.ControlMessage"; }

/**
* Returns the simple name (the last name in the dot-delimited fully-qualified
* class name) of the ControlMessage interaction class.
*/
public static String get_simple_class_name() { return "ControlMessage"; }

private static Set< String > _datamemberNames = new HashSet< String >();
private static Set< String > _allDatamemberNames = new HashSet< String >();

/**
* Returns a set containing the names of all of the non-hidden parameters in the
* ControlMessage interaction class.
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
* ControlMessage interaction class.
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
	_classNameSet.add( "InteractionRoot.C2WInteractionRoot.ControlMessage" );
	_classNameClassMap.put( "InteractionRoot.C2WInteractionRoot.ControlMessage", ControlMessage.class );
	
	_datamemberClassNameSetMap.put( "InteractionRoot.C2WInteractionRoot.ControlMessage", _datamemberNames );
	_allDatamemberClassNameSetMap.put( "InteractionRoot.C2WInteractionRoot.ControlMessage", _allDatamemberNames );

	
	
	_datamemberNames.add( "heating" );
	_datamemberNames.add( "fan2" );
	_datamemberNames.add( "cooling" );
	_datamemberNames.add( "fan1" );
	
	
	_allDatamemberNames.add( "heating" );
	_allDatamemberNames.add( "fan2" );
	_allDatamemberNames.add( "cooling" );
	_allDatamemberNames.add( "fan1" );
	
	
	_datamemberTypeMap.put( "heating", "boolean" );
	_datamemberTypeMap.put( "fan2", "boolean" );
	_datamemberTypeMap.put( "cooling", "boolean" );
	_datamemberTypeMap.put( "fan1", "boolean" );



}


private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ControlMessage:  could not initialize:  ";
protected static void init( RTIambassador rti ) {
	if ( _isInitialized ) return;
	_isInitialized = true;
	
	C2WInteractionRoot.init( rti );
	
	boolean isNotInitialized = true;
	while( isNotInitialized ) {
		try {
			_handle = rti.getInteractionClassHandle( "InteractionRoot.C2WInteractionRoot.ControlMessage" );
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

	_classNameHandleMap.put( "InteractionRoot.C2WInteractionRoot.ControlMessage", get_handle() );
	_classHandleNameMap.put( get_handle(), "InteractionRoot.C2WInteractionRoot.ControlMessage" );
	_classHandleSimpleNameMap.put( get_handle(), "ControlMessage" );

	
	isNotInitialized = true;
	while( isNotInitialized ) {
		try {
						
			_heating_handle = rti.getParameterHandle( "heating", get_handle() );			
			_fan2_handle = rti.getParameterHandle( "fan2", get_handle() );			
			_cooling_handle = rti.getParameterHandle( "cooling", get_handle() );			
			_fan1_handle = rti.getParameterHandle( "fan1", get_handle() );
			isNotInitialized = false;
		} catch ( FederateNotExecutionMember f ) {
			System.err.println( initErrorMessage + "Federate Not Execution Member" );
			f.printStackTrace();
			return;				
		} catch ( InteractionClassNotDefined i ) {
			System.err.println( initErrorMessage + "Interaction Class Not Defined" );
			i.printStackTrace();
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
		
		
	_datamemberNameHandleMap.put( "InteractionRoot.C2WInteractionRoot.ControlMessage,heating", get_heating_handle() );
	_datamemberNameHandleMap.put( "InteractionRoot.C2WInteractionRoot.ControlMessage,fan2", get_fan2_handle() );
	_datamemberNameHandleMap.put( "InteractionRoot.C2WInteractionRoot.ControlMessage,cooling", get_cooling_handle() );
	_datamemberNameHandleMap.put( "InteractionRoot.C2WInteractionRoot.ControlMessage,fan1", get_fan1_handle() );
		
		
	_datamemberHandleNameMap.put( get_heating_handle(), "heating" );
	_datamemberHandleNameMap.put( get_fan2_handle(), "fan2" );
	_datamemberHandleNameMap.put( get_cooling_handle(), "cooling" );
	_datamemberHandleNameMap.put( get_fan1_handle(), "fan1" );
	
}


private static boolean _isPublished = false;
private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ControlMessage:  could not publish:  ";

/**
* Publishes the ControlMessage interaction class for a federate.
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

private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ControlMessage:  could not unpublish:  ";
/**
* Unpublishes the ControlMessage interaction class for a federate.
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
private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ControlMessage:  could not subscribe:  ";
/**
* Subscribes a federate to the ControlMessage interaction class.
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

private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ControlMessage:  could not unsubscribe:  ";
/**
* Unsubscribes a federate from the ControlMessage interaction class.
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
* (that is, the ControlMessage interaction class).
*
* @param handle handle to compare to the value of the handle (RTI assigned) of
* this class (the ControlMessage interaction class).
* @return "true" if "handle" matches the value of the handle of this class
* (that is, the ControlMessage interaction class).
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
	return "ControlMessage("
		
		
		+ "heating:" + get_heating()
		+ "," + "fan2:" + get_fan2()
		+ "," + "cooling:" + get_cooling()
		+ "," + "fan1:" + get_fan1()
		+ ")";
}
	



	
	
	private boolean _heating = false;
	
	private boolean _fan2 = false;
	
	private boolean _cooling = false;
	
	private boolean _fan1 = false;

	
	
	/**
	* Set the value of the "heating" parameter to "value" for this parameter.
	*
	* @param value the new value for the "heating" parameter
	*/
	public void set_heating( boolean value ) { _heating = value; }
	
	/**
	* Returns the value of the "heating" parameter of this interaction.
	*
	* @return the value of the "heating" parameter
	*/
	public boolean get_heating() { return _heating; }
	
	
	/**
	* Set the value of the "fan2" parameter to "value" for this parameter.
	*
	* @param value the new value for the "fan2" parameter
	*/
	public void set_fan2( boolean value ) { _fan2 = value; }
	
	/**
	* Returns the value of the "fan2" parameter of this interaction.
	*
	* @return the value of the "fan2" parameter
	*/
	public boolean get_fan2() { return _fan2; }
	
	
	/**
	* Set the value of the "cooling" parameter to "value" for this parameter.
	*
	* @param value the new value for the "cooling" parameter
	*/
	public void set_cooling( boolean value ) { _cooling = value; }
	
	/**
	* Returns the value of the "cooling" parameter of this interaction.
	*
	* @return the value of the "cooling" parameter
	*/
	public boolean get_cooling() { return _cooling; }
	
	
	/**
	* Set the value of the "fan1" parameter to "value" for this parameter.
	*
	* @param value the new value for the "fan1" parameter
	*/
	public void set_fan1( boolean value ) { _fan1 = value; }
	
	/**
	* Returns the value of the "fan1" parameter of this interaction.
	*
	* @return the value of the "fan1" parameter
	*/
	public boolean get_fan1() { return _fan1; }
	


	protected ControlMessage( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected ControlMessage( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the ControlMessage interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new ControlMessage interaction class instance
	*/
	public ControlMessage( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #ControlMessage( ReceivedInteraction datamemberMap )}, except this
	* new ControlMessage interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new ControlMessage interaction class instance
	* @param logicalTime timestamp for this new ControlMessage interaction class
	* instance
	*/
	public ControlMessage( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new ControlMessage interaction class instance that is a duplicate
	* of the instance referred to by ControlMessage_var.
	*
	* @param ControlMessage_var ControlMessage interaction class instance of which
	* this newly created ControlMessage interaction class instance will be a
	* duplicate
	*/
	public ControlMessage( ControlMessage ControlMessage_var ) {
		super( ControlMessage_var );
		
		
		set_heating( ControlMessage_var.get_heating() );
		set_fan2( ControlMessage_var.get_fan2() );
		set_cooling( ControlMessage_var.get_cooling() );
		set_fan1( ControlMessage_var.get_fan1() );
	}


	/**
	* Returns the value of the parameter whose name is "datamemberName"
	* for this interaction.
	*
	* @param datamemberName name of parameter whose value is to be
	* returned
	* @return value of the parameter whose name is "datamemberName"
	* for this interaction
	*/
	public Object getParameter( String datamemberName ) {
		
		
		
		if (  "heating".equals( datamemberName )  ) return new Boolean( get_heating() );
		else if (  "fan2".equals( datamemberName )  ) return new Boolean( get_fan2() );
		else if (  "cooling".equals( datamemberName )  ) return new Boolean( get_cooling() );
		else if (  "fan1".equals( datamemberName )  ) return new Boolean( get_fan1() );
		else return super.getParameter( datamemberName );
	}
	
	/**
	* Returns the value of the parameter whose handle (RTI assigned)
	* is "datamemberHandle" for this interaction.
	*
	* @param datamemberHandle handle (RTI assigned) of parameter whose
	* value is to be returned
	* @return value of the parameter whose handle (RTI assigned) is
	* "datamemberHandle" for this interaction
	*/
	public Object getParameter( int datamemberHandle ) {
		
				
		
		if ( get_heating_handle() == datamemberHandle ) return new Boolean( get_heating() );
		else if ( get_fan2_handle() == datamemberHandle ) return new Boolean( get_fan2() );
		else if ( get_cooling_handle() == datamemberHandle ) return new Boolean( get_cooling() );
		else if ( get_fan1_handle() == datamemberHandle ) return new Boolean( get_fan1() );
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_heating_handle() ) set_heating( Boolean.parseBoolean( val ) );
		else if ( param_handle == get_fan2_handle() ) set_fan2( Boolean.parseBoolean( val ) );
		else if ( param_handle == get_cooling_handle() ) set_cooling( Boolean.parseBoolean( val ) );
		else if ( param_handle == get_fan1_handle() ) set_fan1( Boolean.parseBoolean( val ) );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "heating".equals( datamemberName )  ) set_heating( Boolean.parseBoolean( val ) );
		else if (  "fan2".equals( datamemberName )  ) set_fan2( Boolean.parseBoolean( val ) );
		else if (  "cooling".equals( datamemberName )  ) set_cooling( Boolean.parseBoolean( val ) );
		else if (  "fan1".equals( datamemberName )  ) set_fan1( Boolean.parseBoolean( val ) );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "heating".equals( datamemberName )  ) set_heating( (Boolean)val );
		else if (  "fan2".equals( datamemberName )  ) set_fan2( (Boolean)val );
		else if (  "cooling".equals( datamemberName )  ) set_cooling( (Boolean)val );
		else if (  "fan1".equals( datamemberName )  ) set_fan1( (Boolean)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_heating_handle(), Boolean.toString( get_heating() ).getBytes() );
		
			datamembers.add( get_fan2_handle(), Boolean.toString( get_fan2() ).getBytes() );
		
			datamembers.add( get_cooling_handle(), Boolean.toString( get_cooling() ).getBytes() );
		
			datamembers.add( get_fan1_handle(), Boolean.toString( get_fan1() ).getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof ControlMessage ) {
			ControlMessage data = (ControlMessage)object;
			
			
				_heating = data._heating;
				_fan2 = data._fan2;
				_cooling = data._cooling;
				_fan1 = data._fan1;
			
		}
	}
}