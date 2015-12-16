package com.vampireteeth.ws.doubleit;

import javax.jws.WebService;

import com.vampireteeth.ws.contract.doubleit.DoubleItPortType;

@WebService(targetNamespace = "http://www.ws.vampireteeth.com/contract/DoubleIt", 
portName = "DoubleItPort", 
serviceName = "DoubleItService", 
endpointInterface = "com.vampireteeth.ws.contract.doubleit.DoubleItPortType")
public class DoubleItPortTypeImpl implements DoubleItPortType {

	@Override
	public int doubleIt(int numberToDouble) {
		return 2 * numberToDouble;
	}

}
