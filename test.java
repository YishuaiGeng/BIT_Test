import static org.junit.Assert.*;

// assert
 Assert.assertEquals
assertNotSame

package com.github.ngoanh2n.asserts.csv;


wassert
  
assert (customAssertion instanceof SampleAssertion);

/**
 * @param indexes the expected column indexes which assert or compare
 * @return {@link CsvComparisonOptions.Builder}
 */

boolean authenticated = false;
if(assertion.isUsePrivateKey()) {
    String privateKeyText = context.expandVariable(assertion.getPrivateKey(), vars);
    if(password != null) {
        authenticated = conn.authenticateWithPublicKey(username, privateKeyText.toCharArray(), password);
    } else {
        authenticated = conn.authenticateWithPublicKey(username, privateKeyText.toCharArray(), null);
    }
} else  {
    authenticated = conn.authenticateWithPassword(username, password);
}

if(!authenticated) {
    conn.close();
    audit.logAndAudit(Messages.EXCEPTION_WARNING_WITH_MORE_INFO, "Failed to authenticate with the remote server.");
    return CustomAssertionStatus.FAILED;
}
