# BBBHelloWorld
A simple HLA federation that includes a thermostat with a remote temperature sensor running on a BeagleBone Black.

## Compilation and Usage
- clone the repository in the UCEF/development/projects folder of both the UCEF virtual machine and the BeagleBone Black.
- compilation:
	- cd $HOME/UCEF/development
	- ant -Dproject.name=BBBHelloWorld compile-project
- execution:
	- cd $HOME/UCEF/development
	- ant -Dproject.name=BBBHelloWorld run-manager
	- ant -Dproject.name=BBBHelloWorld -Dfederate.name=HVAC run-federate
	- ant -Dproject.name=BBBHelloWorld -Dfederate.name=Thermostat run-federate
	- ant -Dproject.name=BBBHelloWorld -Dfederate.name=TemperatureSensor run-federate