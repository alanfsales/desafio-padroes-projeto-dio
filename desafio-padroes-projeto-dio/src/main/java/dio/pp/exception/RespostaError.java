package dio.pp.exception;

import java.time.LocalDateTime;

public class RespostaError {

	private LocalDateTime  timesTamp;
	private String status;
	private String error;
	private String detail;
	
	public RespostaError(LocalDateTime timesTamp, String status, String error, String detail) {
		this.timesTamp = timesTamp;
		this.status = status;
		this.error = error;
		this.detail = detail;
	}

	public LocalDateTime getTimesTamp() {
		return timesTamp;
	}

	public void setTimesTamp(LocalDateTime timesTamp) {
		this.timesTamp = timesTamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}