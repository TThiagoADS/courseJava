package entities.interfaces;

import entities.Contract;

public class ContractService {

	public void processContract(Contract contract, Integer months) {
		double parcela = contract.getTotalValue() / months;
		
		for(int i = 1; i<=months;i++) {
			onlinePaymentService.
		}
		
		
	}
}
