package todolist.jwttoken;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void expirationDate1() {
        String secret = "asdfSFS34wfsdfsdfSDSD32dfsddDDerQSNCK34SOWEK5354fdgdf4";
        String name = "John Doe";
        String email = "johndoe@gmail.com";
        String subject = "John";
        int nbrHour = 24;
        JwtTokenType token = JwtToken.createJwtToken(secret, name, email, subject, nbrHour);
        LocalDateTime tomorrow = LocalDateTime.now().plusHours(24);

        assertEquals(tomorrow.getDayOfMonth(), token.getExpirationDate().getDayOfMonth());
        assertNotNull(token.getJwtValue());
    }

    @Test void expirationDate2() {
        String secret = "asdfSFS34wfsdfsdfSDSD32dfsddDDerQSNCK34SOWEK5354fdgdf4";
        String name = "John Doe";
        String email = "johndoe@gmail.com";
        String subject = "John";
        int nbrHour = 24;
        JwtTokenType token = JwtToken.createJwtToken(secret, name, email, subject, nbrHour);
        LocalDateTime tomorrow = LocalDateTime.now().plusHours(48);

        assertNotEquals(tomorrow.getDayOfMonth(), token.getExpirationDate().getDayOfMonth());
        assertNotNull(token.getJwtValue());
    }

    @Test void jwtValueLength() {
        String secret = "asdfSFS34wfsdfsdfSDSD32dfsddDDerQSNCK34SOWEK5354fdgdf4";
        String name = "John Doe";
        String email = "johndoe@gmail.com";
        String subject = "John";
        int nbrHour = 24;
        JwtTokenType token = JwtToken.createJwtToken(secret, name, email, subject, nbrHour);

        assertTrue(token.getJwtValue().length() <= 255);
    }
}
