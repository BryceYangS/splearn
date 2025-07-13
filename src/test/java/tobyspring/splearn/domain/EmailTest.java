package tobyspring.splearn.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void equality() {
		var email1 = new Email("test@gmaill.com");
		var email2 = new Email("test@gmaill.com");

		assertThat(email1).isEqualTo(email2);
	}

}