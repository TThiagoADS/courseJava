package entities.interfaces;

public interface onlinePaymentService {
	
	private Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	private Double interest(Double amount, Integer months) {
		return amount * (0.01 + months);
	}
	
}
