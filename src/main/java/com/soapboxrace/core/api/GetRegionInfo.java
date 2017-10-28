package com.soapboxrace.core.api;

import com.google.inject.Injector;
import com.soapboxrace.jaxb.http.RegionInfo;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/getregioninfo")
public class GetRegionInfo {
	@EJB
	private Injector injector;
	
	@GET
//	@Secured
	@Produces(MediaType.APPLICATION_XML)
	public RegionInfo getRegionInfo() {
		System.out.println(injector);
		RegionInfo regionInfo = new RegionInfo();
		regionInfo.setCountdownProposalInMilliseconds(3000);
		regionInfo.setDirectConnectTimeoutInMilliseconds(1000);
		regionInfo.setDropOutTimeInMilliseconds(15000);
		regionInfo.setEventLoadTimeoutInMilliseconds(30000);
		regionInfo.setHeartbeatIntervalInMilliseconds(1000);
		regionInfo.setUdpRelayBandwidthInBps(9600);
		regionInfo.setUdpRelayTimeoutInMilliseconds(60000);
		return regionInfo;

	}
}
