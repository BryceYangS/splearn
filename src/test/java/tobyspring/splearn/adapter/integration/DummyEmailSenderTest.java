package tobyspring.splearn.adapter.integration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.StdIo;
import org.junitpioneer.jupiter.StdOut;
import tobyspring.splearn.domain.Email;

class DummyEmailSenderTest {

	@Test
	@StdIo
	void dummyMailSender(StdOut out) {
		DummyEmailSender dummyEmailSender = new DummyEmailSender();

		dummyEmailSender.send(new Email("toby@splearn.app"), "Subject", "body");

		assertThat(out.capturedLines()[0])
			.isEqualTo("DummyEmailSender: Sending email: Email[address=toby@splearn.app]");
	}
}