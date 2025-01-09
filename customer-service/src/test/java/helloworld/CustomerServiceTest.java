/*
 * package helloworld;
 * 
 * import static org.junit.Assert.assertEquals; import static
 * org.junit.Assert.assertNotNull; import static org.junit.Assert.assertTrue;
 * import org.junit.Test;
 * 
 * public class CustomerServiceTest { //@Test public void successfulResponse() {
 * CustomerService app = new CustomerService(); GatewayResponse result =
 * (GatewayResponse) app.handleRequest(null, null); assertEquals(200,
 * result.getStatusCode()); assertEquals("application/json",
 * result.getHeaders().get("Content-Type")); String content = result.getBody();
 * assertNotNull(content); assertTrue(content.contains("\"message\""));
 * assertTrue(content.contains("\"hello world\""));
 * assertTrue(content.contains("\"location\"")); } }
 */