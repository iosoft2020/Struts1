package jp.iosoft.exception;

public class MyException2 extends RuntimeException {

	private String messageKey;

	private Object[] args;

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

	public MyException2(String messageKey) {
		this(messageKey, null);
	}

	public MyException2(String messageKey, Object arg) {
		this(messageKey, new Object[] { arg });
	}

	public MyException2(String messageKey, Object[] args) {
		this.messageKey = messageKey;
		this.args = args;
	}

}
