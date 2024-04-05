package model.entities;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractServices {

	private OnlinePaymentService onlinePaymentService;

	public ContractServices(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {

		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {

			LocalDate duaDate = contract.getDate().plusMonths(i);

			double result = onlinePaymentService.interest(basicQuota, i);
			double result2 = onlinePaymentService.paymentFee(result + basicQuota);
			double total = basicQuota + result + result2;
			
			contract.getInstallments().add(new Installment(duaDate, total));
		}
	}

}
