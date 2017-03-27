package com.founder.clpcecif.webservices.test;

import com.founder.clpcecif.webservices.jyx.client.MainEhm;
import com.founder.clpcecif.webservices.jyx.client.ProposalUndwrtRequest;
import com.founder.clpcecif.webservices.jyx.client.ProposalUndwrtResponse;
import com.founder.clpcecif.webservices.jyx.client.ProposalUndwrtService;
import com.founder.clpcecif.webservices.jyx.client.ProposalUndwrtServicePortType;

public class JyxTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProposalUndwrtServicePortType service = new ProposalUndwrtService()
				.getProposalUndwrtServiceHttpSoap11Endpoint();

		ProposalUndwrtRequest param0 = new ProposalUndwrtRequest();
		MainEhm mainEhm=new MainEhm();
		//mainEhm.setSystemCode(value);
		//mainEhm.setCityCode(value);
		ProposalUndwrtResponse responseParam = service.service(param0);
		System.out.println(responseParam.getResultInfo());

	}

}
